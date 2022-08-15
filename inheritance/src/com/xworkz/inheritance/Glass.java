package com.xworkz.inheritance;

public class Glass {
	
	double height;
	double weight;
	double price;
	boolean broken;
	String quality;
	
	public Glass() {
		
		System.out.println("Glass Constructor.");
	}
	
	void torisu() {
		
		System.out.println(this.height);
		System.out.println(this.weight);
		System.out.println(this.price);
		System.out.println(this.broken);
		System.out.println(this.quality);

	}

}
