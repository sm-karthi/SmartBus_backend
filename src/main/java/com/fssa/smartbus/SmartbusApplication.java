package com.fssa.smartbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.fssa.smartbus")
public class SmartbusApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmartbusApplication.class, args);
	}
}


