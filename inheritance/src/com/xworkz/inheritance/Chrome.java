package com.xworkz.inheritance;

public class Chrome extends Browser{
	
	public Chrome(boolean useInternet,String website,double ratings,String lang,int year) {
		
		System.out.println("Chrome Constructor.");
		this.useInternet = useInternet;
		this.website = website;
		this.ratings = ratings;
		this.lang = lang;
		this.year = year;
		
	}

}
