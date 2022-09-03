package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.BiscuitDTO;


public class BiscitMukhya {

	public static void main(String[] args) {


		BiscuitDTO biscuit = new BiscuitDTO();
		biscuit.setName("Marie Gold");
		biscuit.setOrigin("UK");
		biscuit.setParent("Britaniya");
		biscuit.setHelpLine(18002100069L);
		biscuit.setEmail("cane@futurecomsumer.in");
		biscuit.setPrice(30D);
		BiscuitDTO biscuit2 = new BiscuitDTO();
		biscuit2.setName("Marie Gold");
		biscuit2.setOrigin("UK");
		biscuit2.setParent("Britaniya");
		biscuit2.setHelpLine(18002100069L);
		biscuit2.setEmail("cane@futurecomsumer.in");
		biscuit2.setPrice(30D);
		if (biscuit.hashCode() == biscuit2.hashCode()) {
			System.out.println("same address");
			biscuit.equals(biscuit2);
		} else {
			System.err.println("diff address");
		}
	}

}
