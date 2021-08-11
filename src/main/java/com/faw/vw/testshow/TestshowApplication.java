package com.faw.vw.testshow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages="com.faw.*")
@SpringBootApplication
public class TestshowApplication {

	public static void main(String[] args) {

		SpringApplication.run(TestshowApplication.class, args);
	}
}
