package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class SuperMarketDTO implements Serializable {

	private String name;
	private Double ratings;
	private String location;
	private String city;
	private String state;
	private Integer pin;
	private Integer niOfItems;
	private Integer noOfVeggieItems;
	private Double priceOfSoap;
	private Double priceOfNote;
	private Double priceOfDairyMilk;
	private Boolean mobile;
	private Boolean maggie;
	private Boolean books;
	private Boolean trolley;
	private Boolean sweets;
	private Boolean honey;
	private Double sugarPrice;
	private Integer noOFBillCounter;
	private Integer noOfGates;
	private Long contactNo;
	private String mail;
	private String owner;

	public SuperMarketDTO() {
		System.out.println("default const");
	}

	@Override
	public int hashCode() {
		return 7378;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof SuperMarketDTO) {
				System.out.println("obj is instance of SuperMarketDTO");
				SuperMarketDTO convo = (SuperMarketDTO) obj;
				String ref = convo.name;
				Double ref2 = convo.ratings;
				String ref3 = convo.location;
				String ref4 = convo.city;
				String ref5 = convo.state;
				Integer ref6 = convo.pin;

				if (name.equals(ref) && ratings.equals(ref2) && location.equals(ref3) && city.equals(ref4)
						&& state.equals(ref5) && pin.equals(ref6)) {
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

	public Double getRatings() {
		return ratings;
	}

	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public Integer getNiOfItems() {
		return niOfItems;
	}

	public void setNiOfItems(Integer niOfItems) {
		this.niOfItems = niOfItems;
	}

	public Integer getNoOfVeggieItems() {
		return noOfVeggieItems;
	}

	public void setNoOfVeggieItems(Integer noOfVeggieItems) {
		this.noOfVeggieItems = noOfVeggieItems;
	}

	public Double getPriceOfSoap() {
		return priceOfSoap;
	}

	public void setPriceOfSoap(Double priceOfSoap) {
		this.priceOfSoap = priceOfSoap;
	}

	public Double getPriceOfNote() {
		return priceOfNote;
	}

	public void setPriceOfNote(Double priceOfNote) {
		this.priceOfNote = priceOfNote;
	}

	public Double getPriceOfDairyMilk() {
		return priceOfDairyMilk;
	}

	public void setPriceOfDairyMilk(Double priceOfDairyMilk) {
		this.priceOfDairyMilk = priceOfDairyMilk;
	}

	public Boolean getMobile() {
		return mobile;
	}

	public void setMobile(Boolean mobile) {
		this.mobile = mobile;
	}

	public Boolean getMaggie() {
		return maggie;
	}

	public void setMaggie(Boolean maggie) {
		this.maggie = maggie;
	}

	public Boolean getBooks() {
		return books;
	}

	public void setBooks(Boolean books) {
		this.books = books;
	}

	public Boolean getTrolley() {
		return trolley;
	}

	public void setTrolley(Boolean trolley) {
		this.trolley = trolley;
	}

	public Boolean getSweets() {
		return sweets;
	}

	public void setSweets(Boolean sweets) {
		this.sweets = sweets;
	}

	public Boolean getHoney() {
		return honey;
	}

	public void setHoney(Boolean honey) {
		this.honey = honey;
	}

	public Double getSugarPrice() {
		return sugarPrice;
	}

	public void setSugarPrice(Double sugarPrice) {
		this.sugarPrice = sugarPrice;
	}

	public Integer getNoOFBillCounter() {
		return noOFBillCounter;
	}

	public void setNoOFBillCounter(Integer noOFBillCounter) {
		this.noOFBillCounter = noOFBillCounter;
	}

	public Integer getNoOfGates() {
		return noOfGates;
	}

	public void setNoOfGates(Integer noOfGates) {
		this.noOfGates = noOfGates;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
