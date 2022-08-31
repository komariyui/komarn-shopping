package com.eShop.shiratama.controller.users;

import com.eShop.shiratama.Service.users.FootPrintService;
import com.eShop.shiratama.components.TokenCheck;
import com.eShop.shiratama.error.templateReturn;
import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

        if(isLogin(tokenString)) {
            return templateReturn.error(401, "请重新登录");
        }

        return footPrintService.addFootPrintService(
                tokenCheck.getUsername(tokenString),
                data.get("commodityId").toString());
    }

    @GetMapping("/{token}/{page}")
    public templateReturn getFootPrint(@PathVariable("token") String token,@PathVariable("page") String page){

        if(isLogin(token)) {
            return templateReturn.error(401, "请重新登录");
        }

        return footPrintService.getFootPrintService(token,page);
    }

    private Boolean isLogin(String tokenString){
        return !tokenCheck.getTokens(tokenString);
    }
}
