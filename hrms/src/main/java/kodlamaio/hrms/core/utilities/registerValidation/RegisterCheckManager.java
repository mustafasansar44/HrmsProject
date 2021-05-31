package kodlamaio.hrms.core.utilities.registerValidation;

import kodlamaio.hrms.entities.concretes.User;

public class RegisterCheckManager implements RegisterCheckService{
    @Override
    public boolean checkRegister(User user) {
        return true;
    }

}
