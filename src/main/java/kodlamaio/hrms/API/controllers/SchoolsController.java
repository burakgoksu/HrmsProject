package kodlamaio.hrms.API.controllers;

import kodlamaio.hrms.Business.abstracts.SchoolService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schools")
public class SchoolsController {

    private SchoolService schoolService;

    @Autowired
    public SchoolsController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("/add")
    Result add(@RequestBody School school){
        return this.schoolService.add(school);
    }

    @GetMapping("/getAllBySchoolNameContainsAndDepartmentContains")
    DataResult<List<School>> getAllBySchoolNameContainsAndDepartmentContains(@RequestParam String schoolName,@RequestParam String department){
        return this.schoolService.getAllBySchoolNameContainsAndDepartmentContains(schoolName, department);
    }

    @GetMapping("/getAllBySchoolNameContainsOrDepartmentContains")
    DataResult<List<School>> getAllBySchoolNameContainsOrDepartmentContains(@RequestParam String schoolName,@RequestParam String department) {
        return this.schoolService.getAllBySchoolNameContainsOrDepartmentContains(schoolName, department);
    }

    @GetMapping("/getAllBySchoolNameContains")
    DataResult<List<School>> getAllBySchoolNameContains(@RequestParam String schoolName) {
        return this.schoolService.getAllBySchoolNameContains(schoolName);
    }

    @GetMapping("/getAllByDepartmentContains")
    DataResult<List<School>> getAllByDepartmentContains(@RequestParam String department) {
        return this.schoolService.getAllByDepartmentContains(department);
    }
}
