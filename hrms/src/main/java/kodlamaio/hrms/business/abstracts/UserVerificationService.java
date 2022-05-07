package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.entities.abstracts.User;
import kodlamaio.hrms.entities.abstracts.UserVerification;

public interface UserVerificationService {
    Result addCodeToUser(UserVerification userVerification, User user);
}
