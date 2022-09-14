package com.xworkz.serviceclasswork.service.impl;

import com.xworkz.serviceclasswork.dao.CasinoDAO;
import com.xworkz.serviceclasswork.service.CasinoService;

public class CasinoServiceImpl implements CasinoService {

	private CasinoDAO dao;

	public CasinoServiceImpl(CasinoDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(String name) {
		if (name != null && name.length() > 2 && name.length() < 50) {
			if (this.dao.checkName(name)) {
				System.err.println("present");
				return true;
			} else {
				System.out.println("not present continue");
				this.dao.save(name);
				return true;
			}
		} else {
			System.out.println("Invalid");
		}
		return false;
	}

}
