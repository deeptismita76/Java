package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class AnimalDTO implements Serializable {

	private String name;
	private Integer noOFBreeds;
	private Double priceOfAfaird;
	private Double priceOfAffenchon;
	private Double priceOfAffengrifton;
	private Double priceOfPug;
	private Double priceOfAfghanHound;
	private Double priceOfGoldenRetriver;
	private Double priceOfAfollie;
	private Double priceOfAkbash;
	private Double priceOfPyrenus;
	private Double priceOfAkita;
	private Double priceOfBasset;
	private Double priceOfBennand;
	private Double priceOfChow;
	private Double priceOfPit;
	private Double priceOfHusky;
	private Double priceOfCoonhound;
	private Double priceOfEskimo;
	private Double priceOfBeagal;
	private Double priceOfPitBull;
	private Double priceOfPugBull;
	private Double priceOfAuggie;
	private Double priceOfAustralianShepherd;
	private Double priceOfBarbet;
	private Double priceOfBassodon;
	private Double priceOfBasenji;
	private Double priceOfBeabull;

	public AnimalDTO() {

		System.out.println("default const");
	}

	@Override
	public int hashCode() {
		return 97590;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof AnimalDTO) {
				System.out.println("obj is instance of AnimalDTO");
				AnimalDTO convo = (AnimalDTO) obj;
				String ref = convo.name;
				Integer ref2 = convo.noOFBreeds;
				Double ref3 = convo.priceOfAfaird;
				Double ref4 = convo.priceOfAffenchon;
				Double ref5 = convo.priceOfAffengrifton;
				Double ref6 = convo.priceOfAfghanHound;

				if (name.equals(ref) && noOFBreeds.equals(ref2) && priceOfAfaird.equals(ref3)
						&& priceOfAffenchon.equals(ref4) && priceOfAffengrifton.equals(ref5)
						&& priceOfAfghanHound.equals(ref6)) {
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

	public Integer getNoOFBreeds() {
		return noOFBreeds;
	}

	public void setNoOFBreeds(Integer noOFBreeds) {
		this.noOFBreeds = noOFBreeds;
	}

	public Double getPriceOfAfaird() {
		return priceOfAfaird;
	}

	public void setPriceOfAfaird(Double priceOfAfaird) {
		this.priceOfAfaird = priceOfAfaird;
	}

	public Double getPriceOfAffenchon() {
		return priceOfAffenchon;
	}

	public void setPriceOfAffenchon(Double priceOfAffenchon) {
		this.priceOfAffenchon = priceOfAffenchon;
	}

	public Double getPriceOfAffengrifton() {
		return priceOfAffengrifton;
	}

	public void setPriceOfAffengrifton(Double priceOfAffengrifton) {
		this.priceOfAffengrifton = priceOfAffengrifton;
	}

	public Double getPriceOfPug() {
		return priceOfPug;
	}

	public void setPriceOfPug(Double priceOfPug) {
		this.priceOfPug = priceOfPug;
	}

	public Double getPriceOfAfghanHound() {
		return priceOfAfghanHound;
	}

	public void setPriceOfAfghanHound(Double priceOfAfghanHound) {
		this.priceOfAfghanHound = priceOfAfghanHound;
	}

	public Double getPriceOfGoldenRetriver() {
		return priceOfGoldenRetriver;
	}

	public void setPriceOfGoldenRetriver(Double priceOfGoldenRetriver) {
		this.priceOfGoldenRetriver = priceOfGoldenRetriver;
	}

	public Double getPriceOfAfollie() {
		return priceOfAfollie;
	}

	public void setPriceOfAfollie(Double priceOfAfollie) {
		this.priceOfAfollie = priceOfAfollie;
	}

	public Double getPriceOfAkbash() {
		return priceOfAkbash;
	}

	public void setPriceOfAkbash(Double priceOfAkbash) {
		this.priceOfAkbash = priceOfAkbash;
	}

	public Double getPriceOfPyrenus() {
		return priceOfPyrenus;
	}

	public void setPriceOfPyrenus(Double priceOfPyrenus) {
		this.priceOfPyrenus = priceOfPyrenus;
	}

	public Double getPriceOfAkita() {
		return priceOfAkita;
	}

	public void setPriceOfAkita(Double priceOfAkita) {
		this.priceOfAkita = priceOfAkita;
	}

	public Double getPriceOfBasset() {
		return priceOfBasset;
	}

	public void setPriceOfBasset(Double priceOfBasset) {
		this.priceOfBasset = priceOfBasset;
	}

	public Double getPriceOfBennand() {
		return priceOfBennand;
	}

	public void setPriceOfBennand(Double priceOfBennand) {
		this.priceOfBennand = priceOfBennand;
	}

	public Double getPriceOfChow() {
		return priceOfChow;
	}

	public void setPriceOfChow(Double priceOfChow) {
		this.priceOfChow = priceOfChow;
	}

	public Double getPriceOfPit() {
		return priceOfPit;
	}

	public void setPriceOfPit(Double priceOfPit) {
		this.priceOfPit = priceOfPit;
	}

	public Double getPriceOfHusky() {
		return priceOfHusky;
	}

	public void setPriceOfHusky(Double priceOfHusky) {
		this.priceOfHusky = priceOfHusky;
	}

	public Double getPriceOfCoonhound() {
		return priceOfCoonhound;
	}

	public void setPriceOfCoonhound(Double priceOfCoonhound) {
		this.priceOfCoonhound = priceOfCoonhound;
	}

	public Double getPriceOfEskimo() {
		return priceOfEskimo;
	}

	public void setPriceOfEskimo(Double priceOfEskimo) {
		this.priceOfEskimo = priceOfEskimo;
	}

	public Double getPriceOfBeagal() {
		return priceOfBeagal;
	}

	public void setPriceOfBeagal(Double priceOfBeagal) {
		this.priceOfBeagal = priceOfBeagal;
	}

	public Double getPriceOfPitBull() {
		return priceOfPitBull;
	}

	public void setPriceOfPitBull(Double priceOfPitBull) {
		this.priceOfPitBull = priceOfPitBull;
	}

	public Double getPriceOfPugBull() {
		return priceOfPugBull;
	}

	public void setPriceOfPugBull(Double priceOfPugBull) {
		this.priceOfPugBull = priceOfPugBull;
	}

	public Double getPriceOfAuggie() {
		return priceOfAuggie;
	}

	public void setPriceOfAuggie(Double priceOfAuggie) {
		this.priceOfAuggie = priceOfAuggie;
	}

	public Double getPriceOfAustralianShepherd() {
		return priceOfAustralianShepherd;
	}

	public void setPriceOfAustralianShepherd(Double priceOfAustralianShepherd) {
		this.priceOfAustralianShepherd = priceOfAustralianShepherd;
	}

	public Double getPriceOfBarbet() {
		return priceOfBarbet;
	}

	public void setPriceOfBarbet(Double priceOfBarbet) {
		this.priceOfBarbet = priceOfBarbet;
	}

	public Double getPriceOfBassodon() {
		return priceOfBassodon;
	}

	public void setPriceOfBassodon(Double priceOfBassodon) {
		this.priceOfBassodon = priceOfBassodon;
	}

	public Double getPriceOfBasenji() {
		return priceOfBasenji;
	}

	public void setPriceOfBasenji(Double priceOfBasenji) {
		this.priceOfBasenji = priceOfBasenji;
	}

	public Double getPriceOfBeabull() {
		return priceOfBeabull;
	}

	public void setPriceOfBeabull(Double priceOfBeabull) {
		this.priceOfBeabull = priceOfBeabull;
	}

}
