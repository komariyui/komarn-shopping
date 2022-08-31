package com.eShop.shiratama.components;

import com.eShop.shiratama.Dao.tokens.TokenCheckDao;
import com.eShop.shiratama.entity.components.tokens;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TokenCheck {

    @Autowired
    private TokenCheckDao tokenCheckDao;

    public templateReturn checkTokenTemplateReturn(String token){
        if(checkToken(token))
            return templateReturn.success("",200,"当前token在有效期内");
        else{
            tokenCheckDao.upTokenStatus(token);
            return templateReturn.error(401,"登录已经失效，请重新登录");
        }
    }

    public Boolean checkTokenComponent(String token){
        Boolean checkTokenStatus = checkToken(token);
        if(checkTokenStatus==false) tokenCheckDao.upTokenStatus(token);
        return checkTokenStatus;
    }

    public String getUsername(String token){
        tokens returnData;
        if(checkToken(token))
             returnData = tokenCheckDao.getUsername(token);
        else
            return "token已经失效了，无法插入token";

        return returnData.getUsername();
    }

    public Boolean getTokens(String token){
        return checkToken(token);
    }

    private Boolean checkToken(String token){
        Integer answer = tokenCheckDao.checkToken(token);
        if(answer != 1 || answer == null)
            return false;
        else
            return true;
    }


}
