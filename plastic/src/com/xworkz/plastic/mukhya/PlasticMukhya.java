package com.xworkz.plastic.mukhya;

import com.xworkz.plastic.inheritance.sub.Pipe;
import com.xworkz.plastic.inheritance.sup.Plastic;

public class PlasticMukhya {

	public static void main(String[] args) {
		
		Pipe pipe = new Pipe("Water Pipe", "green", true, 0.5, 5, 300);
		pipe.torisu();
		
		System.out.println();
		Plastic plastic = new Pipe("water pipe","green",true);
		Pipe convo = (Pipe)plastic;
		convo.torisu();
		
		System.out.println();
		convo = new Pipe("Water Pipe", "green", true, 0.5, 5, 300);
		convo.torisu();

	}

}
