package kodlamaio.hrms.Business.concretes;

import kodlamaio.hrms.Business.abstracts.SectorService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.Core.utilities.results.SuccessResult;
import kodlamaio.hrms.DataAccess.abstracts.SectorDao;
import kodlamaio.hrms.Entities.concretes.Sector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectorManager implements SectorService {

    private SectorDao sectorDao;

    @Autowired
    public SectorManager(SectorDao sectorDao) {
        this.sectorDao = sectorDao;
    }

    @Override
    public Result add(Sector sector) {
        this.sectorDao.save(sector);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<Sector>> getAll() {
        return new SuccessDataResult<List<Sector>>(this.sectorDao.findAll());
    }
}
