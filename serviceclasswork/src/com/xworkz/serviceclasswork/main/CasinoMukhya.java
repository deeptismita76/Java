package com.xworkz.serviceclasswork.main;

import com.xworkz.serviceclasswork.dao.CasinoDAO;
import com.xworkz.serviceclasswork.dao.impl.CasinoDAOImp;
import com.xworkz.serviceclasswork.service.CasinoService;
import com.xworkz.serviceclasswork.service.impl.CasinoServiceImpl;

public class CasinoMukhya {

	public static void main(String[] args) {
		
		CasinoDAO dao = new CasinoDAOImp();

		CasinoService service = new CasinoServiceImpl(dao);
		System.out.println(service.validateAndSave("pride"));
	}

}
