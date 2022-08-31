package com.eShop.shiratama.controller.users;

import com.eShop.shiratama.Service.users.FootPrintService;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/footprint")
public class FootprintController {

    @Autowired
    FootPrintService footPrintService;

    @PostMapping
    public templateReturn addFootPrint(){
        return footPrintService.addFootPrintService();
    }
}
