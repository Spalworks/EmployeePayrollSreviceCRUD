package com.bridgelabz.employeepayrollapp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollAppApplication.class, args);
		System.out.println("Welcome");
		log.info("Log collect");
	}
	
	

}
