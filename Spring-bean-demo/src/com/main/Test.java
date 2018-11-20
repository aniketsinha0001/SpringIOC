package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.solution.CSK;
import com.solution.IPLTeams;
import com.solution.MI;
import com.solution.RCB;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		IPLTeams rcbian=context.getBean("rcb", RCB.class);
		IPLTeams mindian=context.getBean("mi",MI.class);
		IPLTeams csk=context.getBean("csk", CSK.class);
		RCB rcb=context.getBean("rcb",RCB.class);
		System.out.println(rcbian.teamName()+" "+rcbian.teamCaptain()+" "+rcb.bestPlayer());
		
		System.out.println(mindian.teamName()+" "+mindian.teamCaptain());
		System.out.println(csk.teamName()+" "+csk.teamCaptain());
		context.close();
	}
}