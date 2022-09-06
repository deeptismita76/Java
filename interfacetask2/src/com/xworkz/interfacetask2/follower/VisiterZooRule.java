package com.xworkz.interfacetask2.follower;

import com.xworkz.interfacetask2.rules.ZooRules;

public class VisiterZooRule implements ZooRules {

	
	@Override
	public Double ticketPrice(Double ticket) {
		return ticket;
	}

	@Override
	public Boolean feedingAnimal(Boolean notAllowed) {
		
		return notAllowed;
	}

	@Override
	public Boolean teaseAnimal(Boolean notAllowed) {
		return notAllowed;
	}
	
	

}
