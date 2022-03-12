package kodlamaio.hrms.DataAccess.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Entities.concretes.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobApplicationDao extends JpaRepository<JobApplication, Integer> {

    List<JobApplication> getAllByJobSeeker_JobSeekerId(int jobSeekerId);

}
