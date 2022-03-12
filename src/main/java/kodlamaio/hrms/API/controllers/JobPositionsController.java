package kodlamaio.hrms.API.controllers;


import kodlamaio.hrms.Business.abstracts.JobPositionService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {

    private JobPositionService service;

    @Autowired
    public JobPositionsController(JobPositionService jobPositionService) {
        this.service = jobPositionService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobPosition>> getAll(){
        return service.getAll();
    }

    @GetMapping("/getallsortedasc")
    public DataResult<List<JobPosition>> getAllSortedAsc(){
        return service.getAllSortedAsc();
    }

    @PostMapping(value="/add")
    public Result add(@Valid @RequestBody JobPosition jobPosition){
        return this.service.add(jobPosition);
    }

    @PostMapping(value="/delete")
    public Result delete(@Valid @RequestBody JobPosition jobPosition){
        return this.service.delete(jobPosition);
    }

}