package com.xworkz.daodtotask.dao.impl;

import com.xworkz.daodtotask.dao.ApartmentDAO;
import com.xworkz.daodtotask.dto.ApartmentDTO;

public class ApartmentDAOImpl implements ApartmentDAO {

	private ApartmentDTO[] dto = new ApartmentDTO[5];
	private int index = 0;

	@Override
	public boolean create(ApartmentDTO dto) {
		this.dto[index] = dto;
		System.out.println("data in index " + index + " : " + dto);
		this.index++;
		return true;
	}

}
