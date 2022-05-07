package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateSocialService;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.core.utilities.verification.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateSocialDao;
import kodlamaio.hrms.entities.abstracts.CandidateSocial;
import org.springframework.stereotype.Service;

@Service
public class CandidateSocialManager implements CandidateSocialService {

    private CandidateSocialDao candidateSocialDao;

    public CandidateSocialManager(CandidateSocialDao candidateSocialDao){
        this.candidateSocialDao = candidateSocialDao;
    }

    @Override
    public Result addSocial(CandidateSocial candidateSocial) {
        this.candidateSocialDao.save(candidateSocial);
        return new SuccessResult("Kayıt başarılı.");
    }
}
