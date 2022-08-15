package com.xworkz.inheritance;

public class Bat extends Wood{

	public Bat(double weight,double price,String type,double length,String color) {
		
		System.out.println("Bat Constructor.");
		this.weight = weight;
		this.price = price;
		this.type = type;
		this.length = length;
		this.color = color;
	}
}
