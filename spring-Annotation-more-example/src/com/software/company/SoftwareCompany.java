package com.software.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.software.employee.EmployeeDetails;

@Component
@PropertySource("classpath:employee.properties")
public class SoftwareCompany implements Company{

	private EmployeeDetails empDetails;
	
	
	@Value("${employee.empName}")
	private String empName;
	
	@Value("${employee.empAddress}")
	private String empAddress;
		
	
	@Override
	public String companyName() {
		// TODO Auto-generated method stub
		return "Microsoft";
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String revenue() {
		// TODO Auto-generated method stub
		return "30 bilion $";
	}

	public EmployeeDetails getEmpDetails() {
		return empDetails;
	}
	
	@Autowired
	@Qualifier("softwareEmployee")
	public void setEmpDetails(EmployeeDetails empDetails) {
		this.empDetails = empDetails;
	}

	@Override
	public String empSalary() {
		// TODO Auto-generated method stub
		return empDetails.empSalary();
	}

	@Override
	public String companyTotalEmployee() {
		// TODO Auto-generated method stub
		return empDetails.companyTotalEmployee();
	}

}
