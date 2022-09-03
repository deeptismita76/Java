package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class HospitalDTO implements Serializable {
	
	private String hospitalName;
	private String motto;
	private String type;
	private	Integer established;
	private String superintendent;
	private String dean;
	private Integer ugsPerYear;
	private Integer pgsPerYear;
	private Integer doctoratPerYear;
	private	String location;
	private String state;
	private String district;
	private String campus;
	private String affiliations;
	private String website;
	
	public HospitalDTO() {
		System.out.println("default const");
	}
	@Override
	public int hashCode() {
		return 75428;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof HospitalDTO) {
				System.out.println("obj is instance of HospitalDTO");
				HospitalDTO convo = (HospitalDTO) obj;
				String convoHospitalName = convo.hospitalName;
				String convoWebsite = convo.website;
				if (hospitalName.equals(convoHospitalName) && website.equals(convoWebsite)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getMotto() {
		return motto;
	}
	public void setMotto(String motto) {
		this.motto = motto;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getEstablished() {
		return established;
	}
	public void setEstablished(Integer established) {
		this.established = established;
	}
	public String getSuperintendent() {
		return superintendent;
	}
	public void setSuperintendent(String superintendent) {
		this.superintendent = superintendent;
	}
	public String getDean() {
		return dean;
	}
	public void setDean(String dean) {
		this.dean = dean;
	}
	public Integer getUgsPerYear() {
		return ugsPerYear;
	}
	public void setUgsPerYear(Integer ugsPerYear) {
		this.ugsPerYear = ugsPerYear;
	}
	public Integer getPgsPerYear() {
		return pgsPerYear;
	}
	public void setPgsPerYear(Integer pgsPerYear) {
		this.pgsPerYear = pgsPerYear;
	}
	public Integer getDoctoratPerYear() {
		return doctoratPerYear;
	}
	public void setDoctoratPerYear(Integer doctoratPerYear) {
		this.doctoratPerYear = doctoratPerYear;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getAffiliations() {
		return affiliations;
	}
	public void setAffiliations(String affiliations) {
		this.affiliations = affiliations;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	

}
