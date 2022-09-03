package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.AnimalDTO;


public class AnimalMukhya {

	public static void main(String[] args) {



		AnimalDTO animal = new AnimalDTO();
		animal.setName("Dog");
		animal.setNoOFBreeds(360);
		animal.setPriceOfAfaird(10000D);
		animal.setPriceOfAffenchon(20000D);
		animal.setPriceOfAffengrifton(18000D);
		animal.setPriceOfAfghanHound(20000D);
		AnimalDTO animal2 = new AnimalDTO();
		animal2.setName("Dog");
		animal2.setNoOFBreeds(360);
		animal2.setPriceOfAfaird(10000D);
		animal2.setPriceOfAffenchon(20000D);
		animal2.setPriceOfAffengrifton(18000D);
		animal2.setPriceOfAfghanHound(20000D);

		if (animal.hashCode() == animal2.hashCode()) {
			System.out.println("same address");
			animal.equals(animal2);
		} else {
			System.err.println("diff address");
		}
	}

}
