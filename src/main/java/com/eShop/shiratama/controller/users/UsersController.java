package com.eShop.shiratama.controller.users;

import com.eShop.shiratama.entity.UsersBean;
import com.eShop.shiratama.entity.returnJson.template;
import com.eShop.shiratama.error.templateReturn;
import com.eShop.shiratama.service.users.UsersService;
import com.eShop.shiratama.service.users.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;
    @Autowired
    private testService ts;

    @PostMapping
    public HashMap register (@RequestBody UsersBean usersEntity){
        return usersService.insertUser(usersEntity);
    }
    @GetMapping
    public templateReturn getVerification(@RequestParam  String username) throws Exception{
        
        return  templateReturn.success(ts.createCode(username),0,"成功获取验证码");
    }
}
