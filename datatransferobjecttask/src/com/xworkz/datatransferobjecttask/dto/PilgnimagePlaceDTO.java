package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class PilgnimagePlaceDTO implements Serializable {
	
	private String placeName;
	private String state;
	private String country;
	private Double area;
	private Integer elevation;
	private Integer totalPopulation;
	private Integer density;
	private String offLnag;
	private String timeZone;
	private Integer piCode;
	private String vehReg;
	private String website;
	private Double disFromRishikesh;
	private Integer malePer;
	private Integer frmalePer;
	private Integer overAllLiteracy;
	private Integer maleLiteracy;
	private Integer femaleLiteracy;
	private Double currentTemp;
	private String templeCreatedBy;
	
	public PilgnimagePlaceDTO() {

		System.out.println("Default const");
	}
	
	@Override
	public int hashCode() {
		return 64361;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof PilgnimagePlaceDTO) {
				System.out.println("obj is instance of PilgnimagePlaceDTO");
				PilgnimagePlaceDTO convo = (PilgnimagePlaceDTO) obj;
				String convoPlaceName = convo.placeName;
				String convotempleCreatedBy = convo.templeCreatedBy;
				if (placeName.equals(convoPlaceName) && templeCreatedBy.equals(convotempleCreatedBy)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Integer getElevation() {
		return elevation;
	}

	public void setElevation(Integer elevation) {
		this.elevation = elevation;
	}

	public Integer getTotalPopulation() {
		return totalPopulation;
	}

	public void setTotalPopulation(Integer totalPopulation) {
		this.totalPopulation = totalPopulation;
	}

	public Integer getDensity() {
		return density;
	}

	public void setDensity(Integer density) {
		this.density = density;
	}

	public String getOffLnag() {
		return offLnag;
	}

	public void setOffLnag(String offLnag) {
		this.offLnag = offLnag;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public Integer getPiCode() {
		return piCode;
	}

	public void setPiCode(Integer piCode) {
		this.piCode = piCode;
	}

	public String getVehReg() {
		return vehReg;
	}

	public void setVehReg(String vehReg) {
		this.vehReg = vehReg;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Double getDisFromRishikesh() {
		return disFromRishikesh;
	}

	public void setDisFromRishikesh(Double disFromRishikesh) {
		this.disFromRishikesh = disFromRishikesh;
	}

	public Integer getMalePer() {
		return malePer;
	}

	public void setMalePer(Integer malePer) {
		this.malePer = malePer;
	}

	public Integer getFrmalePer() {
		return frmalePer;
	}

	public void setFrmalePer(Integer frmalePer) {
		this.frmalePer = frmalePer;
	}

	public Integer getOverAllLiteracy() {
		return overAllLiteracy;
	}

	public void setOverAllLiteracy(Integer overAllLiteracy) {
		this.overAllLiteracy = overAllLiteracy;
	}

	public Integer getMaleLiteracy() {
		return maleLiteracy;
	}

	public void setMaleLiteracy(Integer maleLiteracy) {
		this.maleLiteracy = maleLiteracy;
	}

	public Integer getFemaleLiteracy() {
		return femaleLiteracy;
	}

	public void setFemaleLiteracy(Integer femaleLiteracy) {
		this.femaleLiteracy = femaleLiteracy;
	}

	public Double getCurrentTemp() {
		return currentTemp;
	}

	public void setCurrentTemp(Double currentTemp) {
		this.currentTemp = currentTemp;
	}

	public String getTempleCreatedBy() {
		return templeCreatedBy;
	}

	public void setTempleCreatedBy(String templeCreatedBy) {
		this.templeCreatedBy = templeCreatedBy;
	}
	
}
