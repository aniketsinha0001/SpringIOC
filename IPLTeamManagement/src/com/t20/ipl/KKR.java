package com.t20.ipl;

import java.util.List;

public class KKR implements IPLTeams {
	
	private String captain;
	
	private List players;
	
	@Override
	public String iplTeamName() {
		return "KolkataKnightRiders!";
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public List getPlayers() {
		return players;
	}

	public void setPlayers(List players) {
		this.players = players;
	}
	
}
