package com.xworkz.javaprotected.sup;

public class HondaAutomobile extends Automobile {
	
	public double openTime;
	public double closeTime;
	
	public HondaAutomobile(double openTime,double closeTime) {
			
		this.openTime = openTime;
		this.closeTime = closeTime;
	}
	
	@Override
	public void printData() {
		super.printData();
		System.out.println("open time is " + this.openTime);
		System.out.println("close time is " + this.closeTime);
	}

}
