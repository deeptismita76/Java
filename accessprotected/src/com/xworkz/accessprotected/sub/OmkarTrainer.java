package com.xworkz.accessprotected.sub;

import com.xworkz.accessprotected.sup.Trainer;

public class OmkarTrainer extends Trainer {
	
	public OmkarTrainer(String name,double exp,String specialization) {
		super.name=name;
		super.exp=exp;
		super.specialization=specialization;
	}
	
	@Override
	public boolean training() {
		return super.training();
	}
	
	@Override
	public boolean conductInterview() {
		return super.conductInterview();
	}
	@Override
	public String coding(String courseName) {
		
		return super.coding(courseName);
	}
	
	public String getName() {
		return name;
	}
	public double getExp() {
		return exp;
	}
	public String getSpecialization() {
		return specialization;
	}

}
