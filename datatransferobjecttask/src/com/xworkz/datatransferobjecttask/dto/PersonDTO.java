package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class PersonDTO implements Serializable {

	private String name;
	private Integer age;
	private String qualification;
	private String currentlyDoing;
	private String institute;
	private String stayingIn;
	private String currentLocation;
	private String from;
	private String city;
	private String post;
	private String fatherName;
	private String motherName;
	private Double matricResultInPer;
	private Double interResultInPer;
	private Double ugResultInPer;
	private Double pgResultInPer;
	private String school;
	private String ugCollege;
	private String pgCollege;
	private Long panNo;
	private Long adhaarNo;

	public PersonDTO() {

		System.out.println("Default const");
	}

	@Override
	public int hashCode() {
		return 98745894;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof PersonDTO) {
				System.out.println("obj is instance of PersonDTO");
				PersonDTO convo = (PersonDTO) obj;
				String ref = convo.name;
				Integer ref2 = convo.age;
				String ref3 = convo.qualification;
				String ref4 = convo.institute;
				String ref5 = convo.from;
				String ref6 = convo.post;

				if (name.equals(ref) && age.equals(ref2) && qualification.equals(ref3) && institute.equals(ref4)
						&& from.equals(ref5) && post.equals(ref6)) {
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCurrentlyDoing() {
		return currentlyDoing;
	}

	public void setCurrentlyDoing(String currentlyDoing) {
		this.currentlyDoing = currentlyDoing;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getStayingIn() {
		return stayingIn;
	}

	public void setStayingIn(String stayingIn) {
		this.stayingIn = stayingIn;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public Double getMatricResultInPer() {
		return matricResultInPer;
	}

	public void setMatricResultInPer(Double matricResultInPer) {
		this.matricResultInPer = matricResultInPer;
	}

	public Double getInterResultInPer() {
		return interResultInPer;
	}

	public void setInterResultInPer(Double interResultInPer) {
		this.interResultInPer = interResultInPer;
	}

	public Double getUgResultInPer() {
		return ugResultInPer;
	}

	public void setUgResultInPer(Double ugResultInPer) {
		this.ugResultInPer = ugResultInPer;
	}

	public Double getPgResultInPer() {
		return pgResultInPer;
	}

	public void setPgResultInPer(Double pgResultInPer) {
		this.pgResultInPer = pgResultInPer;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getUgCollege() {
		return ugCollege;
	}

	public void setUgCollege(String ugCollege) {
		this.ugCollege = ugCollege;
	}

	public String getPgCollege() {
		return pgCollege;
	}

	public void setPgCollege(String pgCollege) {
		this.pgCollege = pgCollege;
	}

	public Long getPanNo() {
		return panNo;
	}

	public void setPanNo(Long panNo) {
		this.panNo = panNo;
	}

	public Long getAdhaarNo() {
		return adhaarNo;
	}

	public void setAdhaarNo(Long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}

}
