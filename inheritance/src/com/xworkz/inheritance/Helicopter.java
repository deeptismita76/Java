package com.xworkz.inheritance;

public class Helicopter extends Plane {

	public Helicopter(double weight,String startingPoint,String endPoint,int noOfSeats,double ticketPrice) {
		
		System.out.println("Helicopter Constructor.");
		this.weight = weight;
		this.startingPoint = startingPoint;
		this.endPoint = endPoint;
		this.noOfSeats = noOfSeats;
		this.ticketPrice = ticketPrice;
	}
}
