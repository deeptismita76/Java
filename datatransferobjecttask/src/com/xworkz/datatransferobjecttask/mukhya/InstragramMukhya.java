package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.InstagramDTO;


public class InstragramMukhya {

	public static void main(String[] args) {
		
		InstagramDTO instagram = new InstagramDTO();
		instagram.setCeo("Kevin");
		instagram.setDeveloper("Meta");
		instagram.setReleased(2016);
		instagram.setAge(6);
		instagram.setAndroid("245.0.0.18.108");
		instagram.setIos("245.0");
		InstagramDTO instagram2 = new InstagramDTO();
		instagram2.setCeo("Kevin");
		instagram2.setDeveloper("Meta");
		instagram2.setReleased(2016);
		instagram2.setAge(6);
		instagram2.setAndroid("245.0.0.18.108");
		instagram2.setIos("245.0");
		if (instagram.hashCode() == instagram2.hashCode()) {
			System.out.println("same address");
			instagram.equals(instagram2);
		} else {
			System.err.println("diff address");
		}
		
	}

}
