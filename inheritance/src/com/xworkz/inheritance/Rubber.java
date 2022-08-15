package com.xworkz.inheritance;

public class Rubber {
	
	String color;
	double price;
	double weight;
	String brand;
	String sport;
	
	public Rubber() {
		
		System.out.println("Rubber Constructor.");
	}
	
	void torisu() {
		
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.weight);
		System.out.println(this.brand);
		System.out.println(this.sport);

	}

}
