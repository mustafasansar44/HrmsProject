package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.Result;
import kodlamaio.hrms.core.utilities.verification.result.SuccessDataResult;
import kodlamaio.hrms.entities.abstracts.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobadvertisement")

public class JobAdvertisementController {
    private JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService){
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @CrossOrigin
    @GetMapping("/getAll")
    public DataResult<List<JobAdvertisement>> getAll(){
        return this.jobAdvertisementService.getAll();
    }

    @GetMapping("/getByUserId")
    public DataResult<List<JobAdvertisement>> getByUserId(@RequestParam int userId){
        return this.jobAdvertisementService.getByUserId(userId);
    }

    @CrossOrigin
    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody JobAdvertisement jobAdvertisement){
        return ResponseEntity.ok(this.jobAdvertisementService.add(jobAdvertisement));
    }

    @CrossOrigin
    @GetMapping("/getById")
    public ResponseEntity<?> getById(@RequestParam int id){
        return ResponseEntity.ok(this.jobAdvertisementService.getById(id));
    }




    @PostMapping("/setActiveStatus")
    public Result setActiveStatus(@RequestParam int id){
        return this.jobAdvertisementService.setActiveStatus(id);
    }

}
