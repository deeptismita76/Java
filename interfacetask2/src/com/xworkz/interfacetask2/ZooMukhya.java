package com.xworkz.interfacetask2;

import com.xworkz.interfacetask2.follower.VisiterZooRule;
import com.xworkz.interfacetask2.rules.ZooRules;
import com.xworkz.interfacetask2.user.NandanKananaZoo;

public class ZooMukhya {

	public static void main(String[] args) {

		ZooRules rules = new VisiterZooRule();
		
		NandanKananaZoo kananaZoo = new NandanKananaZoo(rules);
		kananaZoo.checkRules();
	}

}
