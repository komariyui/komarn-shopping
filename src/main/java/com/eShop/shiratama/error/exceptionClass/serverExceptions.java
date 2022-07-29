package com.eShop.shiratama.error.exceptionClass;

import com.eShop.shiratama.error.errorCodes;
import com.eShop.shiratama.error.globalExceptions;

public class serverExceptions extends globalExceptions {
    public serverExceptions(String message) {
        super(message, errorCodes.SERVER_ERROR_CODE.getCode());
    }
}
