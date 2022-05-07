package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandidateJobExperienceService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.entities.abstracts.CandidateJobExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/candidateJobExperience")

public class CandidateJobExperienceController {

    private CandidateJobExperienceService candidateJobExperienceService;

    @Autowired
    public CandidateJobExperienceController(CandidateJobExperienceService candidateJobExperienceService){
        this.candidateJobExperienceService = candidateJobExperienceService;
    }

    @PostMapping("/addJobExperience")
    public ResponseEntity<?> addJobExperience(@Valid @RequestBody CandidateJobExperience candidateJobExperience){
        return ResponseEntity.ok(this.candidateJobExperienceService.addJobExperience(candidateJobExperience));
    }

    @GetMapping("/sortByGraduation")
    public DataResult<List<CandidateJobExperience>> sortByGraduation(){
        return this.candidateJobExperienceService.findAllByOrderByStartDateAsc();
    }

    @GetMapping("/sortByExperience")
    public DataResult<List<CandidateJobExperience>> sortByExperience(){
        return this.candidateJobExperienceService.sortByExperience();
    }
}
