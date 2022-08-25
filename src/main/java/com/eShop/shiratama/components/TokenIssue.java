package com.eShop.shiratama.components;

import com.eShop.shiratama.Dao.users.TokenIssueDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

//this component is issue token
public class TokenIssue {
    private String username;
    private Date validityPeriod;

    @Autowired
    private TokenIssueDao tokenIssueDao;

    public TokenIssue(String username,Date validityPeriod){
        this.username = username;
        this.validityPeriod = validityPeriod;
    }


    private String issueToken(){
        tokenIssueDao.issueTokenInsert();
    }
}
