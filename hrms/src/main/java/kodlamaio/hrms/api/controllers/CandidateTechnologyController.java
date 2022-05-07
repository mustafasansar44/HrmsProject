package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandidateTechnologyService;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.entities.abstracts.CandidateTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/candidateTechnology")
public class CandidateTechnologyController {

    private CandidateTechnologyService candidateTechnologyService;

    @Autowired
    public CandidateTechnologyController(CandidateTechnologyService candidateTechnologyService){
        this.candidateTechnologyService = candidateTechnologyService;
    }

    @PostMapping("/add")
    public Result addTechnology(@RequestBody CandidateTechnology candidateTechnology){
        return this.candidateTechnologyService.addTechnology(candidateTechnology);
    }


}
