package com.xworkz.city.inheritance.sub;

import com.xworkz.city.inheritance.sup.City;

public class BangaluruCity extends City {

	public String famousFor;
	public double areaInkmSqr;
	public String mayor;

	public BangaluruCity(String name, int pin, String state, String famousFor, double areaInkmSqr, String mayor) {
		super(name, pin, state);
		this.famousFor = famousFor;
		this.areaInkmSqr = areaInkmSqr;
		this.mayor = mayor;
	}

	public BangaluruCity(String name, int pin, String state) {
		super(name, pin, state);
	}
	
	public void torisu() {
		
		System.out.println(super.name);
		System.out.println(super.pin);
		System.out.println(super.state);
		System.out.println(this.famousFor);
		System.out.println(this.areaInkmSqr);
		System.out.println(this.mayor);
		

	}
}
