package com.xworkz.inheritance;

public class Plane {
	
	public double weight;
	public String startingPoint;
	public String endPoint;
	public int noOfSeats;
	public double ticketPrice;
	
	public Plane() {
		
		System.out.println("Plane Constructor.");
	}
	
	public void torisu() {
		
		System.out.println(this.weight);
		System.out.println(this.startingPoint);
		System.out.println(this.endPoint);
		System.out.println(this.noOfSeats);
		System.out.println(this.ticketPrice);

	}
	
}
