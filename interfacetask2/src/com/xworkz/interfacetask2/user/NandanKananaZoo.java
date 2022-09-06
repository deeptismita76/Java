package com.xworkz.interfacetask2.user;

import com.xworkz.interfacetask2.rules.ZooRules;

public class NandanKananaZoo {

	ZooRules rules;

	public NandanKananaZoo(ZooRules rules) {
		this.rules = rules;

	}
	public Boolean checkRules() {
		Boolean var=rules.feedingAnimal(false);
		Boolean ref=rules.teaseAnimal(false);
		Double price=rules.ticketPrice(50D);
		if(var == true && ref == true && price < 50) {
			System.err.println("Rules are not followed");
		}else {
			System.out.println("Rules are allowed");
		}
		return false;
	}

}
