package com.xworkz.aug22overriding.sub;

import com.xworkz.aug22overriding.sup.Cricket;

public class TestCricket extends Cricket {

	public String groundType;

	public void setGroundType(String groundType) {
		this.groundType = groundType;
	}

	@Override
	public double presentation(String matchType) {
		System.out.println("presentation method of sub class test cricket.");
		double val = super.presentation(matchType);
		if (val == 0.0) {
			if (matchType == "IPL") {
				return 1.25;
			}
		}
		return val;
	}

	@Override
	public void printData() {
		// TODO Auto-generated method stub
		super.printData();
		System.out.println(this.groundType);
	}

	
}
