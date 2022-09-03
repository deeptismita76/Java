package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.UniversityDTO;

public class UniversityMukhya {

	public static void main(String[] args) {


		UniversityDTO university = new UniversityDTO();
		university.setName("Berhampur University");
		university.setViceChancellorName("Prof. Gitanjali Dash");
		UniversityDTO university2 = new UniversityDTO();
		university2.setName("BPUT");
		university2.setViceChancellorName("Bijaylaxmi");
		if(university.hashCode() == university2.hashCode()) {
			System.out.println("same address");
			university.equals(university2);
		}
		else {
			System.err.println("diff add");
		}
	

		
	}

}
