package kodlamaio.hrms.Business.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Entities.concretes.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageService {

    public Result add(Image image, MultipartFile multipartFile);

    public Result delete(Image image);

    public DataResult<List<Image>> getAll();

    public DataResult<List<Image>> getAllByJobSeeker_JobSeekerId(int jobSeekerId);

}
