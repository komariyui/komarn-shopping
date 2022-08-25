package com.eShop.shiratama.components;

import com.eShop.shiratama.Dao.tokens.TokenIssueDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;


//this component is issue token
@Component
public class TokenIssue {
    @Autowired
    private TokenIssueDao tokenIssueDao;

    private String username;
    private Boolean remember;



    public String TokenIssues(String username, Boolean remember){
        this.username = username;
        this.remember = remember;

        return issueToken();
    }

    private Boolean invalidAll(String username){
        return tokenIssueDao.invalidUserToken(username) >=0 ? true:false;
    }


    private String issueToken(){

        invalidAll(this.username);

        Date date = new Date();
        Calendar now =  Calendar.getInstance();
        now.setTime(date);

        Calendar validTime = Calendar.getInstance();
        validTime.setTime(date);
        validTime.add(validTime.DATE,this.remember ? 7:1);

        String token = UUID.randomUUID().toString();

        tokenIssueDao.issueTokenInsert(
                this.username,
                token,
                now.getTime(),
                validTime.getTime(),
                this.remember,
                true
        );

        return token;
    }
}
