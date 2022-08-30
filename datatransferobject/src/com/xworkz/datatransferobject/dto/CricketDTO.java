package com.xworkz.datatransferobject.dto;

import java.util.Arrays;

public class CricketDTO {
	
	private String teamName;
	private String coachName;
	private int coachAge;
	private int coachExp;
	private String coachFrom;
	private String captainName;
	private int captainAge;
	private int captainExp;
	private String captainFrom;
	private String[] players;
	
	public CricketDTO() {
		System.out.println("default const");
	}
	
	public CricketDTO(String teamName, String coachName, int coachAge, int coachExp, String coachFrom,
			String captainName, int captainAge, int captainExp, String captainFrom, String[] players) {
		super();
		this.teamName = teamName;
		this.coachName = coachName;
		this.coachAge = coachAge;
		this.coachExp = coachExp;
		this.coachFrom = coachFrom;
		this.captainName = captainName;
		this.captainAge = captainAge;
		this.captainExp = captainExp;
		this.captainFrom = captainFrom;
		this.players = players;
	}

	@Override
	public String toString() {
		return "CricketDTO [teamName=" + teamName + ", coachName=" + coachName + ", coachAge=" + coachAge
				+ ", coachExp=" + coachExp + ", coachFrom=" + coachFrom + ", captainName=" + captainName
				+ ", captainAge=" + captainAge + ", captainExp=" + captainExp + ", captainFrom=" + captainFrom
				+ ", players=" + Arrays.toString(players) + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public int getCoachAge() {
		return coachAge;
	}

	public void setCoachAge(int coachAge) {
		this.coachAge = coachAge;
	}

	public int getCoachExp() {
		return coachExp;
	}

	public void setCoachExp(int coachExp) {
		this.coachExp = coachExp;
	}

	public String getCoachFrom() {
		return coachFrom;
	}

	public void setCoachFrom(String coachFrom) {
		this.coachFrom = coachFrom;
	}

	public String getCaptainName() {
		return captainName;
	}

	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}

	public int getCaptainAge() {
		return captainAge;
	}

	public void setCaptainAge(int captainAge) {
		this.captainAge = captainAge;
	}

	public int getCaptainExp() {
		return captainExp;
	}

	public void setCaptainExp(int captainExp) {
		this.captainExp = captainExp;
	}

	public String getCaptainFrom() {
		return captainFrom;
	}

	public void setCaptainFrom(String captainFrom) {
		this.captainFrom = captainFrom;
	}

	public String[] getPlayers() {
		return players;
	}

	public void setPlayers(String[] players) {
		this.players = players;
	}

	

}
