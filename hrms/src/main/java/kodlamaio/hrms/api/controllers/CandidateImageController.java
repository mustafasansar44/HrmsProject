package kodlamaio.hrms.api.controllers;


import kodlamaio.hrms.business.abstracts.CandidateImageService;
import kodlamaio.hrms.core.utilities.verification.result.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/candidateImage")

public class CandidateImageController {

    private CandidateImageService candidateImageService;

    @Autowired
    public CandidateImageController(CandidateImageService candidateImageService){
        this.candidateImageService = candidateImageService;
    }


    @PostMapping("/addImage")
    public ResponseEntity<?> addImage(@RequestParam String candidateImage) throws IOException {
        this.candidateImageService.addImage(candidateImage);
        return ResponseEntity.ok(new SuccessResult("Başarılı."));
    }
}
