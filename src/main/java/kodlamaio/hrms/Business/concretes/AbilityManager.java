package kodlamaio.hrms.Business.concretes;

import kodlamaio.hrms.Business.abstracts.AbilityService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.Core.utilities.results.SuccessResult;
import kodlamaio.hrms.DataAccess.abstracts.AbilityDao;
import kodlamaio.hrms.Entities.concretes.Ability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbilityManager implements AbilityService {

    private AbilityDao abilityDao;

    @Autowired
    public AbilityManager(AbilityDao abilityDao){
        this.abilityDao=abilityDao;
    }

    @Override
    public Result add(Ability ability) {
        this.abilityDao.save(ability);

        return new SuccessResult();
    }

    @Override
    public DataResult<List<Ability>> getAll() {
        return new SuccessDataResult<List<Ability>>(this.abilityDao.findAll());
    }

    @Override
    public DataResult<List<Ability>> getAllByDescriptionContains(String descrpition) {
        return new SuccessDataResult<List<Ability>>(this.abilityDao.getAllByDescriptionContains(descrpition));
    }
}
