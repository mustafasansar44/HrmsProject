package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.entities.abstracts.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/jobposition")
public class JobPositionController {

    private JobPositionService jobPositionService;
    @Autowired
    public JobPositionController(JobPositionService jobPositionService){
        this.jobPositionService = jobPositionService;
    }

    @CrossOrigin
    @GetMapping("/getAll")
    public DataResult<List<JobPosition>> getAll(){
        return this.jobPositionService.getAll();
    }

    @CrossOrigin
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody JobPosition jobPosition){
        return ResponseEntity.ok(this.jobPositionService.add(jobPosition));
    }


}
