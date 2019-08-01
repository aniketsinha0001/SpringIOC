package com.t20.ipl;

import java.util.ArrayList;
import java.util.List;

public class MI implements IPLTeams{
	private String captain;
	private String wicketKeeper;
	private String play1;
	private String play2;
	private String play3;
	@Override
	public String iplTeamName() {

		return "MumbaiIndians!";
	}
	
	MI(String captain, String wicketKeeper ){
		this.captain=captain;
		this.wicketKeeper=wicketKeeper;
	}
	
	public String getCaptainDetails(){
		return captain;
	}
	
	MI(String play1, String play2,String play3){
		this.play1=play1;
		this.play2=play2;
		this.play3=play3;
	}
	public List getPlayerDetails(){
		List l=new ArrayList<>();
		l.add(wicketKeeper);
		l.add(play1);
		l.add(play2);
		l.add(play3);
		return l;
	}
}
