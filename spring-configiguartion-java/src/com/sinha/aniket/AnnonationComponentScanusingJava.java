package com.sinha.aniket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.sinha.aniket")

@PropertySource("classpath:employee.properties")
public class AnnonationComponentScanusingJava {
	
	
	@Bean
	public Salary salary(){
		return new EmployeeSalary();
	}

}
