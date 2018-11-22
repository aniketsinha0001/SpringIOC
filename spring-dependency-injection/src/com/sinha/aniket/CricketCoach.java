package com.sinha.aniket;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	// Add new Field for Team
	private String teamName;
	private String emailAddress;
	
	//Add Field to provide data from properties files
	
	private String playerName;
	private String captain;
	
	
	public void setFortuneService(FortuneService fs) {
		fortuneService=fs;
		System.out.println("Inside Setter method of class CrickerCoach");
	}
	
	
	public CricketCoach(){
		
		System.out.println("Inside CrickerCoachclass: inside default constructor");
	}

	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Practice fast Bowling...";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Message from Cricket Coach: "+fortuneService.getfortune();
	}

	public void setEmailAddress(String emailAddress){
		
		this.emailAddress=emailAddress;		
		System.out.println("Setting Email Address");
		
	}
	public void setTeamName(String teamName){
		this.teamName=teamName;
		System.out.println("Setting Team Name");
	}
	
	public String getEmailAddress(){
		
		return emailAddress;
	}
	
	public String getTeamName(){
		
		return teamName;
	}
	public void setPlayerName(String playerName){
		this.playerName=playerName;
		System.out.println("Player Name is Set");
	}
	public void setCaptain(String captain){
		this.captain=captain;
		System.out.println("Captain is Set");
	}
	public String getPlayerName(){
		return playerName;
	}
	public String getCaptain(){
		return captain;
	}
}
