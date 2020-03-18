package com.reinaldo.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.reinaldo.model"})
@ComponentScan(basePackages = {"com.*"})
public class SpringTymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTymeleafApplication.class, args);
	}

}
