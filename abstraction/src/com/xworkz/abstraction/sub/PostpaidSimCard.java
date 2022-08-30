package com.xworkz.abstraction.sub;

import com.xworkz.abstraction.sup.SimCard;

public class PostpaidSimCard extends SimCard {

	@Override
	public void call() {
		System.out.println("Making cll.");
	}

	@Override
	public void sms() {
		System.out.println("sending msg.");
	}

	@Override
	public void mms() {
		System.out.println("Sending MMS.");		
	}

	@Override
	public void checkBalance() {
		System.out.println("Checking Balance.");		
	}

}
