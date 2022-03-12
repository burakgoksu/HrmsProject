package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobApplicationService {

   Result add(JobApplication jobApplication);

   DataResult<List<JobApplication>> getAllByJobSeeker_JobSeekerId(int jobSeekerId);

   DataResult<List<JobApplication>> getAll();

}
