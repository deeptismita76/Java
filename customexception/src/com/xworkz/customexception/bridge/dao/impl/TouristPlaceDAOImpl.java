package com.xworkz.customexception.bridge.dao.impl;

import com.xworkz.customexception.bridge.dao.TouristPlaceDAO;

public class TouristPlaceDAOImpl implements TouristPlaceDAO {

	private String[] storeNames = new String[10];
	private int index;

	@Override
	public boolean store(String placeName) {
		this.storeNames[index] = placeName;
		System.out.println(placeName);
		this.index++;
		return false;
	}

	@Override
	public boolean checkName(String placeName) {
		for (String ref : storeNames) {
			if (ref != null && ref.equals(placeName)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
