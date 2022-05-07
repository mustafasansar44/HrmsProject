package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateJobExperienceService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.core.utilities.verification.result.SuccessDataResult;
import kodlamaio.hrms.core.utilities.verification.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateJobExperienceDao;
import kodlamaio.hrms.entities.abstracts.CandidateJobExperience;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateJobExperienceManager implements CandidateJobExperienceService {

    private CandidateJobExperienceDao candidateJobExperienceDao;

    public CandidateJobExperienceManager(CandidateJobExperienceDao candidateJobExperienceDao){
        this.candidateJobExperienceDao = candidateJobExperienceDao;
    }


    @Override
    public Result addJobExperience(CandidateJobExperience candidateJobExperience) {
        this.candidateJobExperienceDao.save(candidateJobExperience);
        return new SuccessResult("Veri kaydedildi.");
    }

    @Override
    public DataResult<List<CandidateJobExperience>> findAllByOrderByStartDateAsc() {
        return new SuccessDataResult<>(this.candidateJobExperienceDao.findAllByOrderByStartDateAsc());
    }

    @Override
    public DataResult<List<CandidateJobExperience>> sortByExperience() {
        return new SuccessDataResult<>(this.candidateJobExperienceDao.sortByExperience());
    }
}
