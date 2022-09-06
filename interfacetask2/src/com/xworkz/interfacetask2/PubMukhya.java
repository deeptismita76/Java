package com.xworkz.interfacetask2;

import com.xworkz.interfacetask2.follower.CustomerPubRule;
import com.xworkz.interfacetask2.rules.PubRule;
import com.xworkz.interfacetask2.user.DownTownPub;

public class PubMukhya {

	public static void main(String[] args) {

		PubRule pubRule = new CustomerPubRule();
		
		DownTownPub downTownPub = new DownTownPub(pubRule);
		downTownPub.checkRules();
	}

}
