package com.eShop.shiratama.controller.users;


import com.eShop.shiratama.Service.users.UsersService;
import com.eShop.shiratama.Service.users.testService;
import com.eShop.shiratama.entity.UsersBean;
import com.eShop.shiratama.error.exceptionClass.paramException;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/users")////////////////
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
    public templateReturn getVerification(@RequestParam  String username) throws paramException {
        if(usersService.checkUsername(username)) throw new paramException("用户名已被占用");
        return  templateReturn.success(ts.createCode(username),0,"成功获取验证码");
    }
//    @GetMapping
//    public templateReturn get
}
