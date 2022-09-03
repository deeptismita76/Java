package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class IndianActorDTO implements Serializable {

	private String name;
	private String dob;
	private String from;
	private String yearOfActive;
	private String spouse;
	private Integer children;
	private String graduatedFRom;
	private Integer noOFMovies;
	private Integer noOfAwards;
	private Integer marriedIn;

	public IndianActorDTO() {
		System.out.println("Default const.");
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 6876;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof IndianActorDTO) {
				System.out.println("obj is instance of southcoOffice");
				IndianActorDTO convo = (IndianActorDTO) obj;
				String convoName = convo.name;
				String convoSpouse = convo.spouse;
				if (name.equals(convoName) && spouse.equals(convoSpouse)) {
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getYearOfActive() {
		return yearOfActive;
	}

	public void setYearOfActive(String yearOfActive) {
		this.yearOfActive = yearOfActive;
	}

	public String getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}

	public String getGraduatedFRom() {
		return graduatedFRom;
	}

	public void setGraduatedFRom(String graduatedFRom) {
		this.graduatedFRom = graduatedFRom;
	}

	public Integer getNoOFMovies() {
		return noOFMovies;
	}

	public void setNoOFMovies(Integer noOFMovies) {
		this.noOFMovies = noOFMovies;
	}

	public Integer getNoOfAwards() {
		return noOfAwards;
	}

	public void setNoOfAwards(Integer noOfAwards) {
		this.noOfAwards = noOfAwards;
	}

	public Integer getMarriedIn() {
		return marriedIn;
	}

	public void setMarriedIn(Integer marriedIn) {
		this.marriedIn = marriedIn;
	}

}
