package kodlamaio.hrms.API.controllers;

import kodlamaio.hrms.Business.abstracts.SystemStaffService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.SystemStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/systemStaffs")
public class SystemStaffsController {

    private SystemStaffService systemStaffService;

    @Autowired
    public SystemStaffsController(SystemStaffService systemStaffService) {
        this.systemStaffService = systemStaffService;
    }

    @PostMapping("/add")
    Result add(@RequestBody SystemStaff systemStaff){
        return this.systemStaffService.add(systemStaff);
    }

    @GetMapping("/getall")
    DataResult<List<SystemStaff>> getAll(){
        return this.systemStaffService.getAll();
    }
}
