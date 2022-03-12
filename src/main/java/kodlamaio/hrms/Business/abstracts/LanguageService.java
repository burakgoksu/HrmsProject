package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.Language;

import java.util.List;

public interface LanguageService {

    Result add(Language language);

    DataResult<List<Language>> getByOrderByLevelAsc();

    DataResult<List<Language>> getAll();

}
