package com.driver.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sinha.aniket.Car;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	
		
		Car car=context.getBean("mycar",Car.class);
		
		car.printCarDetails();
	}

}
