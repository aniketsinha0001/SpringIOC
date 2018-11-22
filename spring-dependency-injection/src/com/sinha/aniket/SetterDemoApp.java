package com.sinha.aniket;
// This class is used for Setter Injection
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String args[]){
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach cc=context.getBean("cricket", CricketCoach.class);
		
		System.out.println(cc.getDailyworkout()+" "+cc.getDailyFortune());
		
		System.out.println(cc.getEmailAddress()+" "+cc.getTeamName());
		
		System.out.println("Reading Value From Properties Files------------");
		
		System.out.println(cc.getCaptain()+" "+cc.getPlayerName());
		
		context.close();
	}

}
