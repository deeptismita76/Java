package com.xworkz.daodtotask.main;

import com.xworkz.daodtotask.dao.MovieDAO;
import com.xworkz.daodtotask.dao.impl.MovieDAOImpl;
import com.xworkz.daodtotask.dto.MovieDTO;

public class MovieMukhya {

	public static void main(String[] args) {

		MovieDTO dto = new MovieDTO();
		dto.setMovieName("3 Idiots");
		dto.setBudget(55);
		dto.setCollection(400.61);
		String[] cast = {"Amir","R Madhvan","Kareena","Mona"};
		dto.setCast(cast);
		String[] prd = {"Vinod Chopra Films"}; 
		dto.setProduction(prd);
		dto.setDirector("Rajkumar Hirani");
		dto.setMusicBy("Sanjay Wardrkar");
		dto.setCoreographyBy("Ganesh Acharya");
		dto.setImdbRatings(8.4);
		dto.setCopied(true);
		dto.setMovieType("comedy/romance");
		dto.setDuration(2);
		dto.setLang("Hindi");
		dto.setReleaseDate("25 Dec 2009");
		dto.setCountry("India");
		
		MovieDAO dao = new MovieDAOImpl();
		dao.create(dto);
	}

}
