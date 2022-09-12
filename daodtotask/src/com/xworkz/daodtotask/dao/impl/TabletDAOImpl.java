package com.xworkz.daodtotask.dao.impl;

import com.xworkz.daodtotask.dao.TabletDAO;
import com.xworkz.daodtotask.dto.TabletDTO;

public class TabletDAOImpl implements TabletDAO {

	private TabletDTO[] dto = new TabletDTO[5];
	private int index = 0;

	@Override
	public boolean create(TabletDTO dto) {
		this.dto[index] = dto;
		System.out.println("data in index " + index + " : " + dto);
		this.index++;
		return false;
	}

}
