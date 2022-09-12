package com.xworkz.daodtotask.dao.impl;

import com.xworkz.daodtotask.dao.SpeakerDAO;
import com.xworkz.daodtotask.dto.SpeakerDTO;

public class SpeakerDAOImpl implements SpeakerDAO {
	
	private SpeakerDTO[] dto = new SpeakerDTO[6];
	private int index = 0;

	@Override
	public boolean create(SpeakerDTO dto) {
		this.dto[index] = dto;
		System.out.println("saved in index " + index + " : " + dto);
		this.index++;
		return true;
	}
	
	

}
