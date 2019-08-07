package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sinha.aniket.GCECT;
import com.sinha.aniket.TechnoIndia;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GCECT gc = context.getBean("gcect", GCECT.class);
		TechnoIndia tict = context.getBean("tict", TechnoIndia.class);
		

		tict.collegeName();
		System.out.println(tict.getBranch());
		System.out.println("GCECT "+gc.getBranchwiseFees());
		
		
	}

}
