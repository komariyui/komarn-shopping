package com.eShop.shiratama.controller.commodity;


import com.eShop.shiratama.Service.commodity.CommodityService;
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

    //Get all commodity list(have paging)
    @GetMapping("/{page}")
    public templateReturn getAllCommodity(@PathVariable("page") String page){
        return commodityService.getAllCommodityListService(page);
    }
}
