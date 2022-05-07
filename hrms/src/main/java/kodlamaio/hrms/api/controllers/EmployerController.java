package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.core.utilities.verification.result.ErrorDataResult;
import kodlamaio.hrms.entities.abstracts.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
    private EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService){
        this.employerService = employerService;
    }

    @CrossOrigin
    @GetMapping("/getAll")
    public DataResult<List<Employer>> getAll(){
        return this.employerService.getAll();
    }

    @GetMapping("/getByEmailAndPassword")
    public DataResult<Employer> getByEmailAndPassword(@RequestParam String email, @RequestParam String password ){
        return this.employerService.getByEmailAndPassword(email, password);
    }

    @CrossOrigin
    @PostMapping("/add")
    public ResponseEntity<?> add(@Valid @RequestBody Employer employer){
        return ResponseEntity.ok(this.employerService.add(employer));
    }



    // Validations
    @ExceptionHandler(MethodArgumentNotValidException.class)   //Bu türde şu tip hata olursa bunu devreye sok dedik
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
        Map<String, String> validationErrors = new HashMap<String, String>(); //Anahtar, hata
        for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()){
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }

        ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, "Doğrulama hataları");
        return errors;
    }


}



