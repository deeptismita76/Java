package com.xworkz.inheritance;

public class Sudeep extends Actor {
	
	public Sudeep(int age,String from,int noOfMovies,String latestMovie,int noOfAwards) {
		
		System.out.println("Derived Constructor.");
		this.age = age;
		this.from = from;
		this.noOfMovies = noOfMovies;
		this.latestMovie = latestMovie;
		this.noOfAwards = noOfAwards;
	}

}
