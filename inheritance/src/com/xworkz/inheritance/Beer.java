package com.xworkz.inheritance;

public class Beer extends Alcohol {

	public Beer(double weight,double price,String name,String color,String[] ingredients) {
		
		System.out.println("Beer Constructor");
		this.weight = weight;
		this.price = price;
		this.name = name;
		this.color = color;
		this.ingredients = ingredients;
	}
}
