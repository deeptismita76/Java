package com.xworkz.daodtotask.main;

import com.xworkz.daodtotask.dao.AlcoholDAO;
import com.xworkz.daodtotask.dao.impl.AlcoholDAOImpl;
import com.xworkz.daodtotask.dto.AlcoholDTO;

public class AlcoholMukhya {

	public static void main(String[] args) {

		AlcoholDTO dto = new AlcoholDTO();
		dto.setName("vodka");
		dto.setType("Alcoholic beverage");
		String[] ref = {"Poland","Russia","sweden"};
		dto.setPlaceOrigin(ref);
		dto.setRegion("Central,Northen and Eastern europe");
		String[] ref1 = {"water","alcohol"};
		dto.setMainIngredients(ref1);
		dto.setVariation("Flavored vodka");
		dto.setFoodEnergy("100ml contains 231 kcal");
		dto.setAlcoholPer(40);
		dto.setSince(1890);
		dto.setForKids(false);
		dto.setPrice(999);
		dto.setQuantity(750);
		dto.setBrand("Absolute");
		dto.setColor("white");
		dto.setConsumptionPerInIndia(88);
		
		AlcoholDAO dao = new AlcoholDAOImpl();
		dao.create(dto);
	}

}
