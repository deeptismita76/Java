package com.xworkz.classtask.follower;

import com.xworkz.classtask.rules.GymRules;

public class DeeptiGymRules implements GymRules {
	
	@Override
	public Boolean wareShoes() {
		System.out.println("running wareShoes");
		return true;
	}

	@Override
	public Double monthlyFees() {
		System.out.println("running monthlyFees");
		return 500D;
	}

	@Override
	public Boolean unisex() {
		System.out.println("running unisex");
		return true;
	}

}
