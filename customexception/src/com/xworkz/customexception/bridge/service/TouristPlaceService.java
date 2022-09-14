package com.xworkz.customexception.bridge.service;

import com.xworkz.customexception.exception.NoSuchName;

public interface TouristPlaceService {
	
	boolean validateAndSave(String placeName) throws NoSuchName;
}
