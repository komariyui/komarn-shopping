package com.eShop.shiratama.error.exceptionClass;

import com.eShop.shiratama.error.errorCodes;
import com.eShop.shiratama.error.globalExceptions;

public class serverExceptions extends globalExceptions {
//    private static final long serialVersionUID = -1355046108056594333L;
    public serverExceptions(String message) {
        super(message, errorCodes.SERVER_ERROR_CODE.getCode());
    }
}
