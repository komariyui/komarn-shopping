package com.eShop.shiratama.controller.users;

import com.eShop.shiratama.entity.returnJson.template;
import com.eShop.shiratama.service.users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping
    public HashMap register (@RequestParam String username,@RequestParam String password,@RequestParam String verificationCode){
        return usersService.insertUser(username,password,verificationCode);
    }

    // get verification code
    @GetMapping
    public template getVerificationCode(){return usersService.verificationCode();}

}
