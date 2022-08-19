package com.xworkz.aug19_inheritance.sub;

import com.xworkz.aug19_inheritance.sup.Market;

public class SuperMarket extends Market{
	public String superMarketName;
	public String location;
	public int noOfStaff;
	
	public SuperMarket(String typeOfMarket,double openTime,double closeTime,String superMarketName,String location,int noOfStaff) {
		
		super(typeOfMarket,openTime,closeTime);
		this.superMarketName = superMarketName;
		this.location =  location;
		this.noOfStaff = noOfStaff;
		System.out.println("Sub Class Const.");
	}

	public void display() {
		
		System.out.println(super.typeOfMarket);
		System.out.println(super.openTime);
		System.out.println(super.closeTime);
		System.out.println(this.superMarketName);
		System.out.println(this.location);
		System.out.println(this.noOfStaff);
	}

}
