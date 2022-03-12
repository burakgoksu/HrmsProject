package kodlamaio.hrms.Core.utilities.validation;

import kodlamaio.hrms.Entities.concretes.JobSeeker;
import org.springframework.stereotype.Service;

@Service
public class MernisValidator implements ValidationService<JobSeeker> {

    @Override
    public void Validate(JobSeeker jobSeeker) {
        jobSeeker.setStatus(true);
    }
}