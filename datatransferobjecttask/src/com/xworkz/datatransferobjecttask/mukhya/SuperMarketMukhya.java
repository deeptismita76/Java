package com.xworkz.datatransferobjecttask.mukhya;


import com.xworkz.datatransferobjecttask.dto.SuperMarketDTO;

public class SuperMarketMukhya {

	public static void main(String[] args) {

		SuperMarketDTO market = new SuperMarketDTO();
		market.setName("Spencers");
		market.setRatings(3.0);
		market.setLocation("Ameerpet");
		market.setCity("Hyderabad");
		market.setState("Telangana");
		market.setPin(500007);
		SuperMarketDTO market2 = new SuperMarketDTO();
		market2.setName("Spencers");
		market2.setRatings(3.0);
		market2.setLocation("Ameerpet");
		market2.setCity("Hyderabad");
		market2.setState("Telangana");
		market2.setPin(500007);
		if (market.hashCode() == market2.hashCode()) {
			System.out.println("same address");
			market.equals(market2);
		} else {
			System.err.println("diff address");
		}
	}

}
