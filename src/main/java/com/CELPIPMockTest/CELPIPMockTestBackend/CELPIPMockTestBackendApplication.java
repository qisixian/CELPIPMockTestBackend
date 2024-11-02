package com.CELPIPMockTest.CELPIPMockTestBackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.CELPIPMockTest.CELPIPMockTestBackend")
public class CELPIPMockTestBackendApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CELPIPMockTestBackendApplication.class, args);
		System.out.println("Application started"); // This line is used to add break point here to debug the context
	}
}
