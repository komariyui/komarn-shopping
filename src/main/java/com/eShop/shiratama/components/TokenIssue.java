package com.eShop.shiratama.components;

import java.sql.Date;

//this component is issue token
public class TokenIssue {
    private String username;
    private Date validityPeriod;


    public TokenIssue(String username,Date validityPeriod){
        this.username = username;
        this.validityPeriod = validityPeriod;
    }

    private String issueToken(){

    }
}
