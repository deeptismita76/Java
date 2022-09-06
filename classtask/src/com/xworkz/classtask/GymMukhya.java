package com.xworkz.classtask;

import com.xworkz.classtask.follower.DeeptiGymRules;
import com.xworkz.classtask.rules.GymRules;
import com.xworkz.classtask.user.GymStaff;

public class GymMukhya {

	public static void main(String[] args) {

		GymRules gymRules = new DeeptiGymRules();
		
		GymStaff gymStaff = new GymStaff(gymRules);
		gymStaff.checkRules();;
		gymStaff.maintainace();
	}

}
