package com.inspirecamp7.myspringbootproject4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class MySpringBootProject4Application {
	@Autowired
	static DataSource dataSource;

	public static void main(String[] args) {

		SpringApplication.run(MySpringBootProject4Application.class, args);
		System.out.println(dataSource.getClass().getName());
	}

	@Bean
	public String helloBean(){
		return new String("Hello 스프링부트");
	}
}
