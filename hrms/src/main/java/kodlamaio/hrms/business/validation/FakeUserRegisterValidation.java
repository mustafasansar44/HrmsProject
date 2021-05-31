package kodlamaio.hrms.business.validation;

import kodlamaio.hrms.core.utilities.verification.ErrorResult;
import kodlamaio.hrms.core.utilities.verification.Result;
import kodlamaio.hrms.core.utilities.verification.SuccessResult;
import kodlamaio.hrms.entities.concretes.Employees;
import kodlamaio.hrms.entities.concretes.Employers;

public class FakeUserRegisterValidation {

    public static Result EmployersValidation(Employers user){
        if(user.getEmail().isBlank()){
            return new ErrorResult("Email alanı boş geçilemez.");
        }else if(user.getCompanyName().isBlank()){
            return new ErrorResult("Şirket adı alanı boş geçilemez.");
        }else if(user.getPhoneNumber().isBlank()){
            return new ErrorResult("Telefon numarası alanı boş geçilemez.");
        }else if(user.getWebAddress().isBlank()){
            return new ErrorResult("Web adresi alanı boş geçilemez.");
        }else if(user.getPassword().isBlank()){
            return new ErrorResult("Şifre alanı boş geçilemez.");
        }else{
            return new SuccessResult();
        }

    }

    public static Result EmployeesValidation(Employees user){
        if(user.getFirstName().isBlank()){
            return new ErrorResult("Adı alanı boş geçilemez.");
        }else if(user.getLastName().isBlank()){
            return new ErrorResult("Soyadı alanı boş geçilemez.");
        }else if(user.getEmail().isBlank()){
            return new ErrorResult("Şifre alanı boş geçilemez.");
        }else if(user.getPassword().isBlank()){
            return new ErrorResult("Şifre alanı boş geçilemez.");
        }else{
            return new SuccessResult();
        }
    }
}
