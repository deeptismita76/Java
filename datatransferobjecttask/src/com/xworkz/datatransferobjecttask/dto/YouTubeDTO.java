package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class YouTubeDTO implements Serializable {

	private String typeOfBussiness;
	private String typeofSite;
	private Integer founded;
	private String Hqrs;
	private String areaServed;
	private String owner;
	private String founder;
	private String ceo;
	private String advisor;
	private String induersty;
	private Double revenue;
	private String parent;
	private String url;
	private String advertising;
	private String registration;
	private Double users;
	private Integer launched;
	private String[] writtenIn;
	private Boolean videoTech;
	private Boolean uploading;
	private Boolean liveStreaming;
	private Boolean comment;
	private Boolean contentAccessibility;
	private Boolean forMobile;
	private Boolean forLaptops;
	private Boolean forIpad;
	private Double usersInIndia;

	public YouTubeDTO() {

		System.out.println("default const");
	}

	@Override
	public int hashCode() {
		return 763974;
	}
	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof YouTubeDTO) {
				System.out.println("obj is instance of YouTubeDTO");
				YouTubeDTO convo = (YouTubeDTO) obj;
				String ref = convo.typeOfBussiness;
				String ref2 = convo.typeofSite;
				Integer ref3 = convo.founded;
				String ref4 = convo.Hqrs;
				String ref5 = convo.areaServed;
				String ref6 = convo.owner;

				if (typeOfBussiness.equals(ref) && typeofSite.equals(ref2) && founded.equals(ref3) && Hqrs.equals(ref4)
						&& areaServed.equals(ref5) && owner.equals(ref6)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getTypeOfBussiness() {
		return typeOfBussiness;
	}

	public void setTypeOfBussiness(String typeOfBussiness) {
		this.typeOfBussiness = typeOfBussiness;
	}

	public String getTypeofSite() {
		return typeofSite;
	}

	public void setTypeofSite(String typeofSite) {
		this.typeofSite = typeofSite;
	}

	public Integer getFounded() {
		return founded;
	}

	public void setFounded(Integer founded) {
		this.founded = founded;
	}

	public String getHqrs() {
		return Hqrs;
	}

	public void setHqrs(String hqrs) {
		Hqrs = hqrs;
	}

	public String getAreaServed() {
		return areaServed;
	}

	public void setAreaServed(String areaServed) {
		this.areaServed = areaServed;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getInduersty() {
		return induersty;
	}

	public void setInduersty(String induersty) {
		this.induersty = induersty;
	}

	public Double getRevenue() {
		return revenue;
	}

	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAdvertising() {
		return advertising;
	}

	public void setAdvertising(String advertising) {
		this.advertising = advertising;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public Double getUsers() {
		return users;
	}

	public void setUsers(Double users) {
		this.users = users;
	}

	public Integer getLaunched() {
		return launched;
	}

	public void setLaunched(Integer launched) {
		this.launched = launched;
	}

	public String[] getWrittenIn() {
		return writtenIn;
	}

	public void setWrittenIn(String[] writtenIn) {
		this.writtenIn = writtenIn;
	}

	public Boolean getVideoTech() {
		return videoTech;
	}

	public void setVideoTech(Boolean videoTech) {
		this.videoTech = videoTech;
	}

	public Boolean getUploading() {
		return uploading;
	}

	public void setUploading(Boolean uploading) {
		this.uploading = uploading;
	}

	public Boolean getLiveStreaming() {
		return liveStreaming;
	}

	public void setLiveStreaming(Boolean liveStreaming) {
		this.liveStreaming = liveStreaming;
	}

	public Boolean getComment() {
		return comment;
	}

	public void setComment(Boolean comment) {
		this.comment = comment;
	}

	public Boolean getContentAccessibility() {
		return contentAccessibility;
	}

	public void setContentAccessibility(Boolean contentAccessibility) {
		this.contentAccessibility = contentAccessibility;
	}

	public Boolean getForMobile() {
		return forMobile;
	}

	public void setForMobile(Boolean forMobile) {
		this.forMobile = forMobile;
	}

	public Boolean getForLaptops() {
		return forLaptops;
	}

	public void setForLaptops(Boolean forLaptops) {
		this.forLaptops = forLaptops;
	}

	public Boolean getForIpad() {
		return forIpad;
	}

	public void setForIpad(Boolean forIpad) {
		this.forIpad = forIpad;
	}

	public Double getUsersInIndia() {
		return usersInIndia;
	}

	public void setUsersInIndia(Double usersInIndia) {
		this.usersInIndia = usersInIndia;
	}

}
