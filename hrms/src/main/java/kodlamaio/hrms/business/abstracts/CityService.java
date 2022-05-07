package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.entities.abstracts.City;

import java.util.List;

public interface CityService {

    DataResult<List<City>> getAll();

    Result add(City city);

    Result updateCity(City city);
}
