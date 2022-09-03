package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class RailwayStationDTO implements Serializable {

	private String stationName;
	private String location;
	private Double Elevation;
	private String ownedBy;
	private String openedBy;
	private Boolean bengaloreToMinaj;
	private Boolean bengaloreToChennai;
	private Integer noOfPlatform;
	private Integer noOFTracks;
	private Integer conns;
	private String structureType;
	private Boolean parking;
	private String status;
	private String stationCode;
	private String Zone;
	private String division;
	private Integer opened;
	private Boolean electrified;
	private Integer passPerDay;

	public RailwayStationDTO() {
		System.out.println("default const");
	}

	@Override
	public int hashCode() {
		return 52378;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof RailwayStationDTO) {
				System.out.println("obj is instance of RailwayStationDTO");
				RailwayStationDTO convo = (RailwayStationDTO) obj;
				String convoStationName = convo.stationName;
				String convoDivision = convo.division;
				if (stationName.equals(convoStationName) && division.equals(convoDivision)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getElevation() {
		return Elevation;
	}

	public void setElevation(Double elevation) {
		Elevation = elevation;
	}

	public String getOwnedBy() {
		return ownedBy;
	}

	public void setOwnedBy(String ownedBy) {
		this.ownedBy = ownedBy;
	}

	public String getOpenedBy() {
		return openedBy;
	}

	public void setOpenedBy(String openedBy) {
		this.openedBy = openedBy;
	}

	public Boolean getBengaloreToMinaj() {
		return bengaloreToMinaj;
	}

	public void setBengaloreToMinaj(Boolean bengaloreToMinaj) {
		this.bengaloreToMinaj = bengaloreToMinaj;
	}

	public Boolean getBengaloreToChennai() {
		return bengaloreToChennai;
	}

	public void setBengaloreToChennai(Boolean bengaloreToChennai) {
		this.bengaloreToChennai = bengaloreToChennai;
	}

	public Integer getNoOfPlatform() {
		return noOfPlatform;
	}

	public void setNoOfPlatform(Integer noOfPlatform) {
		this.noOfPlatform = noOfPlatform;
	}

	public Integer getNoOFTracks() {
		return noOFTracks;
	}

	public void setNoOFTracks(Integer noOFTracks) {
		this.noOFTracks = noOFTracks;
	}

	public Integer getConns() {
		return conns;
	}

	public void setConns(Integer conns) {
		this.conns = conns;
	}

	public String getStructureType() {
		return structureType;
	}

	public void setStructureType(String structureType) {
		this.structureType = structureType;
	}

	public Boolean getParking() {
		return parking;
	}

	public void setParking(Boolean parking) {
		this.parking = parking;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public String getZone() {
		return Zone;
	}

	public void setZone(String zone) {
		Zone = zone;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Integer getOpened() {
		return opened;
	}

	public void setOpened(Integer opened) {
		this.opened = opened;
	}

	public Boolean getElectrified() {
		return electrified;
	}

	public void setElectrified(Boolean electrified) {
		this.electrified = electrified;
	}

	public Integer getPassPerDay() {
		return passPerDay;
	}

	public void setPassPerDay(Integer passPerDay) {
		this.passPerDay = passPerDay;
	}

}
