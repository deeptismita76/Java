package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.AirportDTO;

public class AirportMukhya {

	public static void main(String[] args) {

		AirportDTO airport = new AirportDTO();
		airport.setAirportName("Kempegowda Airport");
		airport.setOpened(2008);
		AirportDTO airport2 = new AirportDTO();
		airport2.setAirportName("Kempegowda Airport");
		airport2.setOpened(2008);
		if (airport.hashCode() == airport2.hashCode()) {
			System.out.println("same address");
			airport.equals(airport2);
		} else {
			System.err.println("diff address");
		}
	}
}
