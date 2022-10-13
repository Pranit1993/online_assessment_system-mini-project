package yash.oas.services;

import java.util.Set;

import yash.oas.models.User;
import yash.oas.models.UserRole;

public interface UserService {

	//creating  User
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	//get user by userName
	public User getuser(String username);

    //Delete by userId
	public void deleteUser(Long userId);
	
}

