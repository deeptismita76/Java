package com.xworkz.customexception.main;

import com.xworkz.customexception.bridge.dao.TouristPlaceDAO;
import com.xworkz.customexception.bridge.dao.impl.TouristPlaceDAOImpl;
import com.xworkz.customexception.bridge.service.TouristPlaceService;
import com.xworkz.customexception.bridge.service.impl.TouristPlaceServiceImpl;
import com.xworkz.customexception.exception.NoSuchName;

public class TouristPlaceMukhya {

	public static void main(String[] args) {

		TouristPlaceDAO dao = new TouristPlaceDAOImpl();

		TouristPlaceService service = new TouristPlaceServiceImpl(dao);
		try {
			service.validateAndSave("Munnar");
			service.validateAndSave("Manali");
			service.validateAndSave("Leh Ladakh");
			service.validateAndSave("J&K");
			service.validateAndSave("Rishikesh");
			service.validateAndSave("Darjeeling");
			service.validateAndSave("Shimla");
			service.validateAndSave("Ooty");
			service.validateAndSave("Agra");
			service.validateAndSave("Amritsar");
			service.validateAndSave("Mount Abu");


		} catch (NoSuchName nsm) {
			System.out.println("handled");
		}

	}

}
