package com.xworkz.customexceptiontask.dao.impl;

import com.xworkz.customexceptiontask.dao.PrimeMinisterDAO;
import com.xworkz.customexceptiontask.exception.LimitExceedException;

public class PrimeMinisterDAOImpl implements PrimeMinisterDAO {

	private String[] storage = new String[5];
	private int index = 0;

	@Override
	public boolean store(String pmName) {
		if (this.index < this.storage.length) {
			this.storage[index] = pmName;
			System.out.println(pmName);
			this.index++;
			return true;
		}else {
			throw new LimitExceedException("limit is up to five only");
		}
	}

	@Override
	public boolean check(String pmName) {
		for (String var : storage) {
			if (var != null && var.equals(pmName)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
