package com.xworkz.aug19_inheritance.subofsub;

import com.xworkz.aug19_inheritance.sub.SuperMarket;

public class OnlineSuperMarket extends SuperMarket{

	public String onlineSMName;
	public String availInCities;
	public double deliverIn_Time;
	public OnlineSuperMarket(String typeOfMarket,double openTime,double closeTime,String superMarketName,String location,int noOfStaff,String onlineSMName,String availInCities,double deliverIn_Time) {
		
		super(typeOfMarket,openTime,closeTime,superMarketName,location,noOfStaff);
		this.onlineSMName = onlineSMName;
		this.availInCities = availInCities;
		this.deliverIn_Time = deliverIn_Time;
		System.out.println("sub of sub clss const.");
	}

	public void display() {
		
		System.out.println(super.typeOfMarket);
		System.out.println(super.openTime);
		System.out.println(super.closeTime);
		System.out.println(super.superMarketName);
		System.out.println(super.location);
		System.out.println(super.noOfStaff);
		System.out.println(this.onlineSMName);
		System.out.println(this.availInCities);
		System.out.println(this.deliverIn_Time);
	}
}
