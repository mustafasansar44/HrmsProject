package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployeesService;
import kodlamaio.hrms.business.validation.FakeUserRegisterValidation;
import kodlamaio.hrms.core.utilities.verification.DataResult;
import kodlamaio.hrms.core.utilities.verification.ErrorResult;
import kodlamaio.hrms.core.utilities.verification.Result;
import kodlamaio.hrms.entities.concretes.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
    private EmployeesService employeesService;

    @Autowired
    public EmployeesController(EmployeesService employeesService){
        this.employeesService = employeesService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Employees>> getAll(){
        return this.employeesService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employees employees){
        if(FakeUserRegisterValidation.EmployeesValidation(employees).isSuccess()){
            return this.employeesService.add(employees);
        }
        return new ErrorResult("Lütfen bilgilerinizi kontrol edin.");
    }
}
