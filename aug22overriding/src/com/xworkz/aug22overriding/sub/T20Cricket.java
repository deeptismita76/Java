package com.xworkz.aug22overriding.sub;

import com.xworkz.aug22overriding.sup.Cricket;

public class T20Cricket extends Cricket {
	
	public String manOfMatch(String matchType) {
		if(matchType == "test match") {
			return "MS Dhoni";
		}
		if(matchType == "one day") {
			return "Virat Kohli";
		}
		if (matchType == "T20") {
			return "Tendulkar";
		}
		return null;
	}

	@Override
	public boolean entertainment(String matchType) {
		System.out.println("entertainment method of sub class T20 cricket.");
		boolean ref = super.entertainment(matchType);
		if (ref == false) {
			if (matchType == "IPL") {
				return true;
			}
		}
		return ref;
	}
	
	

}
