package com.sinha.aniket;

public class KnightRiders implements IPLTournament{
	
	private String topRunPlayer;
	private String topRun;
	
	@Override
	public String teamName() {
		// TODO Auto-generated method stub
		return "KKR";
	}

	public String getTopRunPlayer() {
		return topRunPlayer;
	}

	public void setTopRunPlayer(String topRunPlayer) {
		this.topRunPlayer = topRunPlayer;
	}

	public String getTopRun() {
		return topRun;
	}

	public void setTopRun(String topRun) {
		this.topRun = topRun;
	}

	@Override
	public String manOftheServies() {
		// TODO Auto-generated method stub
		return null;
	}

}
