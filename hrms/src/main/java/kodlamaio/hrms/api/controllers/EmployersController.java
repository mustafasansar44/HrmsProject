package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.business.validation.FakeUserRegisterValidation;
import kodlamaio.hrms.core.utilities.verification.DataResult;
import kodlamaio.hrms.core.utilities.verification.ErrorResult;
import kodlamaio.hrms.core.utilities.verification.Result;
import kodlamaio.hrms.entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")

public class EmployersController {
    private EmployersService employersService;

    @Autowired
    public EmployersController(EmployersService employersService){
        this.employersService = employersService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Employers>> getAll(){
        return this.employersService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employers employers){
        if(FakeUserRegisterValidation.EmployersValidation(employers).isSuccess()){
            return this.employersService.add(employers);

        }
        return new ErrorResult("Lütfen bilgilerinizi kontrol edin.");
    }
}
