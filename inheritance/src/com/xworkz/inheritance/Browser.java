package com.xworkz.inheritance;

public class Browser {
	
	public boolean useInternet;
	public String website;
	public double ratings;
	public String lang;
	public int year;
	public Browser() {
		System.out.println("Browser Constructor.");
	}
	public void torisu() {
		
		System.out.println(this.useInternet);
		System.out.println(this.website);
		System.out.println(this.ratings);
		System.out.println(this.lang);
		System.out.println(this.year);

	}


}
