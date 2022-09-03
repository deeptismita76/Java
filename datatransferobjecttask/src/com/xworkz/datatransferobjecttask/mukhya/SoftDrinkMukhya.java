package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.SoftDrinkDTO;

public class SoftDrinkMukhya {

	public static void main(String[] args) {

		SoftDrinkDTO drink = new SoftDrinkDTO();
		drink.setDrinkName("Maaza");
		drink.setIntroducedIn(1976);
		SoftDrinkDTO drink2 = new SoftDrinkDTO();
		drink2.setDrinkName("Maaza");
		drink2.setIntroducedIn(1976);
		if (drink.hashCode() == drink2.hashCode()) {
			System.out.println("same address");
			drink.equals(drink2);
		} else {
			System.err.println("diff address");
		}
	}

}
