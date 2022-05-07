package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.core.utilities.verification.result.SuccessDataResult;
import kodlamaio.hrms.core.utilities.verification.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CityDao;
import kodlamaio.hrms.entities.abstracts.City;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {
    private CityDao cityDao;

    public CityManager(CityDao cityDao){
        this.cityDao = cityDao;
    }

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<>(this.cityDao.findAll(), "Veri listelendi.");
    }

    @Override
    public Result add(City city) {
        this.cityDao.save(city);
        return new SuccessResult("Veri kaydedildi.");
    }

    @Override
    public Result updateCity(City city) {
        City newCity = this.cityDao.getById(city.getId());
        newCity.setCityName(city.getCityName());
        this.cityDao.save(newCity);
        return new Result(true, "Veri güncellendi.");
    }
}
