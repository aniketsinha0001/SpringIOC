package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sinha.aniket.Coach;

public class HelloSpringApp {

	public static void main(String args[]){

		//load the Spring Configuration Files.
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean from Container
		
		Coach theCoach	=	context.getBean("myCoach", Coach.class);
		
		//Call the method on beans
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context.
		context.close();
	}
}
