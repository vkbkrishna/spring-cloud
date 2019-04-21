package com.ms.countriesclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CountriesClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountriesClientApplication.class, args);
	}

}

