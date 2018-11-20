package com.solution;

public class RCB implements IPLTeams{
	
	private IPLStarPlayer starPlayer;
	
	public void setStarPlayer(IPLStarPlayer starPlayer) {
		this.starPlayer = starPlayer;
	}
	
	@Override
	public String teamName() {
		// TODO Auto-generated method stub
		return "RCB";
	}

	@Override
	public String teamCaptain() {
		// TODO Auto-generated method stub
		return "Virat kohli";
	}
	public String bestPlayer(){
		
		return starPlayer.orangeCapHolder();
	}

}
