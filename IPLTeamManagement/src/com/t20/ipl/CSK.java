package com.t20.ipl;

import java.util.Set;

public class CSK implements IPLTeams{

	private String captain;
	private Set players;
	
	@Override
	public String iplTeamName() {
		return "ChennaiSuperKing!";
	}
	
	CSK(String captain){
		this.captain=captain;
	}
	
	public String getCSKCaptain(){
		
		return captain;
	}
	
	public void setPlayers(Set players){
		this.players=players;
	}
	
	public Set getPlayers(){
		
		return players;
	}

}
