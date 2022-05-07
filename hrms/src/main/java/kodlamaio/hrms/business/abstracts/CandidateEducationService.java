package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.entities.abstracts.Candidate;
import kodlamaio.hrms.entities.abstracts.CandidateEducation;

import java.util.List;

public interface CandidateEducationService {
    DataResult<List<CandidateEducation>> getAll();
    Result add(CandidateEducation candidateEducation);
}
