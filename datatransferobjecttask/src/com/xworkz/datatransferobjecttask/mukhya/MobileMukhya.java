package com.xworkz.datatransferobjecttask.mukhya;


import com.xworkz.datatransferobjecttask.dto.MobileDTO;

public class MobileMukhya {

	public static void main(String[] args) {



		MobileDTO mobile = new MobileDTO();
		mobile.setBrand("Realme X7 max");
		mobile.setStorage(128);
		mobile.setProcessor("Dimensity 1200 octa cone");
		mobile.setModel("RMX3031");
		mobile.setUiVersion("V3.0");
		mobile.setRam(8D);
		MobileDTO mobile2 = new MobileDTO();
		mobile.setBrand("Realme X7 max");
		mobile.setStorage(128);
		mobile.setProcessor("Dimensity 1200 octa cone");
		mobile.setModel("RMX3031");
		mobile.setUiVersion("V3.0");
		mobile.setRam(4D);
		if (mobile.hashCode() == mobile2.hashCode()) {
			System.out.println("same address");
			mobile.equals(mobile2);
		} else {
			System.err.println("diff address");
		}
	}

}
