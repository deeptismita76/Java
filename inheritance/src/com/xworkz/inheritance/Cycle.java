package com.xworkz.inheritance;

public class Cycle {
	
	 String name;
	 double price;
	 double mileage;
	 double engineCapacity;
	 double fuleCapacity;
	 Cycle() {
		
		System.out.println("Cycle Constructor.");
	}
	 
	 void torisu() {
		 
		 System.out.println(this.name);
		 System.out.println(this.price);
		 System.out.println(this.mileage);
		 System.out.println(this.engineCapacity);
		 System.out.println(this.fuleCapacity);

	 }

}
