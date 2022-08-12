package com.xworkz.Integer;

public class IntegerMukhya {

	public static void main(String[] args) {
		
		//Integer(int)
		Integer integer = new Integer(123);
		byte bt = integer.byteValue();
		System.out.println(bt);
		
		int val = integer.compareTo(123);
		System.out.println(val);
		
		double dob = integer.doubleValue();
		System.out.println(dob);
		
		boolean bool = integer.equals(123);
		System.out.println(bool);
		
		float ft = integer.floatValue();
		System.out.println(ft);
		
		val = integer.hashCode();
		System.out.println(val);
		
		val = integer.intValue();
		System.out.println(val);
		
		long lg = integer.longValue();
		System.out.println(lg);
		
		short sh = integer.shortValue();
		System.out.println(sh);
		
		String str = integer.toString();
		System.out.println(str);
		
		//Integer(String)
		integer = new Integer("456");
		bt = integer.byteValue();
		System.out.println(bt);
		
		val = integer.compareTo(145);
		System.out.println(val); 
		
		dob = integer.doubleValue();
		System.out.println(dob);
	}

}
