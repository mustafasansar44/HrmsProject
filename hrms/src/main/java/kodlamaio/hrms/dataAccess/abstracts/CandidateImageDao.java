package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.abstracts.CandidateImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateImageDao extends JpaRepository<CandidateImage, Integer> {

}
