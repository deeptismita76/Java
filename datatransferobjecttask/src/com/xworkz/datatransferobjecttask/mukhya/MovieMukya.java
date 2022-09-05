package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.MovieDTO;
import com.xworkz.datatransferobjecttask.dto.RealityShowDTO;

public class MovieMukya {

	public static void main(String[] args) {

		MovieDTO movie = new MovieDTO();
		movie.setMovieName("Indian Idol");
		movie.setType("Sony");
		movie.setImdbRatings(3.0);
		movie.setDirector("Aditya");
		movie.setReleaseYear(2009);
		movie.setBudget(55D);
		movie.setBoxOffice(400.61);
		movie.setLanguage("Hindi");
		movie.setProductionCompany("errors");
		movie.setCinematoGraphy("CK Murlidharan");
		movie.setPopularSong("Behti hawa");
		movie.setNarratedBy("R.Madhanvan");
		movie.setNoOfSongs(5);
		movie.setEditedBy("rajkumar");
		movie.setDuration(2D);
		movie.setCopied(true);
	
		MovieDTO movie2 = new MovieDTO();
		movie2.setMovieName("Indian Idol");
		movie2.setType("Sony");
		movie2.setImdbRatings(3.0);
		movie2.setDirector("Aditya");
		movie2.setReleaseYear(2009);
		movie2.setBudget(55D);
		movie2.setBoxOffice(400.61);
		movie2.setLanguage("Hindi");
		movie2.setProductionCompany("errors");
		movie2.setCinematoGraphy("CK Murlidharan");
		movie2.setPopularSong("Behti hawa");
		movie2.setNarratedBy("R.Madhanvan");
		movie2.setNoOfSongs(5);
		movie2.setEditedBy("rajkumar");
		movie2.setDuration(2D);
		movie2.setCopied(true);
		if (movie.hashCode() == movie2.hashCode()) {
			System.out.println("same address");
			movie.equals(movie2);
		} else {
			System.err.println("diff address");
		}

	}

}
