package com.eShop.shiratama.Service.users;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class testService {
    @Cacheable(value="SMS",key="#username")
    public String getCode(String username) {
        return "a";
    }

    @CachePut(value="SMS",key="#username")
    public String createCode(String username) {
        int rand = new Random().nextInt(1000_000);
        return String.format("%06d",rand);
    }

}
