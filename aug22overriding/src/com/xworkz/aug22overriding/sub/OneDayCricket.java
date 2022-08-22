package com.xworkz.aug22overriding.sub;

import com.xworkz.aug22overriding.sup.Cricket;

public class OneDayCricket extends Cricket{
	
	public String bestBowler;
	public String bestBatsman;
	
	public void setBestBowler(String bestBowler) {
		this.bestBowler = bestBowler;
	}
	
	public void setBestBatsman(String bestBatsman) {
		this.bestBatsman = bestBatsman;
	}
	
	public String manOfSeries(String matchType) {
		if(matchType == "test match") {
			return "VIrendra Sehwag";
		}
		if(matchType == "one day") {
			return "Yuvraj Singh";
		}
		if (matchType == "T20") {
			return "David Warner";
		}
		return null;
	}

	@Override
	public boolean entertainment(String matchType) {
		System.out.println("entertainment method of sub class one day cricket.");
		boolean ref = super.entertainment(matchType);
		if(ref == false) {
			if(matchType == "IPL") {
				return true;
			}
		}
		return ref;
	}

	@Override
	public double presentation(String matchType) {
		System.out.println("presentation method of sub class one day cricket.");
		double var = super.presentation(matchType);
		if(var == 0.0) {
			if(matchType == "IPL") {
				return 1.25;
			}
		}
		return var;
	}

	@Override
	public void printData() {
		super.printData();
		System.out.println(this.bestBowler);
		System.out.println(this.bestBatsman);

	}
	
	
	
	
	

}
