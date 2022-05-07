package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.utilities.verification.result.DataResult;
import kodlamaio.hrms.entities.abstracts.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @CrossOrigin
    @GetMapping("/getByEmailAndPassword")
    public DataResult<User> getByEmailAndPassword(@RequestParam String email, @RequestParam String password){
        return this.userService.getByEmailAndPassword(email, password);
    }
}
