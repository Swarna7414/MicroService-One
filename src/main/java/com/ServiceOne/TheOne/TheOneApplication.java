package com.ServiceOne.TheOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class TheOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheOneApplication.class, args);
	}

}
