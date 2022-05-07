package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.abstracts.CandidateSocial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateSocialDao extends JpaRepository<CandidateSocial, Integer> {

}
