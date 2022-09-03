package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.PersonDTO;


public class PersonMukhya {

	public static void main(String[] args) {


		PersonDTO person = new PersonDTO();
		person.setName("Laxmi PG");
		person.setAge(23);
		person.setQualification("MCA");
		person.setInstitute("X-workz");
		person.setFrom("Odisha");
		person.setPost("Narendrapur");
		PersonDTO person2 = new PersonDTO();
		person2.setName("Laxmi PG");
		person2.setAge(23);
		person2.setQualification("MCA");
		person2.setInstitute("X-workz");
		person2.setFrom("Odisha");
		person2.setPost("Narendrapur");

		if (person.hashCode() == person2.hashCode()) {
			System.out.println("same address");
			person.equals(person2);
		} else {
			System.err.println("diff address");
		}
	}

}
