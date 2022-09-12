package com.xworkz.daodtotask.main;

import com.xworkz.daodtotask.dao.TabletDAO;
import com.xworkz.daodtotask.dao.impl.TabletDAOImpl;
import com.xworkz.daodtotask.dto.TabletDTO;

public class TabletMukhya {

	public static void main(String[] args) {

		TabletDTO dto = new TabletDTO();
		dto.setTabletName("Acemiz-MR");
		String[] cont = {"aceclofenac IP","Paracetaamol","Chlorzoxazone USP"};
		dto.setContains(cont);
		dto.setAcecloPerInGm(100);
		dto.setParacetPerInGm(325);
		dto.setChlorPerInGm(250);
		dto.setColor("Sunset Yellow");
		dto.setInTemp(30);
		dto.setContactNo(18002092505L);
		dto.setEmail("drsm@lupin.com");
		dto.setMfgLicNo("MNB/08/729");
		dto.setManufacturedBy("pinnacle Life science");
		dto.setMarketedBy("LUPIN LTD");
		dto.setbNoAt(68621);
		dto.setMrp(90.70);
		dto.setMfgDate("7/2021");
		dto.setExpDate("6/2023");
		
		TabletDAO dao = new TabletDAOImpl();
		dao.create(dto);
	}

}
