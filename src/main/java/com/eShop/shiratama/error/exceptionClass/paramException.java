package com.eShop.shiratama.error.exceptionClass;

import com.eShop.shiratama.error.errorCodes;
import com.eShop.shiratama.error.globalExceptions;

public class paramException extends globalExceptions {
//    private static final long serialVersionUID = 6021390821349937519L;
    public paramException(String message) {
        super(message, errorCodes.PARAM_ERROR_CODE.getCode());
    }
}
