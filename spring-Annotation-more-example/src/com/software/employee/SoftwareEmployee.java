package com.software.employee;

import org.springframework.stereotype.Component;

@Component
public class SoftwareEmployee implements EmployeeDetails{

	@Override
	public String empSalary() {
		// TODO Auto-generated method stub
		return "24lack";
	}

	@Override
	public String companyTotalEmployee() {
		// TODO Auto-generated method stub
		return "200k";
	}

}
