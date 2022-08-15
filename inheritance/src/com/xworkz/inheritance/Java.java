package com.xworkz.inheritance;

public class Java extends ProgrammingLanguage{
	
	public Java(int scince,String father,String org,int noOfVersions,String newReleasedVersion) {
		
		System.out.println("Java Constructor.");
		this.scince = scince;
		this.father = father;
		this.org = org;
		this.noOfVersions = noOfVersions;
		this.newReleasedVersion = newReleasedVersion;
	}

}
