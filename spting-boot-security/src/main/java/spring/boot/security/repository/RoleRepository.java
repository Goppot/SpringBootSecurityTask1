package spring.boot.security.repository;

import org.springframework.data.repository.CrudRepository;
import spring.boot.security.model.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
