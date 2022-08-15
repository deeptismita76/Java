package com.xworkz.inheritance;

public class Bike extends Cycle{
	
	public Bike( String name,double price,double mileage,double engineCapacity,double fuleCapacity) {
	
		System.out.println("Bike Constructor.");
		this.name = name;
		this.price = price;
		this.mileage = mileage;
		this.engineCapacity = engineCapacity;
		this.fuleCapacity = fuleCapacity;
	}

}
