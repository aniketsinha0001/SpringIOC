package com.sinha.aniket;

public class BaseBallCoach implements Coach{

	private FortuneService fortuneService;
	
	BaseBallCoach(FortuneService fortuneService){
		
		this.fortuneService=fortuneService;
	}
	
	
	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Pratice batting 5 hrs daily!";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getfortune();
	}

}
