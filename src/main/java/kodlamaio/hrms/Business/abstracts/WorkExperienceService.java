package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.WorkExperience;

import java.util.List;

public interface WorkExperienceService {

    Result add(WorkExperience workExperience);

    DataResult<List<WorkExperience>> getAll();

    DataResult<List<WorkExperience>> getByOrderByEndingYear();
}
