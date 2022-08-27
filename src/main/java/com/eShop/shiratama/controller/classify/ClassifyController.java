package com.eShop.shiratama.controller.classify;

import com.eShop.shiratama.Service.classify.ClassifyService;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classify")
public class ClassifyController {

    @Autowired
    ClassifyService classifyService;

    @GetMapping
    public templateReturn getClassify(){
        return classifyService.getClassifyService();
    }
//    @GetMapping("/{twoCode}")
//    public templateReturn getClassifyLevelTwo(){
//
//    }
}
