package com.software.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.software.employee.EmployeeDetails;

@Component
public class HardwareCompany implements Company{
	

	private EmployeeDetails emp;
	
	@Autowired
	public HardwareCompany(EmployeeDetails emp) {
		super();
		this.emp = emp;
	}

	@Override
	public String companyName() {
		// TODO Auto-generated method stub
		return "Intel";
	}

	@Override
	public String revenue() {
		// TODO Auto-generated method stub
		return "20billion $";
	}

	@Override
	public String empSalary() {
		// TODO Auto-generated method stub
		return emp.empSalary();
	}

	@Override
	public String companyTotalEmployee() {
		// TODO Auto-generated method stub
		return emp.companyTotalEmployee();
	}

}
