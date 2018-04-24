package com.client.client1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.client.dataaccess.mapper")
@ComponentScan("com.client")
@Configuration
@EnableWebMvc
@ServletComponentScan
public class Client1Application {

	public static void main(String[] args) {
		SpringApplication.run(Client1Application.class, args);
	}
}
