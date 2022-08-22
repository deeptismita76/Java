package com.xworkz.aug22overriding.sup;

public class Cricket {
	
	public String country;
	public String captain;
	public int age;
	
	public void setCountry(String country) {
		this.country = country;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean entertainment(String matchType) {
		System.out.println("entertainment method of parent class.");
		if(matchType == "test match") {
			return true;
		}
		if(matchType == "one day") {
			return true;
		}
		if (matchType == "T20") {
			return true;
		}
		return false;
	}
	public double presentation(String matchType) {
		System.out.println("presentation method of parent class.");
		if(matchType == "test match") {
			return 2.5;
		}
		if(matchType == "one day") {
			return 2.3;
		}
		if (matchType == "T20") {
			return 1.5;
		}
		return 0.0;
	}
	public void printData() {
		
		System.out.println(this.country);
		System.out.println(this.captain);
		System.out.println(this.age);
	}
}
