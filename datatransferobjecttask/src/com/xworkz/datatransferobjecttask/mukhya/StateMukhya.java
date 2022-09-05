package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.StateDTO;

public class StateMukhya {

	public static void main(String[] args) {
		
		StateDTO state = new StateDTO();
		state.setBird("India roller");
		state.setCalture("Chhau");
		state.setArea(155.707);
		state.setCm("Naveen Pattnaik");
		state.setDemonym("Odia");
		state.setCongitudeFrom(17.780);
		state.setCongitudeTo(22.730);
		state.setDance("Odissi");
		state.setEmblem("Emblem og Odiash");
		state.setGovernor("Ganeshi Lal");
		state.setFlower("Ashoka");
		state.setHighcourt("Odisha High Court");
		state.setDistrict(30);
		state.setIsoCode("IN-OR");
		state.setLeteracy(73.55);
		state.setIndusatry(true);
	
		StateDTO state2 = new StateDTO();
		state2.setBird("India roller");
		state2.setCalture("Chhau");
		state2.setArea(155.707);
		state2.setCm("Naveen Pattnaik");
		state2.setDemonym("Odia");
		state2.setCongitudeFrom(17.780);
		state2.setCongitudeTo(22.730);
		state2.setDance("Odissi");
		state2.setEmblem("Emblem og Odiash");
		state2.setGovernor("Ganeshi Lal");
		state2.setFlower("Ashoka");
		state2.setHighcourt("Odisha High Court");
		state2.setDistrict(30);
		state2.setIsoCode("IN-OR");
		state2.setLeteracy(73.55);
		state2.setIndusatry(true);
	
		if (state.hashCode() == state2.hashCode()) {
			System.out.println("same address");
			state.equals(state2);
		} else {
			System.err.println("diff address");
		}

	}

}
