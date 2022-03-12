package kodlamaio.hrms.Business.concretes;

import kodlamaio.hrms.Business.abstracts.JobApplicationService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.Core.utilities.results.SuccessResult;
import kodlamaio.hrms.DataAccess.abstracts.JobApplicationDao;
import kodlamaio.hrms.Entities.concretes.JobApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationManager implements JobApplicationService {

    private JobApplicationDao jobApplicationDao;

    @Autowired
    public JobApplicationManager(JobApplicationDao jobApplicationDao) {
        this.jobApplicationDao = jobApplicationDao;
    }

    @Override
    public Result add(JobApplication jobApplication) {
        this.jobApplicationDao.save(jobApplication);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<JobApplication>> getAllByJobSeeker_JobSeekerId(int jobSeekerId) {
        return new SuccessDataResult<List<JobApplication>>(this.jobApplicationDao.getAllByJobSeeker_JobSeekerId(jobSeekerId));
    }

    @Override
    public DataResult<List<JobApplication>> getAll() {
        return new SuccessDataResult<List<JobApplication>>(this.jobApplicationDao.findAll());
    }
}
