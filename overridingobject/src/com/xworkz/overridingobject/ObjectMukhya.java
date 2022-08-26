package com.xworkz.overridingobject;

import com.xworkz.overridingobject.sub.Fish;

public class ObjectMukhya {

	public static void main(String[] args) {

		Fish fish = new Fish("Gold Fish","Fresh Water");
		Fish fish2 = new Fish("Gold Fish","Fresh Water");
		fish.equals(fish2);
	}

}
