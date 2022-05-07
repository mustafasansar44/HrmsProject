package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.UserVerificationService;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.core.utilities.verification.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.UserVerificationDao;
import kodlamaio.hrms.entities.abstracts.User;
import kodlamaio.hrms.entities.abstracts.UserVerification;
import org.springframework.stereotype.Service;

@Service
public class UserVerificationManager implements UserVerificationService {

    private UserVerificationDao userVerificationDao;

    public UserVerificationManager(UserVerificationDao userVerificationDao){
        this.userVerificationDao = userVerificationDao;
    }

    @Override
    public Result addCodeToUser(UserVerification userVerification, User user) {
        return new SuccessDataResult<>(this.userVerificationDao);
    }
}
