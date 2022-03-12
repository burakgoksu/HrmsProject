package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.JobAdvertisement;


import java.util.List;

public interface JobAdvertisementService {

    DataResult<List<JobAdvertisement>> getAll();

    DataResult<List<JobAdvertisement>> getAllByJobPosition(String jobPositionName);

    DataResult<List<JobAdvertisement>> getAllByCity(String city);

    DataResult<List<JobAdvertisement>> getAllActive();

    DataResult<List<JobAdvertisement>> getAllByEmployer_CompanyNameAndStatus(String companyName);

    DataResult<List<JobAdvertisement>> getAllSortedByNeededEmployee();

    DataResult<List<JobAdvertisement>> getAllBySalaryBetween(int min,int max);

    DataResult<List<JobAdvertisement>> getByOrderByReleaseDate();

    DataResult<List<JobAdvertisement>> getByOrderByExpirationDate();

    Result add(JobAdvertisement jobAdvertisement);

    Result deactivate(JobAdvertisement jobAdvertisement);
}
