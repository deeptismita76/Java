package com.xworkz.inheritance;

public class Mirror extends Glass{

	public Mirror(double height,double weight,double price,boolean broken,String quality) {
		
		System.out.println("Mirror Constructor.");
		this.height = height;
		this.weight = weight;
		this.price = price;
		this.broken = broken;
		this.quality = quality;
	}
}
