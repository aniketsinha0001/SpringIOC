package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.software.company.Company;
import com.software.company.HardwareCompany;
import com.software.company.SoftwareCompany;

public class MainApp {
     
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		HardwareCompany c1=context.getBean("hardwareCompany", HardwareCompany.class);
		SoftwareCompany c2=context.getBean("softwareCompany", SoftwareCompany.class);
		
		System.out.println(c1.companyName()+"  "+c1.revenue());
		System.out.println(c1.empSalary()+"  "+c1.companyTotalEmployee());
		
		System.out.println(c2.companyName()+"  "+c2.revenue());	
		System.out.println(c2.empSalary()+"  "+c2.companyTotalEmployee());
		
		System.out.println("Reading data from Properties files.");
		System.out.println(c2.getEmpName()+" "+c2.getEmpAddress());

		
	}
}
