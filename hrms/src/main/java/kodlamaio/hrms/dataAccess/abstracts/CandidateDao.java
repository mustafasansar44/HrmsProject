package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.entities.abstracts.Candidate;
import kodlamaio.hrms.entities.dtos.CandidateCvDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CandidateDao extends JpaRepository<Candidate, Integer> {

    Candidate getByFirstName(String firstName);

    List<Candidate> findAll(); // Modelmapper

    @Query("from Candidate c where c.id = :id")
    Candidate findAllById(@Param("id") int id);


}


/*

    @Modifying
    @Query("update Candidate c set c.firstName = :firstName where c.id = :id")
    void updateCandidate(@Param(value = "id") int id, @Param(value = "firstName") String firstName);


    @Query("Select new kodlamaio.hrms.entities.dtos.CandidateCvDto(c.id, c.firstName,c.lastName, e.schoolName, e.departmentName, e.startYear, l.languageName, l.languageLevel) " +
            "from Candidate c " +
            "inner join c.candidateEducation e " +
            "inner join c.candidateLanguages l " +
            "where c.id = :id")


    @Query("Select new kodlamaio.hrms.entities.dtos.CandidateCvDto(c.id, c.firstName,c.lastName, e.schoolName, e.departmentName, e.startYear, l.languageName, l.languageLevel) " +
            "from Candidate c " +
            "inner join c.candidateEducation e " +
            "inner join c.candidateLanguages l " +
            "where c.id = :id")
    List<CandidateCvDto> getCandidateCv(@Param("id") Integer id);

 */