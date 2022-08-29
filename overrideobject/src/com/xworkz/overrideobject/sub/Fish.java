package com.xworkz.overrideobject.sub;

public class Fish {
	
	public String breed;
	public String type;
	
	public Fish(String breed,String type) {
		this.breed = breed;
		this.type = type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			System.out.println("not null continue");
			if(obj instanceof Fish) {
				System.out.println("obj is instance of fish");
				Fish convo = (Fish)obj;
				String convertedBreed = convo.breed;
				String convertedType = convo.type;
				if(breed.equals(convertedBreed) && type.equals(convertedType)) {
					System.out.println("matched.");
				}
			}
		}
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Breed : " + breed + "Type : " + type;
	}
	
	

}
