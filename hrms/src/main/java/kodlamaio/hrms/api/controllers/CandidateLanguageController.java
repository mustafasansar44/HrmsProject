package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandidateLanguageService;
import kodlamaio.hrms.business.concretes.CandidateLanguageManager;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.entities.abstracts.CandidateLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/candidateLanguage")

public class CandidateLanguageController {

    private CandidateLanguageService candidateLanguageService;

    @Autowired
    public CandidateLanguageController(CandidateLanguageManager candidateLanguageManager){
        this.candidateLanguageService = candidateLanguageManager;
    }

    @GetMapping("/fetchById")
    public DataResult<List<CandidateLanguage>> fetchById(@RequestParam int id){
        return this.candidateLanguageService.fetchById(id);
    }
}
