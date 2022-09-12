package com.xworkz.daodtotask.dao.impl;

import com.xworkz.daodtotask.dao.MovieDAO;
import com.xworkz.daodtotask.dto.MovieDTO;

public class MovieDAOImpl implements MovieDAO {
	
	private MovieDTO[] dto = new MovieDTO[6];
	private int index = 0;
	@Override
	public boolean create(MovieDTO dto) {
		this.dto[index] = dto;
		System.out.println("saved in index " + index + " : " + dto);
		this.index++;
		return true;
	}

}
