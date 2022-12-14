package com.xworkz.customexception.bridge.service.impl;

import com.xworkz.customexception.bridge.dao.TouristPlaceDAO;
import com.xworkz.customexception.bridge.service.TouristPlaceService;
import com.xworkz.customexception.exception.NoSuchName;

public class TouristPlaceServiceImpl implements TouristPlaceService {
	
	private TouristPlaceDAO dao;
	
	public TouristPlaceServiceImpl(TouristPlaceDAO dao) {
		this.dao=dao;
	}

	@Override
	public boolean validateAndSave(String placeName) throws NoSuchName {
		if(placeName != null && placeName.length()>3 && placeName.length()<50) {
			if(this.dao.checkName(placeName)) {
				System.err.println("name already present");
				throw new NoSuchName("name exist");
			}else {
				System.out.println("does not exist present");
				this.dao.store(placeName);
				return true;
			}
		}else {
			System.out.println("Invalid");
			throw new NoSuchName("not a name");
		}
	}

}
