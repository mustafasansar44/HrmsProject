package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.abstracts.UserVerification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserVerificationDao extends JpaRepository<UserVerification, Integer> {

}
