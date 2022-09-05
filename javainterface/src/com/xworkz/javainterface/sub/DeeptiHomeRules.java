package com.xworkz.javainterface.sub;

import com.xworkz.javainterface.interfaceclass.HomeRules;

public class DeeptiHomeRules implements HomeRules {

	@Override
	public Double eveEntryTime() {

		return 18D;
	}

	@Override
	public Boolean drinkAlchohol() {

		return false;
	}

	@Override
	public Boolean smoke() {

		return false;
	}

	@Override
	public Boolean nightMobUsage() {
		return false;
	}

}
