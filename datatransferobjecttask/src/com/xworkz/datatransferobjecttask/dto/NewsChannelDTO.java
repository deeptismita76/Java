package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class NewsChannelDTO implements Serializable {

	private String channelName;
	private String broadcastArea;
	private String hqrts;
	private String language;
	private String pictureFormat;
	private String owner;
	private Integer launched;
	private Integer channleAge;
	private String webcaste;
	private String website;
	private Integer hdChannelLaunch;
	private String firstBroadCastedOn;
	private Integer noOfStaffs;
	private Integer noOFExcutive;
	private Integer noOfPastStaff;

	public NewsChannelDTO() {
		System.out.println("default comnst.");
	}

	@Override
	public int hashCode() {
		return 653858;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof NewsChannelDTO) {
				System.out.println("obj is instance of NewsChannelDTO");
				NewsChannelDTO convo = (NewsChannelDTO) obj;
				String convoChannelName = convo.channelName;
				String convoOwner = convo.owner;
				if (channelName.equals(convoChannelName) && owner.equals(convoOwner)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getBroadcastArea() {
		return broadcastArea;
	}

	public void setBroadcastArea(String broadcastArea) {
		this.broadcastArea = broadcastArea;
	}

	public String getHqrts() {
		return hqrts;
	}

	public void setHqrts(String hqrts) {
		this.hqrts = hqrts;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPictureFormat() {
		return pictureFormat;
	}

	public void setPictureFormat(String pictureFormat) {
		this.pictureFormat = pictureFormat;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Integer getLaunched() {
		return launched;
	}

	public void setLaunched(Integer launched) {
		this.launched = launched;
	}

	public Integer getChannleAge() {
		return channleAge;
	}

	public void setChannleAge(Integer channleAge) {
		this.channleAge = channleAge;
	}

	public String getWebcaste() {
		return webcaste;
	}

	public void setWebcaste(String webcaste) {
		this.webcaste = webcaste;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Integer getHdChannelLaunch() {
		return hdChannelLaunch;
	}

	public void setHdChannelLaunch(Integer hdChannelLaunch) {
		this.hdChannelLaunch = hdChannelLaunch;
	}

	public String getFirstBroadCastedOn() {
		return firstBroadCastedOn;
	}

	public void setFirstBroadCastedOn(String firstBroadCastedOn) {
		this.firstBroadCastedOn = firstBroadCastedOn;
	}

	public Integer getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(Integer noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	public Integer getNoOFExcutive() {
		return noOFExcutive;
	}

	public void setNoOFExcutive(Integer noOFExcutive) {
		this.noOFExcutive = noOFExcutive;
	}

	public Integer getNoOfPastStaff() {
		return noOfPastStaff;
	}

	public void setNoOfPastStaff(Integer noOfPastStaff) {
		this.noOfPastStaff = noOfPastStaff;
	}

}
