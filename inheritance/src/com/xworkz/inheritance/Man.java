package com.xworkz.inheritance;

public class Man extends Monkey {

	public Man(char gender,String cast,int age,boolean working,boolean married) {
		
		System.out.println("Man Constructor.");
		this.gender = gender;
		this.cast = cast;
		this.age = age;
		this.working = working;
		this.married = married;
	}
}
