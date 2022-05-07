package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.verification.result.Result;

import java.io.IOException;

public interface CandidateImageService {
    Result addImage(String candidateImage) throws IOException;
}
