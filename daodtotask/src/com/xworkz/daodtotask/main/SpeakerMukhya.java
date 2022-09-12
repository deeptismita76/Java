package com.xworkz.daodtotask.main;

import com.xworkz.daodtotask.dao.SpeakerDAO;
import com.xworkz.daodtotask.dao.impl.SpeakerDAOImpl;
import com.xworkz.daodtotask.dto.SpeakerDTO;

public class SpeakerMukhya {

	public static void main(String[] args) {
		
		SpeakerDTO dto = new SpeakerDTO();
		dto.setSpeakerName("boAt Stone 193 5 Watts Stereo Portable Bluetooth Speaker (IPX7 Rating, Black)");
		dto.setBrandName("Boat");
		dto.setColor("Black");
		dto.setDeviceType("Portable Speaker");
		dto.setDeviceConfiguration("Portable Bluetooth Speaker");
		dto.setDeviceConfigurationDetails("Stereo Channel");
		dto.setTotalPowerOutput("5 Watts RMS");
		dto.setConnectivity("Bluetooth IUSB");
		dto.setModelNumber(193);
		dto.setFrequencyRespose("Not Available");
		dto.setSignalToNoiseRatio("80 db");
		dto.setBluethoothSpecifications("Bluetooth 5.0");
		dto.setBluethoothRangeUpto(10);
		dto.setBatteryCapacity(800);
		dto.setStandardBattery(4);
		
		SpeakerDAO dao = new SpeakerDAOImpl();
		dao.create(dto);
	}

}
