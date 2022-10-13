package yash.oas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import yash.oas.services.UserService;

@SpringBootApplication
public class ExamserverApplication {

	@Autowired
	private UserService userService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	
	}

//	@Override
//	public void run(String... args) throws Exception {
//       System.out.println("Starting Code");	
//       
////       User user=new User();
////       user.setFirstName("Pranit");
////       user.setLastName("Sonawane");
////       user.setUsername("Pranu123");
////       user.setPassword("abc");
////       user.setEmail("abc@gmail.com");
////       user.setProfile("default.png");
////       
////       
////       Role role1= new Role();
////       role1.setRoleId(23L);
////       role1.setRoleName("Admin");
////       
////       Set<UserRole> userRoleSet=new HashSet<>();
////       UserRole userRole=new UserRole();
////       userRole.setRole(role1);
////       userRole.setUser(user);
////       userRoleSet.add(userRole);
////       User user1=this.userService.createUser(user, userRoleSet);
////       System.out.println( user1.getUsername() );
//	}
	
}
