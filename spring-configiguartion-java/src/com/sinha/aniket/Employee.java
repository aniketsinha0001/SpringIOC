package com.sinha.aniket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee implements HelloDemo{
	
	@Value("${emp.emailId}")
	private String emailId;
	
	
	@Value("${emp.name}")
	private String name;
	
	
	private Salary sal;
	
	public Employee(Salary sal){
		this.sal=sal;
	}
	
	public String getEmailId() {
		return emailId;
	}

	public String getName() {
		return name;
	}

	@Override
	public String helloDemo() {
		
		return "Hello World!";
	}

	@Override
	public String empSalary() {
		// TODO Auto-generated method stub
		return sal.salary();
	}

}
