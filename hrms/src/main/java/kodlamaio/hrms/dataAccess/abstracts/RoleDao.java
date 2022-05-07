package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.abstracts.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Integer> {
}
