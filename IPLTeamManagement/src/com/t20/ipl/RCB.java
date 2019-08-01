package com.t20.ipl;

public class RCB implements IPLTeams{
	
	private String captain;
	private int age;
	private	String player1;
	private String player2;
	private String player3;
	
	@Override
	public String iplTeamName() {
		return "RoyalChallengerBangalore!";
	}
	public String getPlayer1() {
		return player1;
	}
	public void setPlayer1(String player1) {
		this.player1 = player1;
	}
	public String getPlayer2() {
		return player2;
	}
	public void setPlayer2(String player2) {
		this.player2 = player2;
	}
	public String getPlayer3() {
		return player3;
	}
	public void setPlayer3(String player3) {
		this.player3 = player3;
	}
	RCB(String captain){
		this.captain=captain;
	}
	RCB(int age){
		this.age=age;
	}
	
	public String getCaptainDetails(){
		return captain;
	}

}
