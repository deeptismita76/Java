package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.HistoricalPlaceDTO;

public class HistoricalPlaceMukhya {

	public static void main(String[] args) {


		HistoricalPlaceDTO place = new HistoricalPlaceDTO();
		place.setPlaceName("Konarka");
		place.setWebsite("konarka.nic.in");
		HistoricalPlaceDTO place2 = new HistoricalPlaceDTO();
		place2.setPlaceName("Konarka");
		place2.setWebsite("konarka.nic.in");
		if (place.hashCode() == place2.hashCode()) {
			System.out.println("same address");
			place.equals(place2);
		} else {
			System.err.println("diff address");
		}
	}

}
