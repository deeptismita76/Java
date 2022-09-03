package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.IndianActorDTO;

public class IndianActorMukhya {

	public static void main(String[] args) {

		IndianActorDTO actor = new IndianActorDTO();
		actor.setName("Nani");
		actor.setSpouse("Anjana Yelavantry");
		IndianActorDTO actor2 = new IndianActorDTO();
		actor2.setName("Mahesh Babu");
		actor2.setSpouse("Namrata");
		if (actor.hashCode() == actor2.hashCode()) {
			System.out.println("same address");
			actor.equals(actor2);
		} else {
			System.err.println("diff address");
		}
	}
}
