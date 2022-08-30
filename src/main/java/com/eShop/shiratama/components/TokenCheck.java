package com.eShop.shiratama.components;

import com.eShop.shiratama.Dao.tokens.TokenCheckDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TokenCheck {

    @Autowired
    private TokenCheckDao tokenCheckDao;

    public Boolean checkToken(String token){
        return tokenCheckDao.checkToken(token) == 1 ? true:false;
    }
}
