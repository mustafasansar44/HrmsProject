package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.core.utilities.verification.result.SuccessDataResult;
import kodlamaio.hrms.core.utilities.verification.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.hrms.entities.abstracts.JobAdvertisement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
    private JobAdvertisementDao jobAdvertisementDao;

    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao){
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAll(), "Veri listelendi.");
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İlanınız HRMS personeli tarafından onaylanınca gösterime açılacaktır.");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByUserId(int userId) {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByUserId(userId), "Veri listelendi.");
    }

    @Override
    public Result setActiveStatus(int id) {
        this.jobAdvertisementDao.setActiveStatus(id);
        return new SuccessResult("Durum değiştirildi.");
    }

    @Override
    public DataResult<JobAdvertisement> getById(int id) {
        return new SuccessDataResult<>(this.jobAdvertisementDao.getById(id));
    }


}
