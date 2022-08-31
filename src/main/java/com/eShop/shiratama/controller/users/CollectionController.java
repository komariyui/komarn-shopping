package com.eShop.shiratama.controller.users;


import com.eShop.shiratama.Service.users.CollectionService;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/collection")
public class CollectionController {

    @Autowired
    CollectionService collectionService;

    @PostMapping
    public templateReturn addCollection(@RequestBody HashMap<String,Object> data){
        return collectionService.addCollectionService(data.get("token").toString(),data.get("commodityId").toString());
    }
}
