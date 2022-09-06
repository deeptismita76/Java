package com.xworkz.interfacetask2.follower;

import com.xworkz.interfacetask2.rules.PubRule;

public class CustomerPubRule implements PubRule {

	@Override
	public boolean dressCodefollowed() {
		System.out.println("calling dressCodefollowed");
		return true;
	}

	@Override
	public int age() {
		System.out.println("calling age");
		return 30;
	}

	@Override
	public boolean validProof() {
		System.out.println("calling validProof");
		return true;
	}

}
