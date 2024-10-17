package com.mybank.customer_portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MyBankCustomerPortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyBankCustomerPortfolioApplication.class, args);
	}

}
