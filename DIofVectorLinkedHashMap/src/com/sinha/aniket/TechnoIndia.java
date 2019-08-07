package com.sinha.aniket;

import java.util.Vector;

public class TechnoIndia implements College{
	
	private Vector branch;
	
	public Vector getBranch() {
		return branch;
	}

	public void setBranch(Vector branch) {
		this.branch = branch;
	}

	@Override
	public void collegeName() {
		System.out.println("Techno India!");
		
	}

	@Override
	public void location() {
		System.out.println("New Town Kolkata!");
		
	}

}
