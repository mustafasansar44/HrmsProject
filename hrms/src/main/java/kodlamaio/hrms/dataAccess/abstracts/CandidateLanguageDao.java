package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.abstracts.CandidateLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CandidateLanguageDao extends JpaRepository<CandidateLanguage, Integer> {

    @Query("From CandidateLanguage where candidate.id = :candidate")
    List<CandidateLanguage> fetchById(@Param("candidate") Integer candidate);
    
}

/*


 */