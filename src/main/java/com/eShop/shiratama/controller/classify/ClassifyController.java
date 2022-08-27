package com.eShop.shiratama.controller.classify;

import com.eShop.shiratama.Service.classify.ClassifyService;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classify")
public class ClassifyController {

    @Autowired
    ClassifyService classifyService;

    @GetMapping
    public templateReturn getClassify(){
        return classifyService.getClassifyService();
    }
    @GetMapping("/{twoCode}")
    public templateReturn getClassifyLevelTwo(@PathVariable("twoCode") String twoCode){
        return classifyService.getClassifyServiceForTwo(twoCode);
    }
}
