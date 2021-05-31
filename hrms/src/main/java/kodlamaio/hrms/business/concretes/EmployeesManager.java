package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployeesService;
import kodlamaio.hrms.core.utilities.verification.DataResult;
import kodlamaio.hrms.core.utilities.verification.Result;
import kodlamaio.hrms.core.utilities.verification.SuccessDataResult;
import kodlamaio.hrms.core.utilities.verification.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeesDao;
import kodlamaio.hrms.entities.concretes.Employees;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesManager implements EmployeesService {

    private EmployeesDao employeesDao;
    public EmployeesManager(EmployeesDao employeesDao){
        this.employeesDao = employeesDao;
    }

    @Override
    public DataResult<List<Employees>> getAll() {
        return new SuccessDataResult<List<Employees>>(this.employeesDao.findAll(), "İş arayanlar listelendi.");
    }

    @Override
    public Result add(Employees employees) {
        this.employeesDao.save(employees);
        return new SuccessResult("Veri kaydedildi.");
    }
}
