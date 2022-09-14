package com.xworkz.serviceclasswork.dao.impl;

import com.xworkz.serviceclasswork.dao.CasinoDAO;

public class CasinoDAOImp implements CasinoDAO {

	private String[] data = new String[5];
	private int index = 0;

	@Override
	public boolean save(String name) {
		this.data[index] = name;
		System.out.println(name);
		this.index++;
		return true;
	}

	@Override
	public boolean checkName(String name) {
		for (String ref : this.data) {
			if (ref != null && ref.equals(name)) {
				System.out.println("found");
				return true;
			}else {
				return false;
			}
		}
		return true;
	}

}
