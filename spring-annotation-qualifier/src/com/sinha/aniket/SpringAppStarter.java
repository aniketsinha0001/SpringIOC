package com.sinha.aniket;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppStarter {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach c1=context.getBean("tennisCoach", Coach.class);
		
		System.out.println(c1.getDailyWorkOut());
		
		System.out.println(c1.getDailyFortune());
		
		context.close();

	}

}
