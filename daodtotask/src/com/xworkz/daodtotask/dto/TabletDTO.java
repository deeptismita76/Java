package com.xworkz.daodtotask.dto;

import java.util.Arrays;

public class TabletDTO {

	private String tabletName;
	private String[] contains;
	private int acecloPerInGm;
	private int paracetPerInGm;
	private int chlorPerInGm;
	private String color;
	private int inTemp;
	private long contactNo;
	private String email;
	private String mfgLicNo;
	private String manufacturedBy;
	private String marketedBy;
	private int bNoAt;
	private double mrp;
	private String mfgDate;
	private String expDate;

	public TabletDTO() {
		System.out.println("default const");
	}

	@Override
	public String toString() {
		return "TabletDTO [tabletName=" + tabletName + ", contains=" + Arrays.toString(contains) + ", acecloPerInGm="
				+ acecloPerInGm + ", paracetPerInGm=" + paracetPerInGm + ", chlorPerInGm=" + chlorPerInGm + ", color="
				+ color + ", inTemp=" + inTemp + ", comtactNo=" + contactNo + ", email=" + email + ", mfgLicNo="
				+ mfgLicNo + ", manufacturedBy=" + manufacturedBy + ", marketedBy=" + marketedBy + ", bNoAt=" + bNoAt
				+ ", mrp=" + mrp + ", mfgDate=" + mfgDate + ", expDate=" + expDate + "]";
	}

	public String getTabletName() {
		return tabletName;
	}

	public void setTabletName(String tabletName) {
		this.tabletName = tabletName;
	}

	public String[] getContains() {
		return contains;
	}

	public void setContains(String[] contains) {
		this.contains = contains;
	}

	public int getAcecloPerInGm() {
		return acecloPerInGm;
	}

	public void setAcecloPerInGm(int acecloPerInGm) {
		this.acecloPerInGm = acecloPerInGm;
	}

	public int getParacetPerInGm() {
		return paracetPerInGm;
	}

	public void setParacetPerInGm(int paracetPerInGm) {
		this.paracetPerInGm = paracetPerInGm;
	}

	public int getChlorPerInGm() {
		return chlorPerInGm;
	}

	public void setChlorPerInGm(int chlorPerInGm) {
		this.chlorPerInGm = chlorPerInGm;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getInTemp() {
		return inTemp;
	}

	public void setInTemp(int inTemp) {
		this.inTemp = inTemp;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMfgLicNo() {
		return mfgLicNo;
	}

	public void setMfgLicNo(String mfgLicNo) {
		this.mfgLicNo = mfgLicNo;
	}

	public String getManufacturedBy() {
		return manufacturedBy;
	}

	public void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	public String getMarketedBy() {
		return marketedBy;
	}

	public void setMarketedBy(String marketedBy) {
		this.marketedBy = marketedBy;
	}

	public int getbNoAt() {
		return bNoAt;
	}

	public void setbNoAt(int bNoAt) {
		this.bNoAt = bNoAt;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public String getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

}
