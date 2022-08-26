package com.xworkz.overridingobject.sub;

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
			System.out.println("object is not null carry on.");
			if (obj instanceof Fish) {
				System.out.println("object is instance of fish.");
				Fish convo = (Fish) obj;
				String convoBreed = convo.breed;
				String convoType = convo.type;
				if(this.breed.equals(convoBreed) && this.type.equals(convoType)) {
					System.out.println("matched");
					return true;
				}
				else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		super.toString();
		return "breed :" + breed + "type :" + type;
	}

}
