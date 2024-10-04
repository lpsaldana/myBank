package com.mybank.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MyBankUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBankUserApplication.class, args);
	}

}
