package kodlamaio.hrms.Core.adapters.abstracts;

import kodlamaio.hrms.Core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Map;

public interface CloudinaryService {
    @SuppressWarnings("rawtypes")
    public DataResult<Map> uploadImage(MultipartFile imageFile);
}
