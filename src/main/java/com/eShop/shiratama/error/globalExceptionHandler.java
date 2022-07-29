package com.eShop.shiratama.error;

import com.eShop.shiratama.error.globalExceptions;
import com.eShop.shiratama.error.mainReturn;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

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
}
