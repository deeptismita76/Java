package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class StateDTO implements Serializable {

	private String stateName;
	private String stateIn;
	private String capital;
	private Integer district;
	private String govtBody;
	private String cm;
	private String governor;
	private String legislature;
	private Integer parCon;
	private String highcourt;
	private Double area;
	private Integer rank;
	private String demonym;
	private Double gdp;
	private String lang;
	private String TimeZone;
	private String isoCode;
	private Double hdi;
	private Double leteracy;
	private String website;
	private String emblem;
	private String song;
	private String dance;
	private String malal;
	private String bird;
	private String fish;
	private String flower;
	private String tree;
	private String food;
	private String sweet;
	private Double latitudesFrom;
	private Double latitudeTo;
	private Double congitudeFrom;
	private Double congitudeTo;
	private Double perOfCoastLineOfIndia;
	private Integer noSeasonsExp;
	private String saltyTake;
	private String stadium;
	private String promots;
	private String calture;
	private Integer noOfPorts;
	private Integer noOfAirports;
	private Boolean indusatry;
	private Integer noOfWildLifScantury;

	public StateDTO() {

		System.out.println("default const");

	}

	@Override
	public int hashCode() {
		return 762796;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof StateDTO) {
				System.out.println("obj is instance of StateDTO");
				StateDTO convo = (StateDTO) obj;
				String ref = convo.bird;
				String ref2 = convo.calture;
				Double ref3 = convo.area;
				String ref4 = convo.cm;
				String ref5 = convo.demonym;
				Double ref6 = convo.congitudeFrom;
				Double ref7 = convo.congitudeTo;
				String ref8 = convo.dance;
				String ref9 = convo.emblem;
				String ref10 = convo.governor;
				String ref11 = convo.flower;
				String ref12 = convo.highcourt;
				Integer ref13 = convo.district;
				String ref14 = convo.isoCode;
				Double ref15 = convo.leteracy;
				Boolean ref16 = convo.indusatry;

				if (bird.equals(ref) && calture.equals(ref2) && area.equals(ref3) && cm.equals(ref4)
						&& demonym.equals(ref5) && congitudeFrom.equals(ref6) && congitudeTo.equals(ref7)
						&& dance.equals(ref8) && emblem.equals(ref9) && governor.equals(ref10) && flower.equals(ref11)
						&& highcourt.equals(ref12) && district.equals(ref13) && isoCode.equals(ref14)
						&& leteracy.equals(ref15) && indusatry.equals(ref16)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateIn() {
		return stateIn;
	}

	public void setStateIn(String stateIn) {
		this.stateIn = stateIn;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public Integer getDistrict() {
		return district;
	}

	public void setDistrict(Integer district) {
		this.district = district;
	}

	public String getGovtBody() {
		return govtBody;
	}

	public void setGovtBody(String govtBody) {
		this.govtBody = govtBody;
	}

	public String getCm() {
		return cm;
	}

	public void setCm(String cm) {
		this.cm = cm;
	}

	public String getGovernor() {
		return governor;
	}

	public void setGovernor(String governor) {
		this.governor = governor;
	}

	public String getLegislature() {
		return legislature;
	}

	public void setLegislature(String legislature) {
		this.legislature = legislature;
	}

	public Integer getParCon() {
		return parCon;
	}

	public void setParCon(Integer parCon) {
		this.parCon = parCon;
	}

	public String getHighcourt() {
		return highcourt;
	}

	public void setHighcourt(String highcourt) {
		this.highcourt = highcourt;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public String getDemonym() {
		return demonym;
	}

	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}

	public Double getGdp() {
		return gdp;
	}

	public void setGdp(Double gdp) {
		this.gdp = gdp;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getTimeZone() {
		return TimeZone;
	}

	public void setTimeZone(String timeZone) {
		TimeZone = timeZone;
	}

	public String getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

	public Double getHdi() {
		return hdi;
	}

	public void setHdi(Double hdi) {
		this.hdi = hdi;
	}

	public Double getLeteracy() {
		return leteracy;
	}

	public void setLeteracy(Double leteracy) {
		this.leteracy = leteracy;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmblem() {
		return emblem;
	}

	public void setEmblem(String emblem) {
		this.emblem = emblem;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getDance() {
		return dance;
	}

	public void setDance(String dance) {
		this.dance = dance;
	}

	public String getMalal() {
		return malal;
	}

	public void setMalal(String malal) {
		this.malal = malal;
	}

	public String getBird() {
		return bird;
	}

	public void setBird(String bird) {
		this.bird = bird;
	}

	public String getFish() {
		return fish;
	}

	public void setFish(String fish) {
		this.fish = fish;
	}

	public String getFlower() {
		return flower;
	}

	public void setFlower(String flower) {
		this.flower = flower;
	}

	public String getTree() {
		return tree;
	}

	public void setTree(String tree) {
		this.tree = tree;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getSweet() {
		return sweet;
	}

	public void setSweet(String sweet) {
		this.sweet = sweet;
	}

	public Double getLatitudesFrom() {
		return latitudesFrom;
	}

	public void setLatitudesFrom(Double latitudesFrom) {
		this.latitudesFrom = latitudesFrom;
	}

	public Double getLatitudeTo() {
		return latitudeTo;
	}

	public void setLatitudeTo(Double latitudeTo) {
		this.latitudeTo = latitudeTo;
	}

	public Double getCongitudeFrom() {
		return congitudeFrom;
	}

	public void setCongitudeFrom(Double congitudeFrom) {
		this.congitudeFrom = congitudeFrom;
	}

	public Double getCongitudeTo() {
		return congitudeTo;
	}

	public void setCongitudeTo(Double congitudeTo) {
		this.congitudeTo = congitudeTo;
	}

	public Double getPerOfCoastLineOfIndia() {
		return perOfCoastLineOfIndia;
	}

	public void setPerOfCoastLineOfIndia(Double perOfCoastLineOfIndia) {
		this.perOfCoastLineOfIndia = perOfCoastLineOfIndia;
	}

	public Integer getNoSeasonsExp() {
		return noSeasonsExp;
	}

	public void setNoSeasonsExp(Integer noSeasonsExp) {
		this.noSeasonsExp = noSeasonsExp;
	}

	public String getSaltyTake() {
		return saltyTake;
	}

	public void setSaltyTake(String saltyTake) {
		this.saltyTake = saltyTake;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public String getPromots() {
		return promots;
	}

	public void setPromots(String promots) {
		this.promots = promots;
	}

	public String getCalture() {
		return calture;
	}

	public void setCalture(String calture) {
		this.calture = calture;
	}

	public Integer getNoOfPorts() {
		return noOfPorts;
	}

	public void setNoOfPorts(Integer noOfPorts) {
		this.noOfPorts = noOfPorts;
	}

	public Integer getNoOfAirports() {
		return noOfAirports;
	}

	public void setNoOfAirports(Integer noOfAirports) {
		this.noOfAirports = noOfAirports;
	}

	public Boolean getIndusatry() {
		return indusatry;
	}

	public void setIndusatry(Boolean indusatry) {
		this.indusatry = indusatry;
	}

	public Integer getNoOfWildLifScantury() {
		return noOfWildLifScantury;
	}

	public void setNoOfWildLifScantury(Integer noOfWildLifScantury) {
		this.noOfWildLifScantury = noOfWildLifScantury;
	}

}
