package com.eShop.shiratama.controller.users;


import com.eShop.shiratama.Service.users.CollectionService;
import com.eShop.shiratama.components.TokenCheck;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/collection")
public class CollectionController {

    @Autowired
    CollectionService collectionService;

    @Autowired
    TokenCheck tokenCheck;

    @PostMapping
    public templateReturn addCollection(@RequestBody HashMap<String,Object> data){
        if(isLogin(data.get("token").toString())) {
            return templateReturn.error(401, "请重新登录");
        }
        return collectionService.addCollectionService(data.get("token").toString(),data.get("commodityId").toString());
    }

    @PostMapping("/delete")
    public templateReturn deleteCollection(@RequestBody HashMap<String,Object> data){
        if(isLogin(data.get("token").toString())) {
            return templateReturn.error(401, "请重新登录");
        }
        return collectionService.deleteCollectionService(data.get("token").toString(),data.get("deleteCollectionList").toString());
    }

    @GetMapping("/{token}/{page}")
    public templateReturn getCollection(@PathVariable("token") String token,@PathVariable("page") String page){
        if(isLogin(token)) {
            return templateReturn.error(401, "请重新登录");
        }
        return collectionService.getCollectionService(token,page);
    }

    private Boolean isLogin(String tokenString){
        return !tokenCheck.getTokens(tokenString);
    }
}
