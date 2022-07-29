package com.eShop.shiratama.controller;

import com.eShop.shiratama.error.exceptionClass.paramException;
import com.eShop.shiratama.error.exceptionClass.serverExceptions;
import com.eShop.shiratama.error.globalExceptions;
import com.eShop.shiratama.error.mainReturn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
//////
@RestController
public class test {

    @GetMapping("/test")
    public mainReturn test(){
        return mainReturn.ok("喵喵");
    }

    @RequestMapping("/students")
    Object queryStudents() throws globalExceptions {
        return mainReturn.ok("喵喵");
    }

    @RequestMapping("/error1")
    Object queryStudents1() throws globalExceptions {
        int a= 1;
        if(a==1){
            throw new paramException("参数错误");
        }
        return mainReturn.ok("喵喵");
    }

    @RequestMapping("/error2")
    Object queryStudents2() throws globalExceptions {
        int a= 1;
        if(a==1){
            throw new serverExceptions("内部错误");
        }
        return mainReturn.ok("喵喵");
    }
}
