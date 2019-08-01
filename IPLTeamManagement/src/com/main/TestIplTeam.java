package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.t20.ipl.CSK;
import com.t20.ipl.IPLTeams;
import com.t20.ipl.KKR;
import com.t20.ipl.MI;
import com.t20.ipl.RCB;

public class TestIplTeam {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
				
		CSK t1=context.getBean("csk",CSK.class);
		RCB t2=context.getBean("rcb", RCB.class);
		MI t3=context.getBean("mi", MI.class);
		
		MI t5=context.getBean("mis", MI.class);
		KKR t4=context.getBean("kkr", KKR.class);
		
		System.out.println("Total Teams- "+t1.iplTeamName()+" "+t2.iplTeamName()+" "+t3.iplTeamName()+" "+t4.iplTeamName());
		
		System.out.println("CSK captain is: "+t1.getCSKCaptain()+" "+"Team Members- "+t1.getPlayers());
		
		System.out.println("MI Captain is: "+t3.getCaptainDetails()+" "+"Team Members- "+ t3);
		
		System.out.println("KKR Captain is: "+ t4.getCaptain()+" "+"Team Members- "+t4.getPlayers());
		
		System.out.println(t5.getCaptainDetails()+" "+t5.getPlayerDetails());
		
		System.out.println("RCB Captain is: "+t2.getCaptainDetails()+" "+t2.getPlayer1());
		
		context.close();
		
	}

}
