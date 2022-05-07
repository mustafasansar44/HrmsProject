package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandidateEducationService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.entities.abstracts.CandidateEducation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidateEducation")
public class CandidateEducationController {

    private CandidateEducationService candidateEducationService;

    @Autowired
    public CandidateEducationController(CandidateEducationService candidateEducationService){
        this.candidateEducationService = candidateEducationService;
    }

    @GetMapping(name = "/getCandidateEducations")
    public DataResult<List<CandidateEducation>> getAll(){
        return this.candidateEducationService.getAll();
    }

    @PostMapping(name = "/add")
    public Result add(@RequestBody CandidateEducation candidateEducation) {
        return this.candidateEducationService.add(candidateEducation);
    }
}


