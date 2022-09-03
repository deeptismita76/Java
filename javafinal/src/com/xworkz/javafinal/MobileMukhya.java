package com.xworkz.javafinal;

import com.xworkz.javafinal.sub.AndroidMobile;
import com.xworkz.javafinal.sub.IOSMobile;
import com.xworkz.javafinal.sup.Mobile;

public class MobileMukhya {

	public static void main(String[] args) {


		Mobile mobile = new AndroidMobile("RealMe");
		System.out.println(mobile.getBrandName());

		if(mobile instanceof AndroidMobile) {
			AndroidMobile convo = (AndroidMobile)mobile;
			convo.playingGames();
			convo.calculator();
			convo.browsing();
		}
		System.out.println();
		Mobile mobile2 = new IOSMobile("Apple");
		System.out.println(mobile2.getBrandName());
		if(mobile2 instanceof IOSMobile) {
			IOSMobile convo = (IOSMobile)mobile2;
			convo.playingGames();
			convo.calculator();
			convo.browsing();
		}
	}

}
