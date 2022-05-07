package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateTechnologyService;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.core.utilities.verification.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateTechnologyDao;
import kodlamaio.hrms.entities.abstracts.CandidateTechnology;
import org.springframework.stereotype.Service;

@Service
public class CandidateTechnologyManager implements CandidateTechnologyService {

    private CandidateTechnologyDao candidateTechnologyDao;

    public CandidateTechnologyManager(CandidateTechnologyDao candidateTechnologyDao){
        this.candidateTechnologyDao = candidateTechnologyDao;
    }

    @Override
    public Result addTechnology(CandidateTechnology candidateTechnology) {
        this.candidateTechnologyDao.save(candidateTechnology);
        return new SuccessResult("Veri kaydedildi.");
    }
}
