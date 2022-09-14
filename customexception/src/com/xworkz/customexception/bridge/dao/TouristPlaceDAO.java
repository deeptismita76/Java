package com.xworkz.customexception.bridge.dao;

public interface TouristPlaceDAO {
	
	boolean store(String placeName);
	
	boolean checkName(String placeName);

}
