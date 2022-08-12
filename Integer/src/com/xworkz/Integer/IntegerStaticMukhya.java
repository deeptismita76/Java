package com.xworkz.Integer;

public class IntegerStaticMukhya {

	public static void main(String[] args) {
		
		int val = Integer.bitCount(123);
		System.out.println(val);
		
		val = Integer.compare(123, 1239);
		System.out.println(val);
		
		val = Integer.compareUnsigned(652, 676);
		System.out.println(val);
		
		Integer var = Integer.decode("54345");
		System.out.println(var);
		
		val = Integer.divideUnsigned(45, 3);
		System.out.println(val);
	}

}
