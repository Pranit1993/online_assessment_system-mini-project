package yash.oas.controllers;

import java.util.HashSet;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import yash.oas.models.Role;
import yash.oas.models.User;
import yash.oas.models.UserRole;
import yash.oas.services.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	
	//creating User
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		user.setProfile("default.png");
		Set<UserRole> roles=new HashSet<>();
		Role role=new Role();
		role.setRoleId(55L);
		role.setRoleName("NORMAL");
		
		UserRole userRole=new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		roles.add(userRole);
		return this.userService.createUser(user, roles);
		
		
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable ("username")String username) {
		return this.userService.getuser(username);	
	}
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		this.userService.deleteUser(userId);
		
	}
	
	
	
}
