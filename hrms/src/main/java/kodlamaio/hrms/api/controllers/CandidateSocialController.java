package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandidateSocialService;
import kodlamaio.hrms.entities.abstracts.CandidateSocial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/candidateSocial")

public class CandidateSocialController {

    private CandidateSocialService candidateSocialService;

    @Autowired
    public CandidateSocialController(CandidateSocialService candidateSocialService){
        this.candidateSocialService = candidateSocialService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addSocial(@RequestBody CandidateSocial candidateSocial){
        return ResponseEntity.ok(this.candidateSocialService.addSocial(candidateSocial));
    }


}
