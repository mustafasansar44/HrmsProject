package kodlamaio.hrms.core.utilities.registerValidation;

import kodlamaio.hrms.entities.concretes.User;

public interface RegisterCheckService {
    boolean checkRegister(User user);
}
