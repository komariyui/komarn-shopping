package com.eShop.shiratama.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class test {
    @GetMapping("/test")
    public char test(){
        return '喵';
    }
}
