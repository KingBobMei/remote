package com.mei.hermes;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mei.hermes.mapper")
public class HermesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HermesApplication.class, args);
	}

}
