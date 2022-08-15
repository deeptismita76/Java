package com.xworkz.inheritance;

public class Train {

	public String name;
	public String startingPoint;
	public String endPoint;
	public double ticketPrice;
	public double timeTaken;
	public Train() {
		
		System.out.println("Train Constructor.");
	}
	public void torisu() {
		
		System.out.println(this.name);
		System.out.println(this.startingPoint);
		System.out.println(this.endPoint);
		System.out.println(this.ticketPrice);
		System.out.println(this.timeTaken);

	}
}
