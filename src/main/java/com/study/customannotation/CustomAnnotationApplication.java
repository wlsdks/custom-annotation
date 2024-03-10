package com.study.customannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class CustomAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomAnnotationApplication.class, args);
	}

}
