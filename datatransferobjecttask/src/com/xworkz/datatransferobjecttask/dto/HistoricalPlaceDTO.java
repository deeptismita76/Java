package com.xworkz.datatransferobjecttask.dto;

public class HistoricalPlaceDTO {

	private String placeName;
	private String affiliation;
	private String district;
	private String deity;
	private String festival;
	private String governingBody;
	private String state;
	private String country;
	private String creator;
	private Integer completed;
	private Double site;
	private String website;
	private Boolean unescoWorldHeritageSite;

	public HistoricalPlaceDTO() {
		System.out.println("default const");
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 76746;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof HistoricalPlaceDTO) {
				System.out.println("obj is instance of HistoricalPlaceDTO");
				HistoricalPlaceDTO convo = (HistoricalPlaceDTO) obj;
				String convoPlaceName = convo.placeName;
				String convoWebsite = convo.website;
				if (placeName.equals(convoPlaceName) && website.equals(convoWebsite)) {
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

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getDeity() {
		return deity;
	}

	public void setDeity(String deity) {
		this.deity = deity;
	}

	public String getFestival() {
		return festival;
	}

	public void setFestival(String festival) {
		this.festival = festival;
	}

	public String getGoverningBody() {
		return governingBody;
	}

	public void setGoverningBody(String governingBody) {
		this.governingBody = governingBody;
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

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Integer getCompleted() {
		return completed;
	}

	public void setCompleted(Integer completed) {
		this.completed = completed;
	}

	public Double getSite() {
		return site;
	}

	public void setSite(Double site) {
		this.site = site;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Boolean getUnescoWorldHeritageSite() {
		return unescoWorldHeritageSite;
	}

	public void setUnescoWorldHeritageSite(Boolean unescoWorldHeritageSite) {
		this.unescoWorldHeritageSite = unescoWorldHeritageSite;
	}

}
