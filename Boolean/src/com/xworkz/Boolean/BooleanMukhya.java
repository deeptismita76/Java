package com.xworkz.Boolean;

public class BooleanMukhya {

	public static void main(String[] args) {
		
		Boolean bool = new Boolean(true);
		boolean bl = bool.booleanValue();
		System.out.println(bl);
		
		int val = bool.compareTo(true);
		System.out.println(val);
		
		bl = bool.equals(true);
		System.out.println(bl);
				
		val = bool.hashCode();
		System.out.println(val);
		
		String str = bool.toString();
		System.out.println(str);
		
		bool = new Boolean("true");
		bl = bool.booleanValue();
		System.out.println(bl);
		
		val = bool.compareTo(true);
		System.out.println(val);
		
		bl = bool.equals(true);
		System.out.println(bl);
				
		val = bool.hashCode();
		System.out.println(val);
		
		str = bool.toString();
		System.out.println(str);
				
						
	}

}
