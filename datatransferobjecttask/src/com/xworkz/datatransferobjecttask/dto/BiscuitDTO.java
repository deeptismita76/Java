package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class BiscuitDTO implements Serializable {

	private String name;
	private String origin;
	private String parent;
	private Double carbohydrate;
	private Double sugar;
	private Double protine;
	private Double fat;
	private Double fattyAcid;
	private Double monoFattyAcid;
	private Double transFattyAcid;
	private Double cholestreol;
	private Double energy;
	private Double calcium;
	private Double iron;
	private Double iodine;
	private Double vitaminB1;
	private Double vitaminB2;
	private Double vitaminB3;
	private Double vitaminB6;
	private Double vitaminB12;
	private Double falicAcid;
	private Double pantothenate;
	private Integer mfgDate;
	private Integer expDate;
	private Long helpLine;
	private Double weight;
	private Double price;
	private String email;

	public BiscuitDTO() {

		System.out.println("default const");
	}

	@Override
	public int hashCode() {
		return 68472;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof BiscuitDTO) {
				System.out.println("obj is instance of BiscuitDTO");
				BiscuitDTO convo = (BiscuitDTO) obj;
				String convoName = convo.name;
				String convoOrigin = convo.origin;
				String convoParent = convo.parent;
				Long convoHelpLine = convo.helpLine;
				String convoEmail = convo.email;
				Double convoPrice = convo.price;

				if (name.equals(convoName) && origin.equals(convoOrigin) && parent.equals(convoParent)
						&& helpLine.equals(convoHelpLine) && email.equals(convoEmail) && price.equals(convoPrice)) {
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

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public Double getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(Double carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public Double getSugar() {
		return sugar;
	}

	public void setSugar(Double sugar) {
		this.sugar = sugar;
	}

	public Double getProtine() {
		return protine;
	}

	public void setProtine(Double protine) {
		this.protine = protine;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getFattyAcid() {
		return fattyAcid;
	}

	public void setFattyAcid(Double fattyAcid) {
		this.fattyAcid = fattyAcid;
	}

	public Double getMonoFattyAcid() {
		return monoFattyAcid;
	}

	public void setMonoFattyAcid(Double monoFattyAcid) {
		this.monoFattyAcid = monoFattyAcid;
	}

	public Double getTransFattyAcid() {
		return transFattyAcid;
	}

	public void setTransFattyAcid(Double transFattyAcid) {
		this.transFattyAcid = transFattyAcid;
	}

	public Double getCholestreol() {
		return cholestreol;
	}

	public void setCholestreol(Double cholestreol) {
		this.cholestreol = cholestreol;
	}

	public Double getEnergy() {
		return energy;
	}

	public void setEnergy(Double energy) {
		this.energy = energy;
	}

	public Double getCalcium() {
		return calcium;
	}

	public void setCalcium(Double calcium) {
		this.calcium = calcium;
	}

	public Double getIron() {
		return iron;
	}

	public void setIron(Double iron) {
		this.iron = iron;
	}

	public Double getIodine() {
		return iodine;
	}

	public void setIodine(Double iodine) {
		this.iodine = iodine;
	}

	public Double getVitaminB1() {
		return vitaminB1;
	}

	public void setVitaminB1(Double vitaminB1) {
		this.vitaminB1 = vitaminB1;
	}

	public Double getVitaminB2() {
		return vitaminB2;
	}

	public void setVitaminB2(Double vitaminB2) {
		this.vitaminB2 = vitaminB2;
	}

	public Double getVitaminB3() {
		return vitaminB3;
	}

	public void setVitaminB3(Double vitaminB3) {
		this.vitaminB3 = vitaminB3;
	}

	public Double getVitaminB6() {
		return vitaminB6;
	}

	public void setVitaminB6(Double vitaminB6) {
		this.vitaminB6 = vitaminB6;
	}

	public Double getVitaminB12() {
		return vitaminB12;
	}

	public void setVitaminB12(Double vitaminB12) {
		this.vitaminB12 = vitaminB12;
	}

	public Double getFalicAcid() {
		return falicAcid;
	}

	public void setFalicAcid(Double falicAcid) {
		this.falicAcid = falicAcid;
	}

	public Double getPantothenate() {
		return pantothenate;
	}

	public void setPantothenate(Double pantothenate) {
		this.pantothenate = pantothenate;
	}

	public Integer getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(Integer mfgDate) {
		this.mfgDate = mfgDate;
	}

	public Integer getExpDate() {
		return expDate;
	}

	public void setExpDate(Integer expDate) {
		this.expDate = expDate;
	}

	public Long getHelpLine() {
		return helpLine;
	}

	public void setHelpLine(Long helpLine) {
		this.helpLine = helpLine;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
