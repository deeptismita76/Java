package com.xworkz.inheritance;

public class Xworkz extends Institute {

	public Xworkz(String founder,int since,String courseName,double fees,String[] namesOfCourse) {
		
		System.out.println("Xworkz Condtructor.");
		this.founder = founder;
		this.since = since;
		this.courseName = courseName;
		this.fees = fees;
		this.namesOfCourse = namesOfCourse;
	}
}
