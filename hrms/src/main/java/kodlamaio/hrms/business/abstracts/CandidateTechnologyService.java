package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.entities.abstracts.CandidateTechnology;

public interface CandidateTechnologyService {
    Result addTechnology(CandidateTechnology candidateTechnology);
}
