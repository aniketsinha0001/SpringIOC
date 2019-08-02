package com.aniket.MavenProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sinha.aniket.Company;
import com.sinha.aniket.NetcrackerTechnology;
import com.sinha.aniket.TCS;




public class App 
{
    public static void main( String[] args )
    {
        
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Company c1=context.getBean("nc",NetcrackerTechnology.class);
    	
    	Company c2=context.getBean("tc",TCS.class);

    	
    	System.out.println(c1.employeeId()+" "+c1.employeeName()+" ");
  
    	System.out.println(c2.employeeId()+" "+c2.employeeName());

    	
    	context.close();
    	
    }
}
