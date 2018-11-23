package com.sinha.aniket;

public class BeanLifeCycleExample implements Example{

	public BeanLifeCycleExample(){
		System.out.println("Constructor BeanLifeCycleExample is invoked");
	}
	
	@Override
	public String demo() {
		// TODO Auto-generated method stub
		return "Welcome to Demo Method";
	}
	// Add init method:
	public void doMyStartUpStuff(){
		System.out.println("Inside Method doMyStartupStuff");
	}
	
	// Add the destroy method
	public void doMyCleanUpStuff(){
		System.out.println("Inside Method doMycleanupStuff");
	}

}
