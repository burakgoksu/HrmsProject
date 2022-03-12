package kodlamaio.hrms.API.controllers;

import kodlamaio.hrms.Business.abstracts.SectorService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.Sector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sectors")
public class SectorsController {

    private SectorService sectorService;

    @Autowired
    public SectorsController(SectorService sectorService) {
        this.sectorService = sectorService;
    }

    @PostMapping("/add")
    Result add(@RequestBody Sector sector){
        return this.sectorService.add(sector);
    }

    @GetMapping("/getall")
    DataResult<List<Sector>> getAll(){
        return this.sectorService.getAll();
    }
}
