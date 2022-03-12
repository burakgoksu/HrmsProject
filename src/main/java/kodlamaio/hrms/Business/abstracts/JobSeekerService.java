package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {

    DataResult<List<JobSeeker>> getAll();

    DataResult<JobSeeker> getByIdentityNumber(String identityNumber);

    Result add(JobSeeker jobSeeker);

    DataResult<List<JobSeeker>> getAllBySortedAsc();

    DataResult<List<JobSeeker>> getAllByJobPosition_JobPositionName(String jobPositionName);

    DataResult<JobSeeker> getByJobSeekerId(int jobSeekerId);
}