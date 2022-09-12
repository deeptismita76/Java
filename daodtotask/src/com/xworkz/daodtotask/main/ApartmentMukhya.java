package com.xworkz.daodtotask.main;

import com.xworkz.daodtotask.dao.ApartmentDAO;
import com.xworkz.daodtotask.dao.impl.ApartmentDAOImpl;
import com.xworkz.daodtotask.dto.ApartmentDTO;
import com.xworkz.daodtotask.dto.TabletDTO;

public class ApartmentMukhya {

	public static void main(String[] args) {
		ApartmentDTO dto = new ApartmentDTO();
		dto.setApartmentName("Nandighosh");
		dto.setOwnerName("Bijay Satapathi");
		dto.setNoOfFloor(12);
		dto.setNoOfFlats(240);
		dto.setNoOfGates(6);
		dto.setNoOfSecurityGuards(4);
		dto.setLift(true);
		dto.setOwnerContactNo(757582019L);
		dto.setNoOfBuilding(6);
		dto.setParking(true);
		dto.setSociety(true);
		dto.setRantedFlats(100);
		dto.setSoldFlats(100);
		dto.setVacantFlats(40);
		String[] typ = { "1bhk", "2bhk", "3bhk" };
		dto.setTypesOfFlats(typ);

		ApartmentDAO dao = new ApartmentDAOImpl();
		dao.create(dto);
	}

}
