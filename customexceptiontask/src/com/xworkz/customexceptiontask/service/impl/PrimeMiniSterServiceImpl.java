package com.xworkz.customexceptiontask.service.impl;

import com.xworkz.customexceptiontask.dao.PrimeMinisterDAO;
import com.xworkz.customexceptiontask.exception.LimitExceedException;
import com.xworkz.customexceptiontask.exception.NoSuchNameException;
import com.xworkz.customexceptiontask.service.PrimeMiniSterService;

public class PrimeMiniSterServiceImpl implements PrimeMiniSterService {
	
	private PrimeMinisterDAO dao ;
	
	public PrimeMiniSterServiceImpl(PrimeMinisterDAO dao) {
		this.dao = dao;
	}
	@Override
	public boolean verifyAndStore(String pmName) throws NoSuchNameException {
		if(pmName != null && pmName.length() > 4 && pmName.length() <50) {
			if(this.dao.check(pmName)) {
				throw new NoSuchNameException("name already taken");
				
			}else {
				System.out.println("name is not there you can store");
				this.dao.store(pmName);
			}
		}else {
			throw new NoSuchNameException("Invalid name");
		}
		return false;
	}

}
