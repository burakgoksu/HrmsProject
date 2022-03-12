package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.Sector;

import java.util.List;

public interface SectorService {

    Result add(Sector sector);

    DataResult<List<Sector>> getAll();

}
