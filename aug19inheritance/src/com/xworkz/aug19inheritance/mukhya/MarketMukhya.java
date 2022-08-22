package com.xworkz.aug19_inheritance.mukhya;

import com.xworkz.aug19_inheritance.sub.SuperMarket;
import com.xworkz.aug19_inheritance.subofsub.OnlineSuperMarket;
import com.xworkz.aug19_inheritance.sup.Market;

public class MarketMukhya {

	public static void main(String[] args) {

		Market market = new Market("Vegie Market", 6.30, 20.30);
		market.display();
		System.out.println("**************");

		Market market2 = new SuperMarket("super market", 9.30, 23.30, "relaience fresh", "BTM", 20);
		market2.display();
		
		System.out.println("***************");
		SuperMarket superMarket = new SuperMarket("SUPER MARKET", 8.30, 21.30, "Maitry", "BTM", 50);
		superMarket.display();
		System.out.println("***************");
		Market market3 = new OnlineSuperMarket("Super Market", 7.30, 23.30, "MORE", "BTM", 90, "Dunzo", "Metro Cities",
				20);
		market3.display();
		System.out.println("****************");
		SuperMarket superMarket2 = new OnlineSuperMarket("SUPER MARKET", 10.30, 22.30, "DMART", "MARHATHALLI", 50,
				"BLINK IT", "METRO CITIES", 15);
		superMarket2.display();
		
		System.out.println("*********************");
		
		
		if (market2 instanceof SuperMarket) {
			SuperMarket convo = (SuperMarket)market2;
			convo.typeOfMarket = "Stock";
			convo.display();
		}
		else {
			System.out.println("notv ref of Supermarket.");
		}
		System.out.println("******************");
		
		if(superMarket2 instanceof OnlineSuperMarket) {
			OnlineSuperMarket convo = (OnlineSuperMarket)superMarket2;
			convo.location = "Bommanahalli";
			convo.display();
		}
		else {
			System.out.println("not a ref of OnlineSuperMarket");
		}
		System.out.println("**********************");
		
		if(market3 instanceof OnlineSuperMarket) {
			OnlineSuperMarket convo = (OnlineSuperMarket)market3;
			convo.onlineSMName = "JIO Mart";
			convo.display();
		}
		else {
			System.out.println("not aref of OnlineSuperMarket");
		}
	}

}
