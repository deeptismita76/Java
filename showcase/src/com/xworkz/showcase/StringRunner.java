package com.xworkz.showcase;

public class StringRunner {
	

	public static void main(String[] args) {
		//ctrl+space(suggestions/auto-complete) and ctrl+shift+f(format)
		
		String name="Xworkz";
		
		char at=name.charAt(2);
		System.out.println(at);
		int value=name.compareTo("Xworkz");
		System.out.println(value);
		
		String king=new String("Ashoka");
		int check=king.compareToIgnoreCase("ashoka");
		System.out.println("check "+ check);
		king =king.concat("the great");
		System.out.println(king);
		Integer integer=new Integer(45);
		// Integer, Boolean, Character
		//= all constrtctors 
		// 15 instance methods 
		//5 static methods 
		// 

	}

}
