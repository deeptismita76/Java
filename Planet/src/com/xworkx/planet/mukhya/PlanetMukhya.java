package com.xworkx.planet.mukhya;

import com.xworkx.planet.inheritance.sub.EarthPlanet;
import com.xworkx.planet.inheritance.sup.Planet;

public class PlanetMukhya {

	public static void main(String[] args) {

		EarthPlanet earth = new EarthPlanet("Earth", 3, 6713,true,151.43,7);
		earth.torisu();
		
		System.out.println();
		Planet planet = new EarthPlanet("Earth", 3, 6713);
		EarthPlanet convo = (EarthPlanet)planet;
		convo.torisu();
		
		System.out.println();
		convo = new EarthPlanet("Earth", 3, 6713,true,151.43,7);
		convo.torisu();
	}

}
