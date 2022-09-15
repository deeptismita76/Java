package com.xworkz.customexceptiontask.dao;

import com.xworkz.customexceptiontask.exception.LimitExceedException;

public interface PrimeMinisterDAO {
	boolean store(String pmName);

	boolean check(String pmName);
}
