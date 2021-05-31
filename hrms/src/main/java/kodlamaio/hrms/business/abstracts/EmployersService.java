package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.verification.DataResult;
import kodlamaio.hrms.core.utilities.verification.Result;
import kodlamaio.hrms.entities.concretes.Employers;

import java.util.List;

public interface EmployersService {
    DataResult<List<Employers>> getAll();
    Result add(Employers employers);
}
