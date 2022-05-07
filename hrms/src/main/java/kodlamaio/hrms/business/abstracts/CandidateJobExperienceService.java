package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.entities.abstracts.CandidateJobExperience;

import java.util.List;

public interface CandidateJobExperienceService {

    Result addJobExperience(CandidateJobExperience candidateJobExperience);

    DataResult<List<CandidateJobExperience>> findAllByOrderByStartDateAsc();

    DataResult<List<CandidateJobExperience>> sortByExperience();

}
