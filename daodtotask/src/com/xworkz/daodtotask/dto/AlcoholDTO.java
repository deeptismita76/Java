package com.xworkz.daodtotask.dto;

import java.util.Arrays;

public class AlcoholDTO {

	private String name;
	private String type;
	private String[] placeOrigin;
	private String region;
	private String[] mainIngredients;
	private String variation;
	private String foodEnergy;
	private double alcoholPer;
	private int since;
	private boolean forKids;
	private double price;
	private double quantity;
	private String brand;
	private String color;
	private double consumptionPerInIndia;

	public AlcoholDTO() {
		System.out.println("default const");
	}

	@Override
	public String toString() {
		return "AlcoholDTO [name=" + name + ", type=" + type + ", placeOrigin=" + Arrays.toString(placeOrigin)
				+ ", region=" + region + ", mainIngredients=" + Arrays.toString(mainIngredients) + ", variation="
				+ variation + ", foodEnergy=" + foodEnergy + ", alcoholPer=" + alcoholPer + ", since=" + since
				+ ", forKids=" + forKids + ", price=" + price + ", quantity=" + quantity + ", brand=" + brand
				+ ", color=" + color + ", consumptionPerInIndia=" + consumptionPerInIndia + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getPlaceOrigin() {
		return placeOrigin;
	}

	public void setPlaceOrigin(String[] placeOrigin) {
		this.placeOrigin = placeOrigin;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String[] getMainIngredients() {
		return mainIngredients;
	}

	public void setMainIngredients(String[] mainIngredients) {
		this.mainIngredients = mainIngredients;
	}

	public String getVariation() {
		return variation;
	}

	public void setVariation(String variation) {
		this.variation = variation;
	}

	public String getFoodEnergy() {
		return foodEnergy;
	}

	public void setFoodEnergy(String foodEnergy) {
		this.foodEnergy = foodEnergy;
	}

	public double getAlcoholPer() {
		return alcoholPer;
	}

	public void setAlcoholPer(double alcoholPer) {
		this.alcoholPer = alcoholPer;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public boolean isForKids() {
		return forKids;
	}

	public void setForKids(boolean forKids) {
		this.forKids = forKids;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getConsumptionPerInIndia() {
		return consumptionPerInIndia;
	}

	public void setConsumptionPerInIndia(double consumptionPerInIndia) {
		this.consumptionPerInIndia = consumptionPerInIndia;
	}

}
