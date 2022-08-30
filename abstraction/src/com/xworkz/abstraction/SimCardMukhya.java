package com.xworkz.abstraction;

import com.xworkz.abstraction.sub.*;
import com.xworkz.abstraction.sup.SimCard;

public class SimCardMukhya {

	public static void main(String[] args) {
		
		System.out.println("Prepaid");
		System.out.println("=======");
		SimCard simCard = new PrepaidSimCard();
		if(simCard instanceof PrepaidSimCard) {
			PrepaidSimCard convo = (PrepaidSimCard)simCard;
			convo.call();
			convo.sms();
			convo.mms();
			convo.checkBalance();
		}
		System.out.println();
		System.out.println("Postpaid");
		System.out.println("========");
		SimCard simCard2 = new PostpaidSimCard();
		if(simCard2 instanceof PostpaidSimCard) {
			PostpaidSimCard convo = (PostpaidSimCard)simCard2;
			convo.call();
			convo.sms();
			convo.mms();
			convo.checkBalance();
		}
	}

}
