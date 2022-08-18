package com.xworkz.fruit.mukhya;

import com.xworkz.fruit.inheritance.sub.MangoFruit;
import com.xworkz.fruit.inheritance.sup.Fruit;

public class FruitMukhya {

	public static void main(String[] args) {

		MangoFruit mango = new MangoFruit("mango","yellow","round",1.5,100,true);
		mango.torisu();
		
		System.out.println();
		Fruit fruit = new MangoFruit("mango","yellow","round");
		MangoFruit convo = (MangoFruit)fruit;
		convo.torisu();
		
		System.out.println();
		convo = new MangoFruit("mango","yellow","round",2.5,200,true);
		convo.torisu();
		
	}

}
