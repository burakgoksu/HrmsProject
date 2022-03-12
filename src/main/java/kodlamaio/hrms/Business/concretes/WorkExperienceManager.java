package kodlamaio.hrms.Business.concretes;

import kodlamaio.hrms.Business.abstracts.WorkExperienceService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.Core.utilities.results.SuccessResult;
import kodlamaio.hrms.DataAccess.abstracts.WorkExperienceDao;
import kodlamaio.hrms.Entities.concretes.WorkExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkExperienceManager implements WorkExperienceService {

    private WorkExperienceDao workExperienceDao;

    @Autowired
    public WorkExperienceManager(WorkExperienceDao workExperienceDao) {
        this.workExperienceDao = workExperienceDao;
    }

    @Override
    public Result add(WorkExperience workExperience) {
        this.workExperienceDao.save(workExperience);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<WorkExperience>> getAll() {
        return new SuccessDataResult<List<WorkExperience>>(this.workExperienceDao.findAll());
    }

    @Override
    public DataResult<List<WorkExperience>> getByOrderByEndingYear() {
        return new SuccessDataResult<List<WorkExperience>>(this.workExperienceDao.getByOrderByEndingYear());
    }
}
