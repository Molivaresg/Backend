package com.springboot.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@ComponentScan (basePackages= "com.springboot.headers")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
