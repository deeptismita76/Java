package com.xworkz.daodtotask.dto;

import java.util.Arrays;

public class MovieDTO {

	private String movieName;
	private double budget;
	private double collection;
	private String[] cast;
	private String[] production;
	private String director;
	private String musicBy;
	private String coreographyBy;
	private double imdbRatings;
	private boolean copied;
	private String movieType;
	private double duration;
	private String lang;
	private String releaseDate;
	private String country;

	public MovieDTO() {
		System.out.println("default const");
	}

	@Override
	public String toString() {
		return "MovieDTO [movieName=" + movieName + ", budget=" + budget + ", collection=" + collection + ", cast="
				+ Arrays.toString(cast) + ", production=" + Arrays.toString(production) + ", director=" + director
				+ ", musicBy=" + musicBy + ", coreographyBy=" + coreographyBy + ", imdbRatings=" + imdbRatings
				+ ", copied=" + copied + ", movieType=" + movieType + ", duration=" + duration + ", lang=" + lang
				+ ", releaseDate=" + releaseDate + ", country=" + country + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public double getCollection() {
		return collection;
	}

	public void setCollection(double collection) {
		this.collection = collection;
	}

	public String[] getCast() {
		return cast;
	}

	public void setCast(String[] cast) {
		this.cast = cast;
	}

	public String[] getProduction() {
		return production;
	}

	public void setProduction(String[] production) {
		this.production = production;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getMusicBy() {
		return musicBy;
	}

	public void setMusicBy(String musicBy) {
		this.musicBy = musicBy;
	}

	public String getCoreographyBy() {
		return coreographyBy;
	}

	public void setCoreographyBy(String coreographyBy) {
		this.coreographyBy = coreographyBy;
	}

	public double getImdbRatings() {
		return imdbRatings;
	}

	public void setImdbRatings(double imdbRatings) {
		this.imdbRatings = imdbRatings;
	}

	public boolean isCopied() {
		return copied;
	}

	public void setCopied(boolean copied) {
		this.copied = copied;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
