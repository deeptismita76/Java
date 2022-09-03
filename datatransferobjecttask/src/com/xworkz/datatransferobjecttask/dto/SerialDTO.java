package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class SerialDTO implements Serializable {

	private String name;
	private String gener;
	private String writtenBy;
	private String director;
	private String creativeDirector;
	private String leadActor;
	private String leadActress;
	private String musicBy;
	private String openingTheme;
	private String countery;
	private String language;
	private Integer noOfSeasons;
	private Integer noOfEpis;
	private String cinematography;
	private String editor;
	private Integer runningTime;
	private String production;
	private String network;
	private Integer fromYear;
	private Integer toYear;

	public SerialDTO() {

		System.out.println("default const");
	}

	@Override
	public int hashCode() {
		return 74982;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof SerialDTO) {
				System.out.println("obj is instance of SerialDTO");
				SerialDTO convo = (SerialDTO) obj;
				String ref = convo.name;
				String ref2 = convo.gener;
				String ref3 = convo.writtenBy;
				String ref4 = convo.director;
				String ref5 = convo.creativeDirector;
				String ref6 = convo.leadActor;

				if (name.equals(ref) && gener.equals(ref2) && writtenBy.equals(ref3) && director.equals(ref4)
						&& creativeDirector.equals(ref5) && leadActor.equals(ref6)) {
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

	public String getGener() {
		return gener;
	}

	public void setGener(String gener) {
		this.gener = gener;
	}

	public String getWrittenBy() {
		return writtenBy;
	}

	public void setWrittenBy(String writtenBy) {
		this.writtenBy = writtenBy;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getCreativeDirector() {
		return creativeDirector;
	}

	public void setCreativeDirector(String creativeDirector) {
		this.creativeDirector = creativeDirector;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}

	public String getMusicBy() {
		return musicBy;
	}

	public void setMusicBy(String musicBy) {
		this.musicBy = musicBy;
	}

	public String getOpeningTheme() {
		return openingTheme;
	}

	public void setOpeningTheme(String openingTheme) {
		this.openingTheme = openingTheme;
	}

	public String getCountery() {
		return countery;
	}

	public void setCountery(String countery) {
		this.countery = countery;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getNoOfSeasons() {
		return noOfSeasons;
	}

	public void setNoOfSeasons(Integer noOfSeasons) {
		this.noOfSeasons = noOfSeasons;
	}

	public Integer getNoOfEpis() {
		return noOfEpis;
	}

	public void setNoOfEpis(Integer noOfEpis) {
		this.noOfEpis = noOfEpis;
	}

	public String getCinematography() {
		return cinematography;
	}

	public void setCinematography(String cinematography) {
		this.cinematography = cinematography;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public Integer getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(Integer runningTime) {
		this.runningTime = runningTime;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public Integer getFromYear() {
		return fromYear;
	}

	public void setFromYear(Integer fromYear) {
		this.fromYear = fromYear;
	}

	public Integer getToYear() {
		return toYear;
	}

	public void setToYear(Integer toYear) {
		this.toYear = toYear;
	}

}
