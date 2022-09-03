package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class InstagramDTO implements Serializable {
	
	private String ceo;
	private String developer;
	private Integer released;
	private Integer age;
	private String android;
	private String ios;
	private String fireos;
	private Double sizeForIos;
	private Double sizeForAndroid;
	private Double sizeForFireos;
	private Integer noOfAvaialLang;
	private String license;
	private String website;
	private Boolean hastag;
	private Boolean explore;
	private Boolean photographicFilter;
	private Boolean video;
	private Boolean igtv;
	private Boolean reels;
	private Boolean direct;
	private Boolean stories;
	private Boolean advertising;
	private Integer standAloneApp;
	private Boolean factChecking;
	private Boolean changes;
	private String impactOnPeople;
	private String impactOnBusiness;
	private Double ratings;
	private Integer noOfDownloads;
	private Integer noOfNegativeReviews;
	private Boolean live;
	
	public InstagramDTO() {
		System.out.println("default const");
	}
	@Override
	public int hashCode() {
		return 62893;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof InstagramDTO) {
				System.out.println("obj is instance of InstagramDTO");
				InstagramDTO convo = (InstagramDTO) obj;
				String ref = convo.ceo;
				String ref2 = convo.developer;
				Integer ref3 = convo.released;
				Integer ref4 = convo.age;
				String ref5 = convo.android;
				String ref6 = convo.ios;

				if (ceo.equals(ref) && developer.equals(ref2) && released.equals(ref3) && age.equals(ref4)
						&& android.equals(ref5) && ios.equals(ref6)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	public Integer getReleased() {
		return released;
	}
	public void setReleased(Integer released) {
		this.released = released;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAndroid() {
		return android;
	}
	public void setAndroid(String android) {
		this.android = android;
	}
	public String getIos() {
		return ios;
	}
	public void setIos(String ios) {
		this.ios = ios;
	}
	public String getFireos() {
		return fireos;
	}
	public void setFireos(String fireos) {
		this.fireos = fireos;
	}
	public Double getSizeForIos() {
		return sizeForIos;
	}
	public void setSizeForIos(Double sizeForIos) {
		this.sizeForIos = sizeForIos;
	}
	public Double getSizeForAndroid() {
		return sizeForAndroid;
	}
	public void setSizeForAndroid(Double sizeForAndroid) {
		this.sizeForAndroid = sizeForAndroid;
	}
	public Double getSizeForFireos() {
		return sizeForFireos;
	}
	public void setSizeForFireos(Double sizeForFireos) {
		this.sizeForFireos = sizeForFireos;
	}
	public Integer getNoOfAvaialLang() {
		return noOfAvaialLang;
	}
	public void setNoOfAvaialLang(Integer noOfAvaialLang) {
		this.noOfAvaialLang = noOfAvaialLang;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Boolean getHastag() {
		return hastag;
	}
	public void setHastag(Boolean hastag) {
		this.hastag = hastag;
	}
	public Boolean getExplore() {
		return explore;
	}
	public void setExplore(Boolean explore) {
		this.explore = explore;
	}
	public Boolean getPhotographicFilter() {
		return photographicFilter;
	}
	public void setPhotographicFilter(Boolean photographicFilter) {
		this.photographicFilter = photographicFilter;
	}
	public Boolean getVideo() {
		return video;
	}
	public void setVideo(Boolean video) {
		this.video = video;
	}
	public Boolean getIgtv() {
		return igtv;
	}
	public void setIgtv(Boolean igtv) {
		this.igtv = igtv;
	}
	public Boolean getReels() {
		return reels;
	}
	public void setReels(Boolean reels) {
		this.reels = reels;
	}
	public Boolean getDirect() {
		return direct;
	}
	public void setDirect(Boolean direct) {
		this.direct = direct;
	}
	public Boolean getStories() {
		return stories;
	}
	public void setStories(Boolean stories) {
		this.stories = stories;
	}
	public Boolean getAdvertising() {
		return advertising;
	}
	public void setAdvertising(Boolean advertising) {
		this.advertising = advertising;
	}
	public Integer getStandAloneApp() {
		return standAloneApp;
	}
	public void setStandAloneApp(Integer standAloneApp) {
		this.standAloneApp = standAloneApp;
	}
	public Boolean getFactChecking() {
		return factChecking;
	}
	public void setFactChecking(Boolean factChecking) {
		this.factChecking = factChecking;
	}
	public Boolean getChanges() {
		return changes;
	}
	public void setChanges(Boolean changes) {
		this.changes = changes;
	}
	public String getImpactOnPeople() {
		return impactOnPeople;
	}
	public void setImpactOnPeople(String impactOnPeople) {
		this.impactOnPeople = impactOnPeople;
	}
	public String getImpactOnBusiness() {
		return impactOnBusiness;
	}
	public void setImpactOnBusiness(String impactOnBusiness) {
		this.impactOnBusiness = impactOnBusiness;
	}
	public Double getRatings() {
		return ratings;
	}
	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}
	public Integer getNoOfDownloads() {
		return noOfDownloads;
	}
	public void setNoOfDownloads(Integer noOfDownloads) {
		this.noOfDownloads = noOfDownloads;
	}
	public Integer getNoOfNegativeReviews() {
		return noOfNegativeReviews;
	}
	public void setNoOfNegativeReviews(Integer noOfNegativeReviews) {
		this.noOfNegativeReviews = noOfNegativeReviews;
	}
	public Boolean getLive() {
		return live;
	}
	public void setLive(Boolean live) {
		this.live = live;
	}
	
}
