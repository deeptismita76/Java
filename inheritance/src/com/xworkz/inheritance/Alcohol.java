package com.xworkz.inheritance;

public class Alcohol {

	double weight;
	double price;
	String name;
	String color;
	String[] ingredients;

	public Alcohol() {

		System.out.println("Alcohol Contructor.");
	}

	void torisu() {
		
		System.out.println(this.weight);
		System.out.println(this.price);
		System.out.println(this.name);
		System.out.println(this.color);
		for (int index = 0; index < this.ingredients.length; index++) {
			System.out.print(this.ingredients[index]);
			
			if(index >= 0 && index <= this.ingredients.length-2 ) {
				System.out.print(",");
			}
		}
	}
}
