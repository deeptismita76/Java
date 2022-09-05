package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.CountryDTO;
import com.xworkz.datatransferobjecttask.dto.MovieDTO;

public class CountryMukhya {

	public static void main(String[] args) {
		
		CountryDTO country = new CountryDTO();
		country.setCallingCode("+91");
		country.setCapital("New Delhi");
		country.setBudhismPer(0.7);
		country.setChiefJustice("N.V Ramana");
		country.setLegislature(2);
		country.setChristianPer(2.3D);
		country.setCoastLine(7517D);
		country.setCountryName("India");
		country.setCurrency("Indian Rupees");
		country.setDateFormat("dd-mm-yyyy");
		country.setDemonyms("Indian");
		country.setDominion("15 Aug 147");
		country.setNoOfLangs(22);
		country.setFlag("Tiranga");
		country.setHinduPer(79.8D);
		country.setGovt("federal parliamentary constituion republic");
	
		CountryDTO country2 = new CountryDTO();
		country2.setCallingCode("+91");
		country2.setCapital("New Delhi");
		country2.setBudhismPer(0.7);
		country2.setChiefJustice("N.V Ramana");
		country2.setLegislature(2);
		country2.setChristianPer(2.3D);
		country2.setCoastLine(7517D);
		country2.setCountryName("India");
		country2.setCurrency("Indian Rupees");
		country2.setDateFormat("dd-mm-yyyy");
		country2.setDemonyms("Indian");
		country2.setDominion("15 Aug 147");
		country2.setNoOfLangs(22);
		country2.setFlag("Tiranga");
		country2.setHinduPer(79.8D);
		country2.setGovt("federal parliamentary constituion republic");
	
		if (country.hashCode() == country2.hashCode()) {
			System.out.println("same address");
			country.equals(country2);
		} else {
			System.err.println("diff address");
		}

	}

}
