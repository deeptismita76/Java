package com.xworkz.javadao.implementor;

import java.util.Iterator;

import com.xworkz.javadao.dao.LakeDAO;

public class LakeDAOImplementor implements LakeDAO {
	
	private String[] lakeNames=new String[10];
	@Override
	public boolean save(String lakeName) {
		for (int i = 0; i < lakeNames.length; i++) {
			if(lakeNames[i]==null) {
				lakeNames[i]=lakeName;
				break;
			}
		}
		return true;
	}

	@Override
	public void printAllLakes() {
		for (int i = 0; i < lakeNames.length; i++) {
			System.out.println(lakeNames[i]);
		}
		
	}

}
