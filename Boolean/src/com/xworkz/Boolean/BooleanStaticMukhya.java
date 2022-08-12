package com.xworkz.Boolean;

public class BooleanStaticMukhya {

	public static void main(String[] args) {

		int val = Boolean.compare(false, true);
		System.out.println(val);
		
		boolean bool = Boolean.getBoolean("false");
		System.out.println(bool);
		
		val = Boolean.hashCode(true);
		System.out.println(val);
		
		bool = Boolean.logicalAnd(true, true);
		System.out.println(bool);
		
		bool = Boolean.parseBoolean("true");
		System.out.println(bool);
	}

}
