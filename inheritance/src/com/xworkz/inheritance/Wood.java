package com.xworkz.inheritance;

public class Wood {
	
	public double weight;
	public double price;
	public String type;
	public double length;
	public String color;
	public Wood() {
		
		System.out.println("Wood Constructor.");
	}
	void torisu() {
		
		System.out.println(this.weight);
		System.out.println(this.price);
		System.out.println(this.type);
		System.out.println(this.length);
		System.out.println(this.color);

	}

}
