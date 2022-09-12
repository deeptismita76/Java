package com.xworkz.daodtotask.dao.impl;

import com.xworkz.daodtotask.dao.AlcoholDAO;
import com.xworkz.daodtotask.dto.AlcoholDTO;

public class AlcoholDAOImpl implements AlcoholDAO {

	private AlcoholDTO[] dtos = new AlcoholDTO[6];
	private int index = 0;

	@Override
	public boolean create(AlcoholDTO dto) {
		
		this.dtos[index]=dto;
		System.out.println("saved in index " + index + " : " + dto);
		this.index++;
		return true;
	}

}
