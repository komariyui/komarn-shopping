package com.eShop.shiratama.controller.users;

import com.eShop.shiratama.entity.UsersBean;
import com.eShop.shiratama.entity.returnJson.template;
import com.eShop.shiratama.service.users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping
    public HashMap register (@RequestBody UsersBean usersEntity){
        return usersService.insertUser(usersEntity);
    }

}
