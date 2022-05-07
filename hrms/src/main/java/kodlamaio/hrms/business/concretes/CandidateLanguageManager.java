package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateLanguageService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateLanguageDao;
import kodlamaio.hrms.entities.abstracts.CandidateLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateLanguageManager implements CandidateLanguageService {

    private CandidateLanguageDao candidateLanguageDao;

    public CandidateLanguageManager(CandidateLanguageDao candidateLanguageDao){
        this.candidateLanguageDao = candidateLanguageDao;
    }

    @Override
    public DataResult<List<CandidateLanguage>> fetchById(int candidateId) {
        return new SuccessDataResult<>(this.candidateLanguageDao.fetchById(candidateId), "Veri listelendi.");
    }


}
