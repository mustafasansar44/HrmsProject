package kodlamaio.hrms.business.abstracts;


import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.entities.abstracts.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementService {

    DataResult<List<JobAdvertisement>> getAll();

    Result add(JobAdvertisement jobAdvertisement);

    DataResult<List<JobAdvertisement>> getByUserId(int userId);

    Result setActiveStatus(int id);

    DataResult<JobAdvertisement> getById(int id);

}
