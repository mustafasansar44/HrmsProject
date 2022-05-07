package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.abstracts.CandidateJobExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateJobExperienceDao extends JpaRepository<CandidateJobExperience, Integer> {

    List<CandidateJobExperience> findAllByOrderByStartDateAsc();

    @Query("From CandidateJobExperience ORDER BY (endDate - startDate) ASC")
    List<CandidateJobExperience> sortByExperience();


}



