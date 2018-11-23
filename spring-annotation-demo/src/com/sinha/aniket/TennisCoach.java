package com.sinha.aniket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

//	@Autowired
	private FortuneService fs;
	
	// Constructor Injection with Autowiring
	
	/*@Autowired
	public TennisCoach(FortuneService fs){
		this.fs=fs;
	}*/
	
	// For Field Injection just use Autowired nothing else
	
	@Autowired
	public void setFortuneService(FortuneService fs){
		this.fs=fs;
	}
	
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice your Backhand Volley!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}
	
	@Autowired
	public void doAnything(){
		System.out.println("Any Method Invoked using Autowired!");
	}

}
