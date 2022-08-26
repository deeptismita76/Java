package com.xworkz.accessprotected.mukhya;

import com.xworkz.accessprotected.sub.OmkarTrainer;
import com.xworkz.accessprotected.sup.Trainer;

public class TrainerMukhya {

	public static void main(String[] args) {
		
			OmkarTrainer trainer = new OmkarTrainer("Omkar",13,"Java");
			if(trainer instanceof OmkarTrainer) {
				
				OmkarTrainer convo = (OmkarTrainer)trainer;
				System.out.println(convo.getName());
				System.out.println(convo.getExp());
				System.out.println(convo.getSpecialization());
				System.out.println(convo.coding("java"));
				System.out.println(convo.conductInterview());
				System.out.println(convo.training());
			}

	}

}
