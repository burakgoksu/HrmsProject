package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.Ability;

import java.util.List;

public interface AbilityService {

    Result add(Ability ability);

    DataResult<List<Ability>> getAll();

    DataResult<List<Ability>> getAllByDescriptionContains(String descrpition);

}
