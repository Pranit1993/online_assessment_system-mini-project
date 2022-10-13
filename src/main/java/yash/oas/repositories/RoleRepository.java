package yash.oas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import yash.oas.models.Role;
@Repository
public interface RoleRepository  extends JpaRepository<Role , Long> {


}
