package com.xworkz.inheritance;

public class Monkey {

	char gender;
	String cast;
	int age;
	boolean working;
	boolean married;
	
	public Monkey() {
		
		System.out.println("Monkey Constructor.");
	}
	void torisu() {
		
		System.out.println(this.gender);
		System.out.println(this.cast);
		System.out.println(this.age);
		System.out.println(this.working);
		System.out.println(this.married);
	}
}
