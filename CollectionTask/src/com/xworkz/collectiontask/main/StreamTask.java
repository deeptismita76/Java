package com.xworkz.collectiontask.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StreamTask {

	public static void main(String[] args) {

		List<String> str = new ArrayList<String>();
		Collections.addAll(str, "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa",
				"Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh",
				"Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim",
				"Tamil Nadu", "Telangana", "Tripura", "Uttarakhand", "Uttar Pradesh", "West Bengal");
		System.out.println(str);
		
		System.out.println("State Names Ends with 'A' :");
		System.out.println("===========================");
		str.stream().filter((var)->var.endsWith("a")).forEach((ref)->System.out.println(ref));
		
		System.out.println("State Names Starts with 'K' :");
		System.out.println("=============================");
		str.stream().filter((var)->var.startsWith("K")).forEach((ref)->System.out.println(ref));
		
		System.out.println("State Names Contains with 'L' :");
		System.out.println("================================");
		str.stream().filter((var)->var.contains("l")).forEach((ref)->System.out.println(ref));

		System.out.println("State Names Contains with 'D' :");
		System.out.println("================================");
		str.stream().filter((var)->var.contains("d")).forEach((ref)->System.out.println(ref));
		
		System.out.println("State Names Contains with 'R' :");
		System.out.println("================================");
		str.stream().filter((var)->var.contains("r")).forEach((ref)->System.out.println(ref));
		
		System.out.println("State Names Contains with 'H' :");
		System.out.println("================================");
		str.stream().filter((var)->var.contains("h")).forEach((ref)->System.out.println(ref));
		
		System.out.println("State Names in Lowercase :");
		System.out.println("==========================");
		str.stream().forEach((ref)->System.out.println(ref.toLowerCase()));

		System.out.println("State Names in Uppercase :");
		System.out.println("==========================");
		str.stream().forEach((ref)->System.out.println(ref.toUpperCase()));

		System.out.println("State Names having >10 Characters :");
		System.out.println("==========================");
		str.stream().filter((var)->var.length()>10).forEach((ref)->System.out.println(ref));
		
		System.out.println("State Names having <5 Lowercase :");
		System.out.println("==========================");
		str.stream().filter((var)->var.length()<5).forEach((ref)->System.out.println(ref));
		
		System.out.println("State Names in Uppercase :");
		System.out.println("==========================");
		str.stream().forEach((ref)->System.out.println(ref));
		}
		

}
