package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.entities.abstracts.User;

public interface UserService {
    DataResult<User> getByEmailAndPassword(String email, String password);
}
