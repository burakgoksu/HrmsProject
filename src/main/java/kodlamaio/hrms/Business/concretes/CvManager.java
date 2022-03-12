package kodlamaio.hrms.Business.concretes;

import kodlamaio.hrms.Business.abstracts.CvService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.Core.utilities.results.SuccessResult;
import kodlamaio.hrms.DataAccess.abstracts.CvDao;
import kodlamaio.hrms.Entities.concretes.Cv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CvManager implements CvService {

    private CvDao cvDao;

    @Autowired
    public CvManager(CvDao cvDao){
        this.cvDao=cvDao;
    }


    @Override
    public Result add(Cv cv) {
        this.cvDao.save(cv);
        return new SuccessResult("Cv'niz eklendi");
    }

    @Override
    public DataResult<List<Cv>> getAll() {
        return new SuccessDataResult<List<Cv>>(this.cvDao.findAll());
    }


    @Override
    public DataResult<List<Cv>> getAllBySchool_SchoolName(String schoolName) {
        return new SuccessDataResult<List<Cv>>(this.cvDao.getAllBySchool_SchoolName(schoolName));
    }

    @Override
    public DataResult<List<Cv>> getByOrderByGraduationDate() {
        return new SuccessDataResult<List<Cv>>(this.cvDao.getByOrderByGraduationDate());
    }

    @Override
    public DataResult<List<Cv>> getByOrderByGraduationDateDesc() {
        return new SuccessDataResult<List<Cv>>(this.cvDao.getByOrderByGraduationDateDesc());
    }

    @Override
    public DataResult<List<Cv>> getByOrderByGraduationDateAsc() {
        return new SuccessDataResult<List<Cv>>(this.cvDao.getByOrderByGraduationDateAsc());
    }

    @Override
    public DataResult<List<Cv>> getAllByAbility_Description(String description) {
        return new SuccessDataResult<List<Cv>>(this.cvDao.getAllByAbility_Description(description));
    }
}
