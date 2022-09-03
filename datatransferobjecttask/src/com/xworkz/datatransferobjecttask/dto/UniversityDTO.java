package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class UniversityDTO implements Serializable {

	private String name;
	private String viceChancellorName;
	private Integer established;
	private Integer noOfColleges;

	public UniversityDTO() {
		System.out.println("Defaulf Const of University");
	}
	

	@Override
	public int hashCode() {
		return 567;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof UniversityDTO) {
				System.out.println("obj is instance of university");
				UniversityDTO convo = (UniversityDTO) obj;
				String convoName = convo.name;
				String convoViceChancellorName = convo.viceChancellorName;
				if (name.equals(convoName) && viceChancellorName.equals(convoViceChancellorName)) {
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


	public String getViceChancellorName() {
		return viceChancellorName;
	}


	public void setViceChancellorName(String viceChancellorName) {
		this.viceChancellorName = viceChancellorName;
	}


	public Integer getEstablished() {
		return established;
	}


	public void setEstablished(Integer established) {
		this.established = established;
	}


	public Integer getNoOfColleges() {
		return noOfColleges;
	}


	public void setNoOfColleges(Integer noOfColleges) {
		this.noOfColleges = noOfColleges;
	}
	
}


