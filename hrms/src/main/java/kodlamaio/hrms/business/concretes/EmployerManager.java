package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.core.utilities.verification.DataResult;
import kodlamaio.hrms.core.utilities.verification.Result;
import kodlamaio.hrms.core.utilities.verification.SuccessDataResult;
import kodlamaio.hrms.core.utilities.verification.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployersDao;
import kodlamaio.hrms.entities.concretes.Employers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployersService {
    private EmployersDao employersDao;

    public EmployerManager(EmployersDao employersDao){
        this.employersDao = employersDao;
    }

    @Override
    public DataResult<List<Employers>> getAll() {
        return new SuccessDataResult<List<Employers>>(this.employersDao.findAll(), "İş verenler listelendi.");
    }

    @Override
    public Result add(Employers employers) {
        this.employersDao.save(employers);
        return new SuccessResult("Veri kaydedildi.");
    }
}
