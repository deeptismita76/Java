package com.xworkz.datatransferobjecttask.mukhya;


import com.xworkz.datatransferobjecttask.dto.PgDTO;

public class PgMukhya {

	public static void main(String[] args) {


		PgDTO pg = new PgDTO();
		pg.setName("Laxmi PG");
		pg.setIdleFor("Ladies");
		pg.setLoction("BTM");
		pg.setCity("Bangalore");
		pg.setState("Karnataka");
		pg.setPin(560068);
		PgDTO pg2 = new PgDTO();
		pg2.setName("Laxmi PG");
		pg2.setIdleFor("Ladies");
		pg2.setLoction("BTM");
		pg2.setCity("Bangalore");
		pg2.setState("Karnataka");
		pg2.setPin(560069);

		if (pg.hashCode() == pg2.hashCode()) {
			System.out.println("same address");
			pg.equals(pg2);
		} else {
			System.err.println("diff address");
		}
	}

}
