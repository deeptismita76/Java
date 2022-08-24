package com.xworkz.javaprotected.sub;

import com.xworkz.javaprotected.sup.Automobile;

public class TataAutomobile extends Automobile {
	
	@Override
	public void printData() {
		
		super.printData();
		System.out.println("Overriden");
	}

}
