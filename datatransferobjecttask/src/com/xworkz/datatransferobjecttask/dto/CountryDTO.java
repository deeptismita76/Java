package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class CountryDTO implements Serializable {

	private String countryName;
	private Double populationInBillon;
	private String capital;
	private String largerstCity;
	private String officialLang;
	private Integer noOfLangs;
	private Integer noOfNativeLangs;
	private Integer noOfReligions;
	private Double hinduPer;
	private Double islamPer;
	private Double christianPer;
	private Double sikhismPer;
	private Double budhismPer;
	private Double jainismPer;
	private Double unaffiliatedPer;
	private Double otherPer;
	private String demonyms;
	private String govt;
	private String president;
	private String vicePersident;
	private String primeMinister;
	private String chiefJustice;
	private String lokSabhaSpeaker;
	private Integer legislature;
	private String dominion;
	private String republic;
	private Double gdp;
	private Double gdpNominal;
	private Double gini;
	private Double hdi;
	private String currency;
	private String timeZone;
	private String dateFormat;
	private String drivingSite;
	private String callingCode;
	private String isoCode;
	private String internetTLD;
	private Double coastLine;
	private Double pennisular;
	private Double sandyBeachPer;
	private Double rockShors;
	private String nationalAnimal;
	private String nationalFlower;
	private String flag;
	private String nationalAnthem;

	public CountryDTO() {
		System.out.println("default const");

	}

	@Override
	public int hashCode() {
		return 46972;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof CountryDTO) {
				System.out.println("obj is instance of CountryDTO");
				CountryDTO convo = (CountryDTO) obj;
				String ref = convo.callingCode;
				String ref2 = convo.capital;
				Double ref3 = convo.budhismPer;
				String ref4 = convo.chiefJustice;
				Integer ref5 = convo.legislature;
				Double ref6 = convo.christianPer;
				Double ref7 = convo.coastLine;
				String ref8 = convo.countryName;
				String ref9 = convo.currency;
				String ref10 = convo.dateFormat;
				String ref11 = convo.demonyms;
				String ref12 = convo.dominion;
				Integer ref13 = convo.noOfLangs;
				String ref14 = convo.flag;
				Double ref15 = convo.hinduPer;
				String ref16 = convo.govt;

				if (callingCode.equals(ref) && capital.equals(ref2) && budhismPer.equals(ref3)
						&& chiefJustice.equals(ref4) && legislature.equals(ref5) && christianPer.equals(ref6)
						&& coastLine.equals(ref7) && countryName.equals(ref8) && currency.equals(ref9)
						&& dateFormat.equals(ref10) && demonyms.equals(ref11) && dominion.equals(ref12)
						&& noOfLangs.equals(ref13) && flag.equals(ref14) && hinduPer.equals(ref15)
						&& govt.equals(ref16)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Double getPopulationInBillon() {
		return populationInBillon;
	}

	public void setPopulationInBillon(Double populationInBillon) {
		this.populationInBillon = populationInBillon;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getLargerstCity() {
		return largerstCity;
	}

	public void setLargerstCity(String largerstCity) {
		this.largerstCity = largerstCity;
	}

	public String getOfficialLang() {
		return officialLang;
	}

	public void setOfficialLang(String officialLang) {
		this.officialLang = officialLang;
	}

	public Integer getNoOfLangs() {
		return noOfLangs;
	}

	public void setNoOfLangs(Integer noOfLangs) {
		this.noOfLangs = noOfLangs;
	}

	public Integer getNoOfNativeLangs() {
		return noOfNativeLangs;
	}

	public void setNoOfNativeLangs(Integer noOfNativeLangs) {
		this.noOfNativeLangs = noOfNativeLangs;
	}

	public Integer getNoOfReligions() {
		return noOfReligions;
	}

	public void setNoOfReligions(Integer noOfReligions) {
		this.noOfReligions = noOfReligions;
	}

	public Double getHinduPer() {
		return hinduPer;
	}

	public void setHinduPer(Double hinduPer) {
		this.hinduPer = hinduPer;
	}

	public Double getIslamPer() {
		return islamPer;
	}

	public void setIslamPer(Double islamPer) {
		this.islamPer = islamPer;
	}

	public Double getChristianPer() {
		return christianPer;
	}

	public void setChristianPer(Double christianPer) {
		this.christianPer = christianPer;
	}

	public Double getSikhismPer() {
		return sikhismPer;
	}

	public void setSikhismPer(Double sikhismPer) {
		this.sikhismPer = sikhismPer;
	}

	public Double getBudhismPer() {
		return budhismPer;
	}

	public void setBudhismPer(Double budhismPer) {
		this.budhismPer = budhismPer;
	}

	public Double getJainismPer() {
		return jainismPer;
	}

	public void setJainismPer(Double jainismPer) {
		this.jainismPer = jainismPer;
	}

	public Double getUnaffiliatedPer() {
		return unaffiliatedPer;
	}

	public void setUnaffiliatedPer(Double unaffiliatedPer) {
		this.unaffiliatedPer = unaffiliatedPer;
	}

	public Double getOtherPer() {
		return otherPer;
	}

	public void setOtherPer(Double otherPer) {
		this.otherPer = otherPer;
	}

	public String getDemonyms() {
		return demonyms;
	}

	public void setDemonyms(String demonyms) {
		this.demonyms = demonyms;
	}

	public String getGovt() {
		return govt;
	}

	public void setGovt(String govt) {
		this.govt = govt;
	}

	public String getPresident() {
		return president;
	}

	public void setPresident(String president) {
		this.president = president;
	}

	public String getVicePersident() {
		return vicePersident;
	}

	public void setVicePersident(String vicePersident) {
		this.vicePersident = vicePersident;
	}

	public String getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}

	public String getChiefJustice() {
		return chiefJustice;
	}

	public void setChiefJustice(String chiefJustice) {
		this.chiefJustice = chiefJustice;
	}

	public String getLokSabhaSpeaker() {
		return lokSabhaSpeaker;
	}

	public void setLokSabhaSpeaker(String lokSabhaSpeaker) {
		this.lokSabhaSpeaker = lokSabhaSpeaker;
	}

	public Integer getLegislature() {
		return legislature;
	}

	public void setLegislature(Integer legislature) {
		this.legislature = legislature;
	}

	public String getDominion() {
		return dominion;
	}

	public void setDominion(String dominion) {
		this.dominion = dominion;
	}

	public String getRepublic() {
		return republic;
	}

	public void setRepublic(String republic) {
		this.republic = republic;
	}

	public Double getGdp() {
		return gdp;
	}

	public void setGdp(Double gdp) {
		this.gdp = gdp;
	}

	public Double getGdpNominal() {
		return gdpNominal;
	}

	public void setGdpNominal(Double gdpNominal) {
		this.gdpNominal = gdpNominal;
	}

	public Double getGini() {
		return gini;
	}

	public void setGini(Double gini) {
		this.gini = gini;
	}

	public Double getHdi() {
		return hdi;
	}

	public void setHdi(Double hdi) {
		this.hdi = hdi;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getDrivingSite() {
		return drivingSite;
	}

	public void setDrivingSite(String drivingSite) {
		this.drivingSite = drivingSite;
	}

	public String getCallingCode() {
		return callingCode;
	}

	public void setCallingCode(String callingCode) {
		this.callingCode = callingCode;
	}

	public String getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

	public String getInternetTLD() {
		return internetTLD;
	}

	public void setInternetTLD(String internetTLD) {
		this.internetTLD = internetTLD;
	}

	public Double getCoastLine() {
		return coastLine;
	}

	public void setCoastLine(Double coastLine) {
		this.coastLine = coastLine;
	}

	public Double getPennisular() {
		return pennisular;
	}

	public void setPennisular(Double pennisular) {
		this.pennisular = pennisular;
	}

	public Double getSandyBeachPer() {
		return sandyBeachPer;
	}

	public void setSandyBeachPer(Double sandyBeachPer) {
		this.sandyBeachPer = sandyBeachPer;
	}

	public Double getRockShors() {
		return rockShors;
	}

	public void setRockShors(Double rockShors) {
		this.rockShors = rockShors;
	}

	public String getNationalAnimal() {
		return nationalAnimal;
	}

	public void setNationalAnimal(String nationalAnimal) {
		this.nationalAnimal = nationalAnimal;
	}

	public String getNationalFlower() {
		return nationalFlower;
	}

	public void setNationalFlower(String nationalFlower) {
		this.nationalFlower = nationalFlower;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getNationalAnthem() {
		return nationalAnthem;
	}

	public void setNationalAnthem(String nationalAnthem) {
		this.nationalAnthem = nationalAnthem;
	}

}
