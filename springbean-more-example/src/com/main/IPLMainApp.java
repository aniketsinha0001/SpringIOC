package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sinha.aniket.IPLTournament;
import com.sinha.aniket.KnightRiders;
import com.sinha.aniket.MumbaiIndians;
import com.sinha.aniket.RCB;

public class IPLMainApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context	= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IPLTournament t1=context.getBean("rcb",RCB.class);
		IPLTournament t2=context.getBean("mi",MumbaiIndians.class);
		KnightRiders t3=context.getBean("kkr",KnightRiders.class);
		
		System.out.println(t1.teamName());
		System.out.println(t2.teamName());
		System.out.println(t3.teamName());
		System.out.println("Man of the Series Holder Player :"+ t1.manOftheServies());
		System.out.println("Man of the Series Holder Player :"+ t2.manOftheServies());
		
		System.out.println("TOP Run SCorer Player in a match :"+ t3.getTopRunPlayer()+" "+t3.getTopRun());
	}
}
