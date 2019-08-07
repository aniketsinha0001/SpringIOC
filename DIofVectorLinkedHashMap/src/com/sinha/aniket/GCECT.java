package com.sinha.aniket;

import java.util.LinkedHashMap;

public class GCECT implements College{

	private LinkedHashMap branchwiseFees;


	public LinkedHashMap getBranchwiseFees() {
		return branchwiseFees;
	}

	public void setBranchwiseFees(LinkedHashMap branchwiseFees) {
		this.branchwiseFees = branchwiseFees;
	}

	@Override
	public void collegeName() {
	
		System.out.println("GCECT");
		
	}

	@Override
	public void location() {
		System.out.println("Beliaghatta Kolkata!");
		
	}

}
