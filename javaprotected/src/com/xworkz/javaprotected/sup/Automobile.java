package com.xworkz.javaprotected.sup;

public class Automobile {

	public String type;
	public String brand;

	public double sellAccesscories(String spareName) {

		if (spareName == "break") {

			System.out.println("Spare name is " + spareName + "and the price is " + 3000);
			return 3000;
		}
		if (spareName == "mirror") {

			System.out.println("Spare name is " + spareName + "and the price is " + 2000);
			return 2000;
		}
		if (spareName == "engine") {

			System.out.println("Spare name is " + spareName + "and the price is " + 8000);
			return 8000;
		}
		if (spareName == "wheels") {

			System.out.println("Spare name is " + spareName + "and the price is " + 10000);
			return 10000;
		}
		return 0.0;
	}

	protected void printData() {

		System.out.println(this.brand);
		System.out.println(this.type);
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

}
