package com.sinha.aniket;

public class Car {
	private String[] carName;
    private Engine[] engine;
    
   
	public void setCarName(String[] carName) {
		this.carName = carName;
	}

	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}
	
	public void printCarDetails(){
		for(String car:carName){
			System.out.println(car);
		}
		for(Engine e:engine){
			System.out.println(e.getModelYear());
		}
		
	}
	
}
