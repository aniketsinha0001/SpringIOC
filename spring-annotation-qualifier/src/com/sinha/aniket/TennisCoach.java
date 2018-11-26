package com.sinha.aniket;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fs;
	
	@Autowired
	@Qualifier("randomFortuneService")
	public void setFortuneService(FortuneService fs){
		this.fs=fs;
	}
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice Tennis perday atlest 2 hrs";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
			
	}
	
	@PostConstruct
	public void doMystsartUpStuff(){
		System.out.println("Inside method startupstuff");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff(){
		System.out.println("Inside the CleanUpStuff");
	}

}
