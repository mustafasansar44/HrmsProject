package kodlamaio.hrms.business.concretes;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import kodlamaio.hrms.business.abstracts.CandidateImageService;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.dataAccess.abstracts.CandidateImageDao;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Service
public class CandidateImageManager implements CandidateImageService {

    private CandidateImageDao candidateImageDao;

    public CandidateImageManager(CandidateImageDao candidateImageDao){
        this.candidateImageDao = candidateImageDao;
    }

    @Override
    public Result addImage(String candidateImage) throws IOException {

        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "mustafasansar44",
                "api_key", "963998829248916",
                "api_secret", "3qU0wHCkJ1_5bBRet8QvUVDqnsE"));



        File file = new File("deneme.jpg");
        Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
       // uploadResult.get("url");
        return null;
    }
}
