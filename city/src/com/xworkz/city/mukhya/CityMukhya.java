package com.xworkz.city.mukhya;

import com.xworkz.city.inheritance.sub.BangaluruCity;
import com.xworkz.city.inheritance.sup.City;

public class CityMukhya {

	public static void main(String[] args) {

		BangaluruCity bangaluruCity = new BangaluruCity("Bangaluru", 560001, "Karnataka", "IT", 714, "Venketesh Murthy");
		bangaluruCity.torisu();
		
		System.out.println();
		City city = new BangaluruCity("Bangaluru",560001,"Karnataka");
		BangaluruCity convo = (BangaluruCity)city;
		convo.torisu();
		
		System.out.println();
		convo = new BangaluruCity("Bangaluru", 560001, "Karnataka", "IT", 714, "Venketesh Murthy");
		convo.torisu();
	}

}
