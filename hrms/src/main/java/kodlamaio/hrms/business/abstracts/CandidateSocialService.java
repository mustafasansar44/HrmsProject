package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.entities.abstracts.CandidateSocial;

public interface CandidateSocialService {
    Result addSocial(CandidateSocial candidateSocial);
}
