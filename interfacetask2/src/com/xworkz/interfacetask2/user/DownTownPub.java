package com.xworkz.interfacetask2.user;

import com.xworkz.interfacetask2.rules.PubRule;

public class DownTownPub {
	
	private PubRule pubRule;

	public DownTownPub(PubRule pubRule) {
		super();
		this.pubRule = pubRule;
	}
	
	public void checkRules() {
		System.out.println("checking the rules");
		boolean dcode=pubRule.dressCodefollowed();
		int age=pubRule.age();
		boolean id=pubRule.validProof();
		if(dcode && age>21 && id) {
			System.out.println("Rules are followed");
		}else {
			System.err.println("Rules are not followed");
		}
	}

}
