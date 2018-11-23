package com.sinha.aniket;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloLifeCycle {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		
		BeanLifeCycleExample b1 = context.getBean("example", BeanLifeCycleExample.class);
		
		System.out.println(b1.demo());
		
		context.close();
		
	}

}
