package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.abstracts.CandidateEducation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateEducationDao extends JpaRepository<CandidateEducation, Integer> {
}
