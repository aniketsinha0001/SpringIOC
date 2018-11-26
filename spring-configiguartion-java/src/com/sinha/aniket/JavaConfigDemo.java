package com.sinha.aniket;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AnnonationComponentScanusingJava.class);
		
		Employee demo=context.getBean("employee", Employee.class);
		System.out.println(demo.helloDemo());
		
		System.out.println(demo.empSalary());
		System.out.println(demo.getName()+" "+demo.getEmailId());
		context.close();
		
	}

}
