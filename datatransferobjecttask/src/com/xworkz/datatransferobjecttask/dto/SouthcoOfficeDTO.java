package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class SouthcoOfficeDTO implements Serializable {

	private String officeName;
	private Double ratings;
	private String city;
	private Integer pin;
	private Double openTime;
	private Double closeTime;
	private Long contactNo;

	public SouthcoOfficeDTO() {
		System.out.println("Default const.");
	}

	@Override
	public int hashCode() {
		return 978;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof SouthcoOfficeDTO) {
				System.out.println("obj is instance of southcoOffice");
				SouthcoOfficeDTO convo = (SouthcoOfficeDTO) obj;
				String convoOfficeName = convo.officeName;
				Integer convoPin = convo.pin;
				if (officeName.equals(convoOfficeName) && pin.equals(convoPin)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public Double getRatings() {
		return ratings;
	}

	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public Double getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Double openTime) {
		this.openTime = openTime;
	}

	public Double getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(Double closeTime) {
		this.closeTime = closeTime;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	

}
