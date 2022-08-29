package com.xworkz.overrideobject;

import com.xworkz.overrideobject.sub.Fish;

public class ObjectMukhya {

	public static void main(String[] args) {

		Fish fish = new Fish("Gold Fish","Fresh Water");
		Fish  fish2 = new Fish("Gold Fish","Fresh Water");
		fish.equals(fish2);
		
		System.out.println(fish);
		
		Object object = new Fish("Gold Fish","Fresh Water");
		object.equals(fish);
	}

}


