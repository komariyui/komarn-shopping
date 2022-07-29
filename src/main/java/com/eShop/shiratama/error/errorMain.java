package com.eShop.shiratama.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

// global error
@ControllerAdvice

public class errorMain {

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
}