package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {

    Result add(JobPosition jobPosition);

    Result delete(JobPosition jobPosition);

    DataResult<List<JobPosition>> getAll();

    DataResult<List<JobPosition>> getAllSortedAsc();


}