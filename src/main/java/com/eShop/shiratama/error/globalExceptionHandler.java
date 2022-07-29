package com.eShop.shiratama.error;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

//global error interception
//自上而下
@ControllerAdvice
public class globalExceptionHandler {
    @ExceptionHandler(value = globalExceptions.class)
    @ResponseBody
    public templateReturn jsonErrorHandler(HttpServletRequest req, globalExceptions e)
            throws Exception {
        templateReturn r = new templateReturn();
        r.setErrmsg(e.getMessage());
        r.setErrno(e.getCode());
        r.setData(null);
        return r;

    }

    @ExceptionHandler(value =Exception.class)
    @ResponseBody //必须传入 Exception e
    public templateReturn exceptionHandler(Exception e){
        templateReturn returnObject = new templateReturn();
        returnObject.setErrmsg("未知的服务器错误,我们已经记录下错误信息，请待完成解决。");
        returnObject.setData(null);
        returnObject.setErrno(500);
        // "全局异常捕获,错误原因>>>"+e.getMessage();
        return returnObject;
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
