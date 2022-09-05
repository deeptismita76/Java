package com.xworkz.interfacetask;

import com.xworkz.interfacetask.bridge.*;
import com.xworkz.interfacetask.follower.ITRuleFollower;

public class ITRulesMukhya {

	public static void main(String[] args) {

		Object object = new ITRuleFollower();
		if(object instanceof ITRuleFollower) {
			ITRuleFollower convo = (ITRuleFollower)object;
			System.out.println(convo.applyLeaves());
			System.out.println(convo.harrasment());
			System.out.println(convo.parkingApproval());
			System.out.println(convo.informLeave());
			System.out.println(convo.swipCard());
			System.out.println(convo.wfh());
		}
		System.out.println("");
		HRRules hrRules = new ITRuleFollower();
		if(hrRules instanceof ITRuleFollower) {
			ITRuleFollower convo = (ITRuleFollower)hrRules;
			System.out.println(convo.applyLeaves());
			System.out.println(convo.harrasment());
			System.out.println(convo.parkingApproval());
			System.out.println(convo.informLeave());
			System.out.println(convo.swipCard());
			System.out.println(convo.wfh());
		}
		System.out.println("");
		ManagerRules managerRules  = new ITRuleFollower();
		if(managerRules instanceof ITRuleFollower) {
			ITRuleFollower convo = (ITRuleFollower)managerRules;
			System.out.println(convo.applyLeaves());
			System.out.println(convo.harrasment());
			System.out.println(convo.parkingApproval());
			System.out.println(convo.informLeave());
			System.out.println(convo.swipCard());
			System.out.println(convo.wfh());
		}
		System.out.println("");
		SecurityRules securityRules  = new ITRuleFollower();
		if(securityRules instanceof ITRuleFollower) {
			ITRuleFollower convo = (ITRuleFollower)securityRules;
			System.out.println(convo.applyLeaves());
			System.out.println(convo.harrasment());
			System.out.println(convo.parkingApproval());
			System.out.println(convo.informLeave());
			System.out.println(convo.swipCard());
			System.out.println(convo.wfh());
		}
		System.out.println("");
		ITRuleFollower follower  = new ITRuleFollower();
		if(follower instanceof ITRuleFollower) {
			ITRuleFollower convo = (ITRuleFollower)follower;
			System.out.println(convo.applyLeaves());
			System.out.println(convo.harrasment());
			System.out.println(convo.parkingApproval());
			System.out.println(convo.informLeave());
			System.out.println(convo.swipCard());
			System.out.println(convo.wfh());
		}
		
	}

}
