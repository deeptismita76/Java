package com.xworkz.javafinal.sub;

import com.xworkz.javafinal.sup.Mobile;

public class AndroidMobile extends Mobile{
	
	
	public AndroidMobile(String brandName) {
		super(brandName);
	}

	@Override
	public void playingGames() {
		System.out.println("playing game in android");
	}

	@Override
	public void calculator() {
		System.out.println("calculator of android");
	}

	@Override
	public void browsing() {
		super.browsing();
		System.out.println(" on android");
	}
	
	
}
