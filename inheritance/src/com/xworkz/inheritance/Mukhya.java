package com.xworkz.inheritance;

public class Mukhya {

	public static void main(String[] args) {
		
		//Chrome is a Browser.
		
		Chrome chrome = new Chrome(true,"www.chrome.com",4.3,"Java Scricpt",2008);
		chrome.torisu();
		
		System.out.println();
		//Helicopter is a Plane.
		
		Helicopter helicopter = new Helicopter(420.5,"BBSR","Delhi",50,1500);
		helicopter.torisu();
		
		System.out.println();
		//Metro is a Train.
		
		Metro metro = new Metro("NAMMO","BTM","Marahathalli",50,1.5);
		metro.torisu();
		
		System.out.println();
		//bike is a cycle.
		
		Bike bike = new Bike("TVS",69409,65,109.7,10);
		bike.torisu();
		
		System.out.println();
		//bat is a wood.
		
		Bat bat = new Bat(500,400,"Cricket bat",60,"White");
		bat.torisu();
		
		System.out.println();
		//Mirror is a Glass.
		
		Mirror mirror = new Mirror(35,30,200,false,"Good");
		mirror.torisu();
		
		System.out.println();
		//Man is a Monkey.
		
		Man man = new Man('F',"Odia",23,false,false);
		man.torisu();
		
		System.out.println();
		//Xworkz is a Institute.
		
		String[] agrs = {"core jave","sql","web services"};
		Xworkz xworkz = new Xworkz("Omkar",2018,"JAVA",25000,agrs);
		xworkz.torisu();
		
		System.out.println();
		//Java is a ProgrammingLanguage.
		
		Java java = new Java(1995,"James Gosling","Sun Micros",18,"Java 18");
		java.torisu();
		
		System.out.println();
		//Sudeep is an Actor.
		
		Sudeep sudeep = new Sudeep(48,"Karnataka",46,"Vikrant Rona",23);
		sudeep.torisu();
		
		System.out.println();
		//Ball is a Rubber.
		
		
		Ball ball = new Ball("Multicolor",129,200,"Gmefvr","Basketball");
		ball.torisu();
		
		System.out.println();
		//Beer is an Alcohol.
		
		String[] vals = {"Water","Malted Barley","Hops","CO2"};
		Beer beer = new Beer(330,82.50,"Budweiser","Brown",vals);
		beer.torisu();
		
	}

}
