package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.entities.abstracts.Candidate;
import kodlamaio.hrms.entities.dtos.CandidateCvDto;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CandidateService {

    DataResult<List<Candidate>> getAll();

    DataResult<Candidate> getByFirstName(String firstName);

    Result add(Candidate candidate);

    List<CandidateCvDto> findAll();

    Result updateCandidate(Candidate candidate);

    Candidate findAllById(@Param("id") int id);


}
