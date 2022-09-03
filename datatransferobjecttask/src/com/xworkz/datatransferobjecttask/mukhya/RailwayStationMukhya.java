package com.xworkz.datatransferobjecttask.mukhya;


import com.xworkz.datatransferobjecttask.dto.RailwayStationDTO;

public class RailwayStationMukhya {

	public static void main(String[] args) {


		RailwayStationDTO station  = new RailwayStationDTO();
		station.setStationName("Bangalore city railway Station");
		station.setDivision("Bangalore");
		RailwayStationDTO station2 = new RailwayStationDTO();
		station2.setStationName("YVR");
		station2.setDivision("Bengalore");
		if (station.hashCode() == station2.hashCode()) {
			System.out.println("same address");
			station.equals(station2);
		} else {
			System.err.println("diff address");
		}
	}

}
