package com.sinha.aniket;

public class TrackCoach implements Coach{
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fService){
		fortuneService=fService;
	}
	
	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Run 5km daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "RUN MORE TODAY AS: "+ fortuneService.getfortune();
	}

}
