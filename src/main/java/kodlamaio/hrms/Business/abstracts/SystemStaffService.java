package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.SystemStaff;

import java.util.List;

public interface SystemStaffService {

    Result add(SystemStaff systemStaff);

    DataResult<List<SystemStaff>> getAll();

}
