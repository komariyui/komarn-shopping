package com.eShop.shiratama.controller.commodity;


import com.eShop.shiratama.Service.commodity.CommodityService;
import com.eShop.shiratama.components.TokenCheck;
import com.eShop.shiratama.error.templateReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commodity")
public class commodityController {

    @Autowired
    private CommodityService commodityService;

    @Autowired
    private TokenCheck tokenCheck;

    //Get all commodity list(have paging)
    @GetMapping("/{page}")
    public templateReturn getAllCommodity(@PathVariable("page") String page){
        return commodityService.getAllCommodityListService(page);
    }

    //get commodity for classify(have paging)
    @GetMapping("/{classifyCode}/{page}")
    public templateReturn getAllCommodityForClassify(@PathVariable("classifyCode") String classifyCode,@PathVariable("page") String page){
        return commodityService.getAllCommodityListForClassifyService(classifyCode, page);
    }

    //get commodity information(use commodity code)
    @GetMapping("/c/{commodityCode}/{token}")
    public Boolean getCommodityInformation(@PathVariable("commodityCode") String commodityCode,@PathVariable("token") String token){
        return tokenCheck.checkToken(token);
    }
}
