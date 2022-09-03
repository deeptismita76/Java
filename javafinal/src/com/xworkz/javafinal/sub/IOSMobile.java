package com.xworkz.javafinal.sub;

import com.xworkz.javafinal.sup.Mobile;

public class IOSMobile extends Mobile {

	
	public IOSMobile(String brandName) {
		super(brandName);
	}
	@Override
	public void playingGames() {

		System.out.println("playing game in IOS");
	}

	@Override
	public void calculator() {
		System.out.println("calculator of IOS");
		
	}

	@Override
	public void browsing() {
		super.browsing();
		System.out.println(" on IOS");
	}



}
