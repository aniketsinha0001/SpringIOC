package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sinha.aniket.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach=context.getBean("track", Coach.class);
		
		System.out.println(theCoach.getDailyworkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
		
	}

}
