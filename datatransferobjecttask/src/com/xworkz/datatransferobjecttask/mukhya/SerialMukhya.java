package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.SerialDTO;

public class SerialMukhya {

	public static void main(String[] args) {


		SerialDTO serial = new SerialDTO();
		serial.setName("Miley Jab Hum Tum");
		serial.setGener("Teen");
		serial.setWrittenBy("Jay Verma");
		serial.setDirector("Ravi bhushan");
		serial.setCreativeDirector("Richa Yamin");
		serial.setLeadActor("Mohit");
		SerialDTO serial2 = new SerialDTO();
		serial2.setName("Miley Jab Hum Tum");
		serial2.setGener("Teen");
		serial2.setWrittenBy("Jay Verma");
		serial2.setDirector("Ravi bhushan");
		serial2.setCreativeDirector("Richa Yamin");
		serial2.setLeadActor("Mohit");
		if (serial.hashCode() == serial2.hashCode()) {
			System.out.println("same address");
			serial.equals(serial2);
		} else {
			System.err.println("diff address");
		}
	}

}
