package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class PgDTO implements Serializable {

	private String name;
	private String idleFor;
	private String loction;
	private String city;
	private String state;
	private Integer pin;
	private String landMark;
	private Integer noOFSharings;
	private Double priceFor2sharings;
	private Double priceFor3sharings;
	private Double priceFor4sharings;
	private Double priceFor5sharings;
	private Integer food;
	private Boolean wifi;
	private Boolean washingMachine;
	private Boolean clean;
	private Boolean tv;
	private Boolean hanger;
	private Boolean cupboard;
	private Double tiffinStartTime;
	private Double tiffinEndTime;
	private Double lunchStartTime;
	private Double lunchEndTime;
	private Double dinnerStartTime;
	private Double dinnerEndTime;
	private String guidian;
	private Long contactNo;

	public PgDTO() {
		System.out.println("default const");
	}

	@Override
	public int hashCode() {
		return 974379;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof PgDTO) {
				System.out.println("obj is instance of PgDTO");
				PgDTO convo = (PgDTO) obj;
				String ref = convo.name;
				String ref2 = convo.idleFor;
				String ref3 = convo.loction;
				String ref4 = convo.city;
				String ref5 = convo.state;
				Integer ref6 = convo.pin;

				if (name.equals(ref) && idleFor.equals(ref2) && loction.equals(ref3) && city.equals(ref4)
						&& state.equals(ref5) && pin.equals(ref6)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdleFor() {
		return idleFor;
	}

	public void setIdleFor(String idleFor) {
		this.idleFor = idleFor;
	}

	public String getLoction() {
		return loction;
	}

	public void setLoction(String loction) {
		this.loction = loction;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public Integer getNoOFSharings() {
		return noOFSharings;
	}

	public void setNoOFSharings(Integer noOFSharings) {
		this.noOFSharings = noOFSharings;
	}

	public Double getPriceFor2sharings() {
		return priceFor2sharings;
	}

	public void setPriceFor2sharings(Double priceFor2sharings) {
		this.priceFor2sharings = priceFor2sharings;
	}

	public Double getPriceFor3sharings() {
		return priceFor3sharings;
	}

	public void setPriceFor3sharings(Double priceFor3sharings) {
		this.priceFor3sharings = priceFor3sharings;
	}

	public Double getPriceFor4sharings() {
		return priceFor4sharings;
	}

	public void setPriceFor4sharings(Double priceFor4sharings) {
		this.priceFor4sharings = priceFor4sharings;
	}

	public Double getPriceFor5sharings() {
		return priceFor5sharings;
	}

	public void setPriceFor5sharings(Double priceFor5sharings) {
		this.priceFor5sharings = priceFor5sharings;
	}

	public Integer getFood() {
		return food;
	}

	public void setFood(Integer food) {
		this.food = food;
	}

	public Boolean getWifi() {
		return wifi;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	public Boolean getWashingMachine() {
		return washingMachine;
	}

	public void setWashingMachine(Boolean washingMachine) {
		this.washingMachine = washingMachine;
	}

	public Boolean getClean() {
		return clean;
	}

	public void setClean(Boolean clean) {
		this.clean = clean;
	}

	public Boolean getTv() {
		return tv;
	}

	public void setTv(Boolean tv) {
		this.tv = tv;
	}

	public Boolean getHanger() {
		return hanger;
	}

	public void setHanger(Boolean hanger) {
		this.hanger = hanger;
	}

	public Boolean getCupboard() {
		return cupboard;
	}

	public void setCupboard(Boolean cupboard) {
		this.cupboard = cupboard;
	}

	public Double getTiffinStartTime() {
		return tiffinStartTime;
	}

	public void setTiffinStartTime(Double tiffinStartTime) {
		this.tiffinStartTime = tiffinStartTime;
	}

	public Double getTiffinEndTime() {
		return tiffinEndTime;
	}

	public void setTiffinEndTime(Double tiffinEndTime) {
		this.tiffinEndTime = tiffinEndTime;
	}

	public Double getLunchStartTime() {
		return lunchStartTime;
	}

	public void setLunchStartTime(Double lunchStartTime) {
		this.lunchStartTime = lunchStartTime;
	}

	public Double getLunchEndTime() {
		return lunchEndTime;
	}

	public void setLunchEndTime(Double lunchEndTime) {
		this.lunchEndTime = lunchEndTime;
	}

	public Double getDinnerStartTime() {
		return dinnerStartTime;
	}

	public void setDinnerStartTime(Double dinnerStartTime) {
		this.dinnerStartTime = dinnerStartTime;
	}

	public Double getDinnerEndTime() {
		return dinnerEndTime;
	}

	public void setDinnerEndTime(Double dinnerEndTime) {
		this.dinnerEndTime = dinnerEndTime;
	}

	public String getGuidian() {
		return guidian;
	}

	public void setGuidian(String guidian) {
		this.guidian = guidian;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

}
