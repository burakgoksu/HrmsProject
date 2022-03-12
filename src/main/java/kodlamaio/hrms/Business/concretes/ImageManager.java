package kodlamaio.hrms.Business.concretes;

import kodlamaio.hrms.Business.abstracts.ImageService;
import kodlamaio.hrms.Core.adapters.abstracts.CloudinaryService;
import kodlamaio.hrms.Core.utilities.results.DataResult;
import kodlamaio.hrms.Core.utilities.results.Result;
import kodlamaio.hrms.Core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.Core.utilities.results.SuccessResult;
import kodlamaio.hrms.DataAccess.abstracts.ImageDao;
import kodlamaio.hrms.Entities.concretes.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class ImageManager implements ImageService {

    private CloudinaryService cloudinaryService;
    private ImageDao imageDao;

    @Autowired
    public ImageManager(ImageDao imageDao, CloudinaryService cloudinaryService){
        this.imageDao=imageDao;
        this.cloudinaryService=cloudinaryService;
    }

    @Override
    public Result add(Image image, MultipartFile multipartFile) {
        Map<String,String> imageUpload = this.cloudinaryService.uploadImage(multipartFile).getData();
        image.setUrl(imageUpload.get("url"));
        this.imageDao.save(image);
        return new SuccessResult();
    }

    @Override
    public Result delete(Image image) {
        this.imageDao.deleteByImageId(image.getImageId());
        return new SuccessResult();
    }

    @Override
    public DataResult<List<Image>> getAll() {
        return new SuccessDataResult<List<Image>>(this.imageDao.findAll());
    }

    @Override
    public DataResult<List<Image>> getAllByJobSeeker_JobSeekerId(int jobSeekerId) {
        return new SuccessDataResult<List<Image>>(this.imageDao.getAllByJobSeeker_JobSeekerId(jobSeekerId));
    }
}
