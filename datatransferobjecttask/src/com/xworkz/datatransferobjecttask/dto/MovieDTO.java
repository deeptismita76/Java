package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class MovieDTO implements Serializable {
	
	private String movieName;
	private String type;
	private Double duration;
	private String[] cast;
	private String director;
	private Integer releaseYear;
	private Double budget;
	private String[] awards;
	private String[] screenPlay;
	private Double boxOffice;
	private String productionCompany;
	private String cinematoGraphy;
	private Double imdbRatings;
	private String narratedBy;
	private String editedBy;
	private String musicBy;
	private String country;
	private String language;
	private String producer;
	private Boolean remake;
	private Boolean oscar;
	private Boolean onNetFlix;
	private Boolean realStory;
	private Boolean copied;
	private String whoseStory;
	private String storyBasedOn;
	private Boolean isIndian;
	private Integer noOfSongs;
	private Double viewsOnNetFlix;
	private Double viewsOnAmazon;
	private Double viewsOnHotStar;
	private Double viewsOnYoutube;
	private String popularSong;
	private Double songDuration;
	private Double viewsOnZee;
	private Boolean songsOnJioSavan;
	private Boolean songsOnSpotify;
	private Boolean songsOnAmazon;
	private Boolean songsOnYtube;
	private Boolean songsOnGaana;
	private Boolean songsOnwynk;
	private Boolean songsOnAppleMusic;

	public MovieDTO() {
		
		System.out.println("default const");
	}
	@Override
	public int hashCode() {
		return 9849582;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof MovieDTO) {
				System.out.println("obj is instance of MovieDTO");
				MovieDTO convo = (MovieDTO) obj;
				String ref = convo.movieName;
				String ref2 = convo.type;
				Double ref3 = convo.imdbRatings;
				String ref4 = convo.director;
				Integer ref5 = convo.releaseYear;
				Double ref6 = convo.budget;
				Double ref7 = convo.boxOffice;
				String ref8 = convo.language;
				String ref9 = convo.productionCompany;
				String ref10 = convo.cinematoGraphy;
				String ref11 = convo.popularSong;
				String ref12 = convo.narratedBy;
				Integer ref13 = convo.noOfSongs;
				String ref14 = convo.editedBy;
				Double ref15 = convo.duration;
				Boolean ref16 = convo.copied;

				if (movieName.equals(ref) && type.equals(ref2) && imdbRatings.equals(ref3) && director.equals(ref4)
						&& releaseYear.equals(ref5) && budget.equals(ref6) && boxOffice.equals(ref7)
						&& language.equals(ref8) && productionCompany.equals(ref9) && cinematoGraphy.equals(ref10)
						&& popularSong.equals(ref11) && narratedBy.equals(ref12) && noOfSongs.equals(ref13)
						&& editedBy.equals(ref14) && duration.equals(ref15)
						&& copied.equals(ref16)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getDuration() {
		return duration;
	}
	public void setDuration(Double duration) {
		this.duration = duration;
	}
	public String[] getCast() {
		return cast;
	}
	public void setCast(String[] cast) {
		this.cast = cast;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public Integer getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	public String[] getAwards() {
		return awards;
	}
	public void setAwards(String[] awards) {
		this.awards = awards;
	}
	public String[] getScreenPlay() {
		return screenPlay;
	}
	public void setScreenPlay(String[] screenPlay) {
		this.screenPlay = screenPlay;
	}
	public Double getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(Double boxOffice) {
		this.boxOffice = boxOffice;
	}
	public String getProductionCompany() {
		return productionCompany;
	}
	public void setProductionCompany(String productionCompany) {
		this.productionCompany = productionCompany;
	}
	public String getCinematoGraphy() {
		return cinematoGraphy;
	}
	public void setCinematoGraphy(String cinematoGraphy) {
		this.cinematoGraphy = cinematoGraphy;
	}
	public Double getImdbRatings() {
		return imdbRatings;
	}
	public void setImdbRatings(Double imdbRatings) {
		this.imdbRatings = imdbRatings;
	}
	public String getNarratedBy() {
		return narratedBy;
	}
	public void setNarratedBy(String narratedBy) {
		this.narratedBy = narratedBy;
	}
	public String getEditedBy() {
		return editedBy;
	}
	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}
	public String getMusicBy() {
		return musicBy;
	}
	public void setMusicBy(String musicBy) {
		this.musicBy = musicBy;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public Boolean getRemake() {
		return remake;
	}
	public void setRemake(Boolean remake) {
		this.remake = remake;
	}
	public Boolean getOscar() {
		return oscar;
	}
	public void setOscar(Boolean oscar) {
		this.oscar = oscar;
	}
	public Boolean getOnNetFlix() {
		return onNetFlix;
	}
	public void setOnNetFlix(Boolean onNetFlix) {
		this.onNetFlix = onNetFlix;
	}
	public Boolean getRealStory() {
		return realStory;
	}
	public void setRealStory(Boolean realStory) {
		this.realStory = realStory;
	}
	public Boolean getCopied() {
		return copied;
	}
	public void setCopied(Boolean copied) {
		this.copied = copied;
	}
	public String getWhoseStory() {
		return whoseStory;
	}
	public void setWhoseStory(String whoseStory) {
		this.whoseStory = whoseStory;
	}
	public String getStoryBasedOn() {
		return storyBasedOn;
	}
	public void setStoryBasedOn(String storyBasedOn) {
		this.storyBasedOn = storyBasedOn;
	}
	public Boolean getIsIndian() {
		return isIndian;
	}
	public void setIsIndian(Boolean isIndian) {
		this.isIndian = isIndian;
	}
	public Integer getNoOfSongs() {
		return noOfSongs;
	}
	public void setNoOfSongs(Integer noOfSongs) {
		this.noOfSongs = noOfSongs;
	}
	public Double getViewsOnNetFlix() {
		return viewsOnNetFlix;
	}
	public void setViewsOnNetFlix(Double viewsOnNetFlix) {
		this.viewsOnNetFlix = viewsOnNetFlix;
	}
	public Double getViewsOnAmazon() {
		return viewsOnAmazon;
	}
	public void setViewsOnAmazon(Double viewsOnAmazon) {
		this.viewsOnAmazon = viewsOnAmazon;
	}
	public Double getViewsOnHotStar() {
		return viewsOnHotStar;
	}
	public void setViewsOnHotStar(Double viewsOnHotStar) {
		this.viewsOnHotStar = viewsOnHotStar;
	}
	public Double getViewsOnYoutube() {
		return viewsOnYoutube;
	}
	public void setViewsOnYoutube(Double viewsOnYoutube) {
		this.viewsOnYoutube = viewsOnYoutube;
	}
	public String getPopularSong() {
		return popularSong;
	}
	public void setPopularSong(String popularSong) {
		this.popularSong = popularSong;
	}
	public Double getSongDuration() {
		return songDuration;
	}
	public void setSongDuration(Double songDuration) {
		this.songDuration = songDuration;
	}
	public Double getViewsOnZee() {
		return viewsOnZee;
	}
	public void setViewsOnZee(Double viewsOnZee) {
		this.viewsOnZee = viewsOnZee;
	}
	public Boolean getSongsOnJioSavan() {
		return songsOnJioSavan;
	}
	public void setSongsOnJioSavan(Boolean songsOnJioSavan) {
		this.songsOnJioSavan = songsOnJioSavan;
	}
	public Boolean getSongsOnSpotify() {
		return songsOnSpotify;
	}
	public void setSongsOnSpotify(Boolean songsOnSpotify) {
		this.songsOnSpotify = songsOnSpotify;
	}
	public Boolean getSongsOnAmazon() {
		return songsOnAmazon;
	}
	public void setSongsOnAmazon(Boolean songsOnAmazon) {
		this.songsOnAmazon = songsOnAmazon;
	}
	public Boolean getSongsOnYtube() {
		return songsOnYtube;
	}
	public void setSongsOnYtube(Boolean songsOnYtube) {
		this.songsOnYtube = songsOnYtube;
	}
	public Boolean getSongsOnGaana() {
		return songsOnGaana;
	}
	public void setSongsOnGaana(Boolean songsOnGaana) {
		this.songsOnGaana = songsOnGaana;
	}
	public Boolean getSongsOnwynk() {
		return songsOnwynk;
	}
	public void setSongsOnwynk(Boolean songsOnwynk) {
		this.songsOnwynk = songsOnwynk;
	}
	public Boolean getSongsOnAppleMusic() {
		return songsOnAppleMusic;
	}
	public void setSongsOnAppleMusic(Boolean songsOnAppleMusic) {
		this.songsOnAppleMusic = songsOnAppleMusic;
	}
	

}
