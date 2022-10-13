package yash.oas.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yash.oas.models.User;
import yash.oas.models.UserRole;
import yash.oas.repositories.RoleRepository;
import yash.oas.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	
	// Creating User
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User local = this.userRepository.findByUsername(user.getUsername());

		if (local != null) {
			System.out.println("User is already there!!!");
			throw new Exception("User is alrady Present!!!");
		}
		// creates User
		else {
			for (UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local = this.userRepository.save(user);

		}
		return local;
	}

	//getting user by UserName
	@Override
	public User getuser(String username) {
		
		System.out.println("Get user Method Called");
		return this.userRepository.findByUsername(username);
	}

	@Override
	public void deleteUser(Long userId) {
		this.userRepository.deleteById(userId);
	}  
}
