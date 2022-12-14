package yash.oas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import yash.oas.models.User;
@Repository
public interface UserRepository extends JpaRepository<User , Long> {

	User findByUsername(String username);
	void deleteById(Long userId);

}
