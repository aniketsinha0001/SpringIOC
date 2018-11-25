package com.sinha.aniket;

import com.reward.holder.IPLTopPlayer;

public class MumbaiIndians  implements IPLTournament {

	private IPLTopPlayer player;
	

	public IPLTopPlayer getPlayer() {
		return player;
	}

	public void setPlayer(IPLTopPlayer player) {
		this.player = player;
	}

	@Override
	public String teamName() {
		// TODO Auto-generated method stub
		return "MI";
	}

	@Override    
	public String manOftheServies() {
		// TODO Auto-generated method stub
		return "Best Bowling: "+player.purpleCapHolder();
	}
	

}
