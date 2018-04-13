package com.client.client10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Client10Application {

	public static void main(String[] args) {
		SpringApplication.run(Client10Application.class, args);
	}
}
