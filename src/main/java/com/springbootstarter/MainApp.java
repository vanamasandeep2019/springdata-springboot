package com.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*@SpringBootApplication annotation can be used to enable those three features.
 * 
 * 1) @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
   2) @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
   3) @Configuration: allow to register extra beans in the context or import additional configuration classes
 * 4) The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes
 */


@SpringBootApplication
public class MainApp {
	
	public static void main(String[] args) {
		
		/*
		
		1) Sets up default configuration

		2) Starts spring application context

		3) Performs class path scan

		4) Starts tomcat server */

		SpringApplication.run(MainApp.class, args);
	}

}
