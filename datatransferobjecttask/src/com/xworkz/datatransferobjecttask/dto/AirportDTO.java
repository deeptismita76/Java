package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class AirportDTO implements Serializable {

	private String airportName;
	private String type;
	private String owner;
	private String operator;
	private String serves;
	private String location;
	private Integer opened;
	private Boolean HubForAirAsia;
	private Boolean HubForAkasaAir;
	private Boolean HubForAllianceAir;
	private Integer Elevation;
	private String website;
	private Integer passengers;
	private Integer internationaPassenger;
	private Integer aircraftMovements;
	private Integer cangoTonnage;

	public AirportDTO() {

		System.out.println("default const");
	}

	@Override
	public int hashCode() {
		return 4698;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof AirportDTO) {
				System.out.println("obj is instance of AirportDTO");
				AirportDTO convo = (AirportDTO) obj;
				String convoAirportName = convo.airportName;
				Integer convoOpened = convo.opened;
				if (airportName.equals(convoAirportName) && opened.equals(convoOpened)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getServes() {
		return serves;
	}

	public void setServes(String serves) {
		this.serves = serves;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getOpened() {
		return opened;
	}

	public void setOpened(Integer opened) {
		this.opened = opened;
	}

	public Boolean getHubForAirAsia() {
		return HubForAirAsia;
	}

	public void setHubForAirAsia(Boolean hubForAirAsia) {
		HubForAirAsia = hubForAirAsia;
	}

	public Boolean getHubForAkasaAir() {
		return HubForAkasaAir;
	}

	public void setHubForAkasaAir(Boolean hubForAkasaAir) {
		HubForAkasaAir = hubForAkasaAir;
	}

	public Boolean getHubForAllianceAir() {
		return HubForAllianceAir;
	}

	public void setHubForAllianceAir(Boolean hubForAllianceAir) {
		HubForAllianceAir = hubForAllianceAir;
	}

	public Integer getElevation() {
		return Elevation;
	}

	public void setElevation(Integer elevation) {
		Elevation = elevation;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Integer getPassengers() {
		return passengers;
	}

	public void setPassengers(Integer passengers) {
		this.passengers = passengers;
	}

	public Integer getInternationaPassenger() {
		return internationaPassenger;
	}

	public void setInternationaPassenger(Integer internationaPassenger) {
		this.internationaPassenger = internationaPassenger;
	}

	public Integer getAircraftMovements() {
		return aircraftMovements;
	}

	public void setAircraftMovements(Integer aircraftMovements) {
		this.aircraftMovements = aircraftMovements;
	}

	public Integer getCangoTonnage() {
		return cangoTonnage;
	}

	public void setCangoTonnage(Integer cangoTonnage) {
		this.cangoTonnage = cangoTonnage;
	}

}
