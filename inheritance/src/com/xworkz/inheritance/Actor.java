package com.xworkz.inheritance;

public class Actor {
	
	int age;
	String from;
	int noOfMovies;
	String latestMovie;
	int noOfAwards;
	
	
	public Actor() {

		System.out.println("Base Cnstructor.");
	}
	void torisu() {
		
		System.out.println(this.age);
		System.out.println(this.from);
		System.out.println(this.noOfMovies);
		System.out.println(this.latestMovie);
		System.out.println(this.noOfAwards);

	}
}
