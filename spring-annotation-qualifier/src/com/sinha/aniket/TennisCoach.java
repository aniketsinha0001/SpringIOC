package com.sinha.aniket;

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

}
