package com.sinha.aniket;

import com.reward.holder.IPLTopPlayer;

public class RCB implements IPLTournament{
	
	private IPLTopPlayer player;
	@Override
	public String teamName() {
		return "RCB";
	}
	
	public RCB(IPLTopPlayer player) {
		this.player=player;
	}

	@Override
	public String manOftheServies() {
		// TODO Auto-generated method stub
		return "Best Batsman: "+player.orangeCapHolder();
	}

}
