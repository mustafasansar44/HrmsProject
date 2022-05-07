package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateEducationService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.core.utilities.verification.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateEducationDao;
import kodlamaio.hrms.entities.abstracts.CandidateEducation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateEducationManager implements CandidateEducationService {

    private CandidateEducationDao candidateEducationDao;

    public CandidateEducationManager(CandidateEducationDao candidateEducationDao){
        this.candidateEducationDao = candidateEducationDao;
    }

    @Override
    public DataResult<List<CandidateEducation>> getAll() {
        return new SuccessDataResult<>(this.candidateEducationDao.findAll());
    }

    @Override
    public Result add(CandidateEducation candidateEducation) {
        this.candidateEducationDao.save(candidateEducation);
        return new Result(true, "Veri Kaydedildi.");
    }
}
