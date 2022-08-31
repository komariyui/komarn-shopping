package com.eShop.shiratama.controller.users;

import com.eShop.shiratama.Service.users.FootPrintService;
import com.eShop.shiratama.components.TokenCheck;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/footprint")
public class FootprintController {

    @Autowired
    FootPrintService footPrintService;

    @Autowired
    TokenCheck tokenCheck;


    @PostMapping
    public templateReturn addFootPrint(@RequestBody HashMap<String,Object> data){
        String tokenString = data.get("token").toString();

        if(!tokenCheck.getTokens(tokenString))
            return templateReturn.error(401,"请重新登录");

        return footPrintService.addFootPrintService(
                tokenCheck.getUsername(tokenString),
                data.get("commodityId").toString());
    }
}
