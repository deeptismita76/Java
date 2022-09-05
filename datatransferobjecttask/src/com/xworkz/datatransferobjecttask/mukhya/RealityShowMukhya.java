package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.RealityShowDTO;

public class RealityShowMukhya {

	public static void main(String[] args) {


		RealityShowDTO realityShow = new RealityShowDTO();
		realityShow.setShowName("Indian Idol");
		realityShow.setChannel("Sony");
		realityShow.setImdbRating(3.0);
		realityShow.setHostName("Aditya");
		realityShow.setProducerName("Ekta");
		realityShow.setProductionHouse("L&M");
		realityShow.setShootingSet("mumbai");
		realityShow.setLanguage("Hindi");
		realityShow.setSeason(13);
		realityShow.setConcluded(3);
		realityShow.setThemeSong("Indian Idol");
		realityShow.setSeasonOneYear(2004);
		realityShow.setSeasonTwoYear(2005);
		realityShow.setSeasonTwoWinner("Sandeep");
		realityShow.setSeasonEightYear(2015);
		realityShow.setSeasonTenYear(2018);
	
		RealityShowDTO realityShow2 = new RealityShowDTO();
		realityShow2.setShowName("Indian Idol");
		realityShow2.setChannel("Sony");
		realityShow2.setImdbRating(3.0);
		realityShow2.setHostName("Aditya");
		realityShow2.setProducerName("Ekta");
		realityShow2.setProductionHouse("L&M");
		realityShow2.setShootingSet("mumbai");
		realityShow2.setLanguage("Hindi");
		realityShow2.setSeason(13);
		realityShow2.setConcluded(3);
		realityShow2.setThemeSong("Indian Idol");
		realityShow2.setSeasonOneYear(2004);
		realityShow2.setSeasonTwoYear(2005);
		realityShow2.setSeasonTwoWinner("Sandeep");
		realityShow2.setSeasonTenYear(2018);
		realityShow2.setSeasonEightYear(2015);
		if (realityShow.hashCode() == realityShow2.hashCode()) {
			System.out.println("same address");
			realityShow.equals(realityShow2);
		} else {
			System.err.println("diff address");
		}

	}

}
