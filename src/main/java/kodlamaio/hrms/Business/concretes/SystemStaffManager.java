package kodlamaio.hrms.Business.concretes;

import kodlamaio.hrms.Business.abstracts.SystemStaffService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.Core.utilities.results.SuccessResult;
import kodlamaio.hrms.DataAccess.abstracts.SystemStaffDao;
import kodlamaio.hrms.Entities.concretes.SystemStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemStaffManager implements SystemStaffService {

    private SystemStaffDao systemStaffDao;

    @Autowired
    public SystemStaffManager(SystemStaffDao systemStaffDao) {
        this.systemStaffDao = systemStaffDao;
    }

    @Override
    public Result add(SystemStaff systemStaff) {
        this.systemStaffDao.save(systemStaff);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<SystemStaff>> getAll() {
        return new SuccessDataResult<List<SystemStaff>>(this.systemStaffDao.findAll());
    }
}
