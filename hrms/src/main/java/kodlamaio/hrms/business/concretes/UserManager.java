package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;
import kodlamaio.hrms.entities.abstracts.User;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    public UserManager(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public DataResult<User> getByEmailAndPassword(String email, String password) {
        return new SuccessDataResult<>(this.userDao.getByEmailAndPassword(email, password), "Giriş başarılı.");
    }
}
