package com.eShop.shiratama.error;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

//global error interception
@ControllerAdvice
public class globalExceptionHandler {
    @ExceptionHandler(value = globalExceptions.class)
    @ResponseBody
    public mainReturn jsonErrorHandler(HttpServletRequest req, globalExceptions e)
            throws Exception {
        mainReturn r = new mainReturn();
        r.setMessage(e.getMessage());
        r.setCode(e.getCode());
        r.setData(null);
        r.setStatus(false);
        return r;

    }

//    @ExceptionHandler(value =Exception.class)
//    @ResponseBody
//    //必须传入 Exception e
//    public String jsonErrorHandler2(Exception e){
//        return "233";
//    }
//            throws Exception {
//        mainReturn r = new mainReturn();
//        r.setMessage(e.getMessage());
//        r.setCode(e.getCode());
//        r.setData(null);
//        r.setStatus(false);
//        return r;
//
//    }



}
