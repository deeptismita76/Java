package com.xworkz.inheritance;

public class Ball extends Rubber{
	
	public Ball(String color,double price,double weight,String brand,String sport) {

		System.out.println("Ball Constructor.");
		this.color = color;
		this.price = price;
		this.weight = weight;
		this.brand = brand;
		this.sport = sport;
	}
}
