package kodlamaio.hrms.API.controllers;

import kodlamaio.hrms.Business.abstracts.ImageService;
import kodlamaio.hrms.Business.abstracts.JobSeekerService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.Image;
import kodlamaio.hrms.Entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImagesController {

    private ImageService imageService;
    private JobSeekerService jobSeekerService;

    @Autowired
    public ImagesController(ImageService imageService, JobSeekerService jobSeekerService){
        this.imageService=imageService;
        this.jobSeekerService=jobSeekerService;
    }

    @PostMapping("/add")
    public Result add(@RequestParam(value="jobSeekerId") int jobSeekerId, @RequestParam(value="imageFile") MultipartFile imageFile){
        JobSeeker jobSeeker = this.jobSeekerService.getByJobSeekerId(jobSeekerId).getData();
        Image image = new Image();
        image.setJobSeeker(jobSeeker);
        return this.imageService.add(image, imageFile);
    }

    public Result delete(Image image){
        return this.imageService.delete(image);
    }

    @GetMapping("/getall")
    public DataResult<List<Image>> getAll(){
        return this.imageService.getAll();
    }

    public DataResult<List<Image>> getAllByJobSeeker_JobSeekerId(int jobSeekerId){
        return this.imageService.getAllByJobSeeker_JobSeekerId(jobSeekerId);
    }


}
