package com.xworkz.inheritance;

public class Institute {
	
	String founder;
	int since;
	String courseName;
	double fees;
	String[] namesOfCourse;

	public Institute() {
		
		System.out.println("Institute Constructor.");
	}
	
	void torisu() {
		
		System.out.println(this.founder);
		System.out.println(this.since);
		System.out.println(this.courseName);
		System.out.println(this.fees);

		for(int index = 0; index<this.namesOfCourse.length; index++) {
			
			System.out.println(this.namesOfCourse[index]);
		}
	}
}
