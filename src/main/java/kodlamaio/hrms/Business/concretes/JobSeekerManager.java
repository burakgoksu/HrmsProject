package kodlamaio.hrms.Business.concretes;

import kodlamaio.hrms.Business.abstracts.JobSeekerService;
import kodlamaio.hrms.Core.utilities.results.*;
import kodlamaio.hrms.Core.utilities.validation.MernisValidator;
import kodlamaio.hrms.Core.utilities.validation.ValidationService;
import kodlamaio.hrms.DataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.Entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private ValidationService mernisValidatior;
    private JobSeekerDao jobSeekerDao;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao, ValidationService<JobSeeker> validationService){
        this.jobSeekerDao = jobSeekerDao;
        this.mernisValidatior=validationService;
    }



    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"İş arayanlar listelendi");
    }

    @Override
    public DataResult<JobSeeker> getByIdentityNumber(String identityNumber) {
        return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getJobSeekerByIdentityNumber(identityNumber), identityNumber + "Tc Kimlik numarasına ait iş arayanı listelendi!");
    }

    @Override
    public Result add(JobSeeker jobSeeker) {
        this.mernisValidatior.Validate(jobSeeker);
        if (jobSeeker.isStatus()==true){
            this.jobSeekerDao.save(jobSeeker);
            return new SuccessResult("İş arayanı eklendi");
        }
        return new ErrorResult("İş arayan eklenemedi");
    }

    @Override
    public DataResult<List<JobSeeker>> getAllBySortedAsc() {
        Sort sort = Sort.by(Sort.Direction.ASC,"jobPosition");
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(sort));
    }

    @Override
    public DataResult<List<JobSeeker>> getAllByJobPosition_JobPositionName(String jobPositionName) {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.getAllByJobPosition_JobPositionName(jobPositionName));
    }

    @Override
    public DataResult<JobSeeker> getByJobSeekerId(int jobSeekerId) {
        return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getByJobSeekerId(jobSeekerId));
    }
}