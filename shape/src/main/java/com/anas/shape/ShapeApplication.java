package com.anas.shape;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan("com.anas.shape.repo")
public class ShapeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShapeApplication.class, args);
	}

}
