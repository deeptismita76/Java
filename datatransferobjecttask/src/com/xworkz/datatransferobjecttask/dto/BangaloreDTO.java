package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class BangaloreDTO implements Serializable {
	
	private String country;
	private String state;
	private String region;
	private Integer established;
	private String foundedBy;
	private String govermentType;
	private String administrator;
	private String municipalCommissioner;
	private Double megauityArea;
	private Double metroArea;
	private Integer population;
	private String demonym;
	private String timeZone;
	private Integer pinCode;
	private String areaCode;
	private String vehReg;
	private Double metroGDPInBillion;
	private String lang;
	private String website;
	
	public BangaloreDTO() {

		System.out.println("Default const");
	}
	
	@Override
	public int hashCode() {
		return 8478;
	}
	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof BangaloreDTO) {
				System.out.println("obj is instance of BangaloreDTO");
				BangaloreDTO convo = (BangaloreDTO) obj;
				String ref = convo.country;
				String ref2 = convo.state;
				String ref3 = convo.region;
				Integer ref4 = convo.established;
				String ref5 = convo.foundedBy;
				String ref6 = convo.govermentType;

				if (country.equals(ref) && state.equals(ref2) && region.equals(ref3)
						&& established.equals(ref4) && foundedBy.equals(ref5)
						&& govermentType.equals(ref6)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getEstablished() {
		return established;
	}

	public void setEstablished(Integer established) {
		this.established = established;
	}

	public String getFoundedBy() {
		return foundedBy;
	}

	public void setFoundedBy(String foundedBy) {
		this.foundedBy = foundedBy;
	}

	public String getGovermentType() {
		return govermentType;
	}

	public void setGovermentType(String govermentType) {
		this.govermentType = govermentType;
	}

	public String getAdministrator() {
		return administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

	public String getMunicipalCommissioner() {
		return municipalCommissioner;
	}

	public void setMunicipalCommissioner(String municipalCommissioner) {
		this.municipalCommissioner = municipalCommissioner;
	}

	public Double getMegauityArea() {
		return megauityArea;
	}

	public void setMegauityArea(Double megauityArea) {
		this.megauityArea = megauityArea;
	}

	public Double getMetroArea() {
		return metroArea;
	}

	public void setMetroArea(Double metroArea) {
		this.metroArea = metroArea;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public String getDemonym() {
		return demonym;
	}

	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public Integer getPinCode() {
		return pinCode;
	}

	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getVehReg() {
		return vehReg;
	}

	public void setVehReg(String vehReg) {
		this.vehReg = vehReg;
	}

	public Double getMetroGDPInBillion() {
		return metroGDPInBillion;
	}

	public void setMetroGDPInBillion(Double metroGDPInBillion) {
		this.metroGDPInBillion = metroGDPInBillion;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	

}
