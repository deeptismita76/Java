package com.xworkz.customexceptiontask.service;

import javax.naming.LimitExceededException;

import com.xworkz.customexceptiontask.exception.NoSuchNameException;

public interface PrimeMiniSterService {
	
	boolean verifyAndStore(String pmName) throws NoSuchNameException;
}
