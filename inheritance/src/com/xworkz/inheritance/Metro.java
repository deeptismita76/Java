package com.xworkz.inheritance;

public class Metro extends Train {
	
	public Metro(String name,String startingPoint,String endPoint,double ticketPrice,double timeTaken) {
		
		System.out.println("Metro Constructor.");
		this.name = name;
		this.startingPoint = startingPoint;
		this.endPoint = endPoint;
		this.ticketPrice = ticketPrice;
		this.timeTaken = timeTaken;
	}

}
