package com.xworkz.daodtotask.dto;

public class ApartmentDTO {

	private String apartmentName;
	private String ownerName;
	private int noOfFloor;
	private int noOfFlats;
	private int noOfGates;
	private boolean lift;
	private int noOfSecurityGuards;
	private long ownerContactNo;
	private int noOfBuilding;
	private boolean parking;
	private boolean society;
	private int rantedFlats;
	private int soldFlats;
	private int vacantFlats;
	private String[] typesOfFlats;

	public ApartmentDTO() {
		System.out.println("defalut const");
	}

	@Override
	public String toString() {
		return "ApartmentDTO [apartmentName=" + apartmentName + ", ownerName=" + ownerName + ", noOfFloor=" + noOfFloor
				+ ", noOfFlats=" + noOfFlats + ", noOfGates=" + noOfGates + ", lift=" + lift + ", noOfSecurityGuards="
				+ noOfSecurityGuards + ", ownerContactNo=" + ownerContactNo + ", noOfBuilding=" + noOfBuilding
				+ ", parking=" + parking + ", society=" + society + ", rantedFlats=" + rantedFlats + ", soldFlats="
				+ soldFlats + ", vacantFlats=" + vacantFlats + ", typesOfFlats=" + typesOfFlats + "]";
	}

	public String getApartmentName() {
		return apartmentName;
	}

	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getNoOfFloor() {
		return noOfFloor;
	}

	public void setNoOfFloor(int noOfFloor) {
		this.noOfFloor = noOfFloor;
	}

	public int getNoOfFlats() {
		return noOfFlats;
	}

	public void setNoOfFlats(int noOfFlats) {
		this.noOfFlats = noOfFlats;
	}

	public int getNoOfGates() {
		return noOfGates;
	}

	public void setNoOfGates(int noOfGates) {
		this.noOfGates = noOfGates;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public int getNoOfSecurityGuards() {
		return noOfSecurityGuards;
	}

	public void setNoOfSecurityGuards(int noOfSecurityGuards) {
		this.noOfSecurityGuards = noOfSecurityGuards;
	}

	public long getOwnerContactNo() {
		return ownerContactNo;
	}

	public void setOwnerContactNo(long ownerContactNo) {
		this.ownerContactNo = ownerContactNo;
	}

	public int getNoOfBuilding() {
		return noOfBuilding;
	}

	public void setNoOfBuilding(int noOfBuilding) {
		this.noOfBuilding = noOfBuilding;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isSociety() {
		return society;
	}

	public void setSociety(boolean society) {
		this.society = society;
	}

	public int getRantedFlats() {
		return rantedFlats;
	}

	public void setRantedFlats(int rantedFlats) {
		this.rantedFlats = rantedFlats;
	}

	public int getSoldFlats() {
		return soldFlats;
	}

	public void setSoldFlats(int soldFlats) {
		this.soldFlats = soldFlats;
	}

	public int getVacantFlats() {
		return vacantFlats;
	}

	public void setVacantFlats(int vacantFlats) {
		this.vacantFlats = vacantFlats;
	}

	public String[] getTypesOfFlats() {
		return typesOfFlats;
	}

	public void setTypesOfFlats(String[] typesOfFlats) {
		this.typesOfFlats = typesOfFlats;
	}

}
