package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Purpose : Main class for ToDo UserService.	
 * @author 	 Sameer Saurabh
 * @version  1.0
 * @Since    11/08/2018
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name="user-service")
public class ToDoUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoUserServiceApplication.class, args);
	}
}
