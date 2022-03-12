package kodlamaio.hrms.API.controllers;

import kodlamaio.hrms.Business.abstracts.JobApplicationService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.JobApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobApplications")
public class JobApplicationsController {

    private JobApplicationService jobApplicationService;

    @Autowired
    public JobApplicationsController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }

    @PostMapping("/add")
    Result add(@RequestBody JobApplication jobApplication){
        return this.jobApplicationService.add(jobApplication);
    }

    @GetMapping("/getAllByJobSeeker_JobSeekerId")
    DataResult<List<JobApplication>> getAllByJobSeeker_JobSeekerId(int jobSeekerId){
        return this.jobApplicationService.getAllByJobSeeker_JobSeekerId(jobSeekerId);
    }

    @GetMapping("/getAll")
    DataResult<List<JobApplication>> getAll(){
        return this.jobApplicationService.getAll();
    }
}
