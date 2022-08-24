package com.xworkz.javaprotected.mukhya;

import com.xworkz.javaprotected.sub.TataAutomobile;
import com.xworkz.javaprotected.sup.Automobile;
import com.xworkz.javaprotected.sup.HondaAutomobile;

public class AutomobileMukhya {

	public static void main(String[] args) {

		Automobile automobile = new HondaAutomobile(9.30,19.30);
		automobile.setBrand("Honda");
		automobile.setType("Two Wheeler");
		double ref = automobile.sellAccesscories("mirror");
		if(automobile instanceof HondaAutomobile) {
			HondaAutomobile convo = (HondaAutomobile)automobile;
			convo.printData();
		}
		System.out.println(ref);
		System.out.println("***************");
		
		Automobile automobile2 = new TataAutomobile();
		automobile2.setBrand("TATA");
		automobile2.setType("Four Wheeler");	
		double ref1 = automobile2.sellAccesscories("engine");
		if(automobile2 instanceof TataAutomobile) {
			TataAutomobile convo = (TataAutomobile)automobile2;
			convo.printData();
		}
		System.out.println(ref1);
		
	}

}
