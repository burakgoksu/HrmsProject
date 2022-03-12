package kodlamaio.hrms.Business.concretes;

import kodlamaio.hrms.Business.abstracts.SchoolService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.Core.utilities.results.SuccessResult;
import kodlamaio.hrms.DataAccess.abstracts.SchoolDao;
import kodlamaio.hrms.Entities.concretes.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolManager implements SchoolService {

    private SchoolDao schoolDao;

    @Autowired
    public SchoolManager(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    @Override
    public Result add(School school) {
        this.schoolDao.save(school);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<School>> getAllBySchoolNameContainsAndDepartmentContains(String schoolName, String department) {
        return new SuccessDataResult<List<School>>(this.schoolDao.getAllBySchoolNameContainsAndDepartmentContains(schoolName, department));
    }

    @Override
    public DataResult<List<School>> getAllBySchoolNameContainsOrDepartmentContains(String schoolName, String department) {
        return new SuccessDataResult<List<School>>(this.schoolDao.getAllBySchoolNameContainsOrDepartmentContains(schoolName,department));
    }

    @Override
    public DataResult<List<School>> getAllBySchoolNameContains(String schoolName) {
        return new SuccessDataResult<List<School>>(this.schoolDao.getAllBySchoolNameContains(schoolName));
    }

    @Override
    public DataResult<List<School>> getAllByDepartmentContains(String department) {
        return new SuccessDataResult<List<School>>(this.schoolDao.getAllByDepartmentContains(department));
    }
}
