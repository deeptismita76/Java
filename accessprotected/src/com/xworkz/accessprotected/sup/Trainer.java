package com.xworkz.accessprotected.sup;

public class Trainer {
	
	protected String name;
	protected double exp;
	protected String specialization;
	
	protected Trainer() {
			
		System.out.println("Trainer Class default const.");
	}
	protected Trainer(String name,double exp,String specialization) {
		
		this.name = name;
		this.exp = exp;
		this.specialization = specialization;
	}
	
	protected boolean training() {
		System.out.println("trainer trains people.");
		return true;
	}
	protected boolean conductInterview() {
		
		System.out.println("trainer conducts interviews.");
		return true;
	}
	protected String coding(String courseName) {
		
		System.out.println("coding.");
		return courseName;
	}
	protected void printData() {
		
		System.out.println(this.name);
		System.out.println(this.exp);
		System.out.println(this.specialization);
	}


}
