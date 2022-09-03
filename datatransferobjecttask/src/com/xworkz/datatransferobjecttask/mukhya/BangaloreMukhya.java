package com.xworkz.datatransferobjecttask.mukhya;


import com.xworkz.datatransferobjecttask.dto.BangaloreDTO;

public class BangaloreMukhya {

	public static void main(String[] args) {



		BangaloreDTO bangalore = new BangaloreDTO();
		bangalore.setCountry("India");
		bangalore.setState("Karnataka");
		bangalore.setRegion("Bayalusume");
		bangalore.setEstablished(1537);
		bangalore.setFoundedBy("Kempe Gowda");
		bangalore.setGovermentType("Municipal Corpp");
		BangaloreDTO bangalore2 = new BangaloreDTO();
		bangalore2.setCountry("India");
		bangalore2.setState("Karnataka");
		bangalore2.setRegion("Bayalusume");
		bangalore2.setEstablished(1537);
		bangalore2.setFoundedBy("Kempe Gowda");
		bangalore2.setGovermentType("Municipal Corpp");
		if (bangalore.hashCode() == bangalore2.hashCode()) {
			System.out.println("same address");
			bangalore.equals(bangalore2);
		} else {
			System.err.println("diff address");
		}
	}

}
