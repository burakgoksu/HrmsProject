package kodlamaio.hrms.API.controllers;

import kodlamaio.hrms.Business.abstracts.CvService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.Cv;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cvs")
public class CvsController {

    private CvService cvService;

    public CvsController(CvService cvService){
        this.cvService=cvService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Cv cv){
        return this.cvService.add(cv);
    }

    @GetMapping("/getall")
    public DataResult<List<Cv>> getAll(){
        return this.cvService.getAll();
    }

    @GetMapping("/getAllBySchool_SchoolName")
    public DataResult<List<Cv>> getAllBySchool_SchoolName(@RequestParam String schoolName){
        return this.cvService.getAllBySchool_SchoolName(schoolName);
    }

    @GetMapping("/getByOrderByGraduationDate")
    public DataResult<List<Cv>> getByOrderByGraduationDate(){
        return this.cvService.getByOrderByGraduationDate();
    }

    @GetMapping("/getByOrderByGraduationDateDesc")
    public DataResult<List<Cv>> getByOrderByGraduationDateDesc(){
        return this.cvService.getByOrderByGraduationDateDesc();
    }

    @GetMapping("/getByOrderByGraduationDateAsc")
    public DataResult<List<Cv>> getByOrderByGraduationDateAsc(){
        return this.cvService.getByOrderByGraduationDateAsc();
    }

    @GetMapping("/getAllByAbility_Description")
    public DataResult<List<Cv>> getAllByAbility_Description(@RequestParam String description){
        return this.cvService.getAllByAbility_Description(description);
    }


}
