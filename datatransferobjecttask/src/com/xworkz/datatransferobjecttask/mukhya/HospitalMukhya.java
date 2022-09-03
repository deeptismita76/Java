package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.HospitalDTO;

public class HospitalMukhya {

	public static void main(String[] args) {

		HospitalDTO hospital = new HospitalDTO();
		hospital.setHospitalName("MKCG");
		hospital.setWebsite("www.mkcgmch.org");
		HospitalDTO hospital2 = new HospitalDTO();
		hospital2.setHospitalName("MKCG");
		hospital2.setWebsite("www.mkcgmch.org");
		if (hospital.hashCode() == hospital2.hashCode()) {
			System.out.println("same address");
			hospital.equals(hospital2);
		} else {
			System.err.println("diff address");
		}
	}

}
