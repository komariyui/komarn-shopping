package com.eShop.shiratama.controller;

import com.eShop.shiratama.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/register")
    public HashMap register (@RequestParam String username,@RequestParam String password){
        return usersService.insertUser(username,password);
    }
}
