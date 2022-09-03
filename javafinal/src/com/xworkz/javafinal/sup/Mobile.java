package com.xworkz.javafinal.sup;

public abstract class Mobile {

	private final String brandName;
	
	public Mobile(String brandName) {
		
		this.brandName = brandName;
	}
	protected abstract void playingGames();
	protected abstract void calculator();
	protected void browsing() {
		System.out.print("Browsing net");
	}
	public String getBrandName() {
		return brandName;
	}
	
}
