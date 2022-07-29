package com.eShop.shiratama.error.exceptionClass;

import com.eShop.shiratama.error.errorCodes;
import com.eShop.shiratama.error.globalExceptions;

public class paramException extends globalExceptions {
    public paramException(String message) {
        super(message, errorCodes.PARAM_ERROR_CODE.getCode());
    }
}
