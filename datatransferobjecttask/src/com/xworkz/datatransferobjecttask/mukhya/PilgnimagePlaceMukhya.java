package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.PilgnimagePlaceDTO;

public class PilgnimagePlaceMukhya {

	public static void main(String[] args) {

		PilgnimagePlaceDTO place = new PilgnimagePlaceDTO();
		place.setPlaceName("Kedarnath");
		place.setTempleCreatedBy("Pandavas");
		PilgnimagePlaceDTO place2 = new PilgnimagePlaceDTO();
		place2.setPlaceName("Kedarnath");
		place2.setTempleCreatedBy("Pandavas");
		if (place.hashCode() == place2.hashCode()) {
			System.out.println("same address");
			place.equals(place2);
		} else {
			System.err.println("diff address");
		}

	}

}
