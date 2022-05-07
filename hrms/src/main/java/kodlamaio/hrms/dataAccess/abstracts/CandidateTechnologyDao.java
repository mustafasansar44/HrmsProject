package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.abstracts.CandidateTechnology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateTechnologyDao extends JpaRepository<CandidateTechnology, Integer> {
}
