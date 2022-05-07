package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.entities.abstracts.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    Result add(Employer employer);
    DataResult<Employer> getByEmailAndPassword(String email, String password);
}
