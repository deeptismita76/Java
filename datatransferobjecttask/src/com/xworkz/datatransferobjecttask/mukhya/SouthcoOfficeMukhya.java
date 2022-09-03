package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.SouthcoOfficeDTO;

public class SouthcoOfficeMukhya {

	public static void main(String[] args) {
		SouthcoOfficeDTO southco = new SouthcoOfficeDTO();
		southco.setOfficeName("TPSODL SOUTHCO Office");
		southco.setPin(760007);
		SouthcoOfficeDTO southco2 = new SouthcoOfficeDTO();
		southco2.setOfficeName("TPSODL SOUTHCO Office");
		southco2.setPin(760007);
		if(southco.hashCode() == southco2.hashCode()) {
			System.out.println("same address");
			southco.equals(southco2);
		}
		else {
			System.err.println("diff address");
		}
	}

}
