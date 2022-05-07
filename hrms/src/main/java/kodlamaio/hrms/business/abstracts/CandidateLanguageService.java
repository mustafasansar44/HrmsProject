package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.entities.abstracts.CandidateLanguage;

import java.util.List;

public interface CandidateLanguageService {

    DataResult<List<CandidateLanguage>> fetchById(int candidateId);



}
