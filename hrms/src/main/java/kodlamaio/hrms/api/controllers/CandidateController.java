package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.entities.abstracts.Candidate;
import kodlamaio.hrms.entities.dtos.CandidateCvDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")

public class CandidateController {

    private CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService){
        this.candidateService = candidateService;
    }

    @CrossOrigin
    @GetMapping("/getAll")
    public DataResult<List<Candidate>> getAll(){
        return this.candidateService.getAll();
    }

    @GetMapping("/getByFirstName")
    public DataResult<Candidate> getByFirstName(@RequestParam String firstName){
        return this.candidateService.getByFirstName(firstName);
    }

    @GetMapping("/getCandidateCv")
    public List<CandidateCvDto> getCandidateCv(){
        return this.candidateService.findAll();
    }

    @CrossOrigin
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Candidate candidate){
        return ResponseEntity.ok(this.candidateService.add(candidate));
    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Candidate candidate){
        return ResponseEntity.ok(this.candidateService.updateCandidate(candidate));
    }


}

