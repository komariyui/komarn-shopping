package com.eShop.shiratama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class ShiratamaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShiratamaApplication.class, args);
	}

}
