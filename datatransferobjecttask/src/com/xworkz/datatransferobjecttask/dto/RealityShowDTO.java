package com.xworkz.datatransferobjecttask.dto;

import java.io.Serializable;

public class RealityShowDTO implements Serializable {

	private String showName;
	private String channel;
	private Double imdbRating;
	private String hostName;
	private String[] judges;
	private String showType;
	private String producerName;
	private String productionHouse;
	private Integer currentYear;
	private String shootingSet;
	private Integer season;
	private Integer firstEpiDate;
	private Double likedPercentage;
	private String language;
	private String themeSong;
	private String[] awards;
	private String basedOn;
	private Integer noOfVersion;
	private String originalNetwork;
	private Integer currentlyOnAir;
	private Integer concluded;
	private Integer noLongerAiring;
	private Integer seasonOneYear;
	private String seasonOneWinner;
	private Integer seasonTwoYear;
	private String seasonTwoWinner;
	private Integer seasonThreeYear;
	private String seasonThreeWinner;
	private Integer seasonFourYear;
	private String seasonFourWinner;
	private Integer seasonFiveYear;
	private String seasonFiveWinner;
	private Integer seasonSixYear;
	private String seasonSixWinner;
	private Integer seasonSevenYear;
	private String seasonSevenWinner;
	private Integer seasonEightYear;
	private String seasonEightWinner;
	private Integer seasonNineYear;
	private String seasonNineWinner;
	private Integer seasonTenYear;
	private String seasonTenWinner;
	private Integer seasonElevenYear;
	private String seasonElevenWinner;
	private Integer seasonTwelveYear;
	private String seasonTwelveWinner;

	public RealityShowDTO() {
		System.out.println("defatul const");
	}

	@Override
	public int hashCode() {
		return 242748;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("not null continue");
			if (obj instanceof RealityShowDTO) {
				System.out.println("obj is instance of RealityShowDTO");
				RealityShowDTO convo = (RealityShowDTO) obj;
				String ref = convo.showName;
				String ref2 = convo.channel;
				Double ref3 = convo.imdbRating;
				String ref4 = convo.hostName;
				String ref5 = convo.producerName;
				String ref6 = convo.productionHouse;
				String ref7 = convo.shootingSet;
				String ref8 = convo.language;
				Integer ref9 = convo.season;
				Integer ref10 = convo.concluded;
				String ref11 = convo.themeSong;
				Integer ref12 = convo.seasonOneYear;
				Integer ref13 = convo.seasonTwoYear;
				String ref14 = convo.seasonTwoWinner;
				Integer ref15 = convo.seasonTenYear;
				Integer ref16 = convo.seasonEightYear;

				if (showName.equals(ref) && channel.equals(ref2) && imdbRating.equals(ref3) && hostName.equals(ref4)
						&& producerName.equals(ref5) && productionHouse.equals(ref6) && shootingSet.equals(ref7)
						&& language.equals(ref8) && season.equals(ref9) && concluded.equals(ref10)
						&& themeSong.equals(ref11) && seasonOneYear.equals(ref12) && seasonTwoYear.equals(ref13)
						&& seasonTwoWinner.equals(ref14) && seasonTenYear.equals(ref15)
						&& seasonEightYear.equals(ref16)) {
					System.out.println("matched.");
				} else {
					System.err.println("not matched");
				}
			}
		}
		return super.equals(obj);
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(Double imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String[] getJudges() {
		return judges;
	}

	public void setJudges(String[] judges) {
		this.judges = judges;
	}

	public String getShowType() {
		return showType;
	}

	public void setShowType(String showType) {
		this.showType = showType;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public String getProductionHouse() {
		return productionHouse;
	}

	public void setProductionHouse(String productionHouse) {
		this.productionHouse = productionHouse;
	}

	public Integer getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(Integer currentYear) {
		this.currentYear = currentYear;
	}

	public String getShootingSet() {
		return shootingSet;
	}

	public void setShootingSet(String shootingSet) {
		this.shootingSet = shootingSet;
	}

	public Integer getSeason() {
		return season;
	}

	public void setSeason(Integer season) {
		this.season = season;
	}

	public Integer getFirstEpiDate() {
		return firstEpiDate;
	}

	public void setFirstEpiDate(Integer firstEpiDate) {
		this.firstEpiDate = firstEpiDate;
	}

	public Double getLikedPercentage() {
		return likedPercentage;
	}

	public void setLikedPercentage(Double likedPercentage) {
		this.likedPercentage = likedPercentage;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getThemeSong() {
		return themeSong;
	}

	public void setThemeSong(String themeSong) {
		this.themeSong = themeSong;
	}

	public String[] getAwards() {
		return awards;
	}

	public void setAwards(String[] awards) {
		this.awards = awards;
	}

	public String getBasedOn() {
		return basedOn;
	}

	public void setBasedOn(String basedOn) {
		this.basedOn = basedOn;
	}

	public Integer getNoOfVersion() {
		return noOfVersion;
	}

	public void setNoOfVersion(Integer noOfVersion) {
		this.noOfVersion = noOfVersion;
	}

	public String getOriginalNetwork() {
		return originalNetwork;
	}

	public void setOriginalNetwork(String originalNetwork) {
		this.originalNetwork = originalNetwork;
	}

	public Integer getCurrentlyOnAir() {
		return currentlyOnAir;
	}

	public void setCurrentlyOnAir(Integer currentlyOnAir) {
		this.currentlyOnAir = currentlyOnAir;
	}

	public Integer getConcluded() {
		return concluded;
	}

	public void setConcluded(Integer concluded) {
		this.concluded = concluded;
	}

	public Integer getNoLongerAiring() {
		return noLongerAiring;
	}

	public void setNoLongerAiring(Integer noLongerAiring) {
		this.noLongerAiring = noLongerAiring;
	}

	public Integer getSeasonOneYear() {
		return seasonOneYear;
	}

	public void setSeasonOneYear(Integer seasonOneYear) {
		this.seasonOneYear = seasonOneYear;
	}

	public String getSeasonOneWinner() {
		return seasonOneWinner;
	}

	public void setSeasonOneWinner(String seasonOneWinner) {
		this.seasonOneWinner = seasonOneWinner;
	}

	public Integer getSeasonTwoYear() {
		return seasonTwoYear;
	}

	public void setSeasonTwoYear(Integer seasonTwoYear) {
		this.seasonTwoYear = seasonTwoYear;
	}

	public String getSeasonTwoWinner() {
		return seasonTwoWinner;
	}

	public void setSeasonTwoWinner(String seasonTwoWinner) {
		this.seasonTwoWinner = seasonTwoWinner;
	}

	public Integer getSeasonThreeYear() {
		return seasonThreeYear;
	}

	public void setSeasonThreeYear(Integer seasonThreeYear) {
		this.seasonThreeYear = seasonThreeYear;
	}

	public String getSeasonThreeWinner() {
		return seasonThreeWinner;
	}

	public void setSeasonThreeWinner(String seasonThreeWinner) {
		this.seasonThreeWinner = seasonThreeWinner;
	}

	public Integer getSeasonFourYear() {
		return seasonFourYear;
	}

	public void setSeasonFourYear(Integer seasonFourYear) {
		this.seasonFourYear = seasonFourYear;
	}

	public String getSeasonFourWinner() {
		return seasonFourWinner;
	}

	public void setSeasonFourWinner(String seasonFourWinner) {
		this.seasonFourWinner = seasonFourWinner;
	}

	public Integer getSeasonFiveYear() {
		return seasonFiveYear;
	}

	public void setSeasonFiveYear(Integer seasonFiveYear) {
		this.seasonFiveYear = seasonFiveYear;
	}

	public String getSeasonFiveWinner() {
		return seasonFiveWinner;
	}

	public void setSeasonFiveWinner(String seasonFiveWinner) {
		this.seasonFiveWinner = seasonFiveWinner;
	}

	public Integer getSeasonSixYear() {
		return seasonSixYear;
	}

	public void setSeasonSixYear(Integer seasonSixYear) {
		this.seasonSixYear = seasonSixYear;
	}

	public String getSeasonSixWinner() {
		return seasonSixWinner;
	}

	public void setSeasonSixWinner(String seasonSixWinner) {
		this.seasonSixWinner = seasonSixWinner;
	}

	public Integer getSeasonSevenYear() {
		return seasonSevenYear;
	}

	public void setSeasonSevenYear(Integer seasonSevenYear) {
		this.seasonSevenYear = seasonSevenYear;
	}

	public String getSeasonSevenWinner() {
		return seasonSevenWinner;
	}

	public void setSeasonSevenWinner(String seasonSevenWinner) {
		this.seasonSevenWinner = seasonSevenWinner;
	}

	public Integer getSeasonEightYear() {
		return seasonEightYear;
	}

	public void setSeasonEightYear(Integer seasonEightYear) {
		this.seasonEightYear = seasonEightYear;
	}

	public String getSeasonEightWinner() {
		return seasonEightWinner;
	}

	public void setSeasonEightWinner(String seasonEightWinner) {
		this.seasonEightWinner = seasonEightWinner;
	}

	public Integer getSeasonNineYear() {
		return seasonNineYear;
	}

	public void setSeasonNineYear(Integer seasonNineYear) {
		this.seasonNineYear = seasonNineYear;
	}

	public String getSeasonNineWinner() {
		return seasonNineWinner;
	}

	public void setSeasonNineWinner(String seasonNineWinner) {
		this.seasonNineWinner = seasonNineWinner;
	}

	public Integer getSeasonTenYear() {
		return seasonTenYear;
	}

	public void setSeasonTenYear(Integer seasonTenYear) {
		this.seasonTenYear = seasonTenYear;
	}

	public String getSeasonTenWinner() {
		return seasonTenWinner;
	}

	public void setSeasonTenWinner(String seasonTenWinner) {
		this.seasonTenWinner = seasonTenWinner;
	}

	public Integer getSeasonElevenYear() {
		return seasonElevenYear;
	}

	public void setSeasonElevenYear(Integer seasonElevenYear) {
		this.seasonElevenYear = seasonElevenYear;
	}

	public String getSeasonElevenWinner() {
		return seasonElevenWinner;
	}

	public void setSeasonElevenWinner(String seasonElevenWinner) {
		this.seasonElevenWinner = seasonElevenWinner;
	}

	public Integer getSeasonTwelveYear() {
		return seasonTwelveYear;
	}

	public void setSeasonTwelveYear(Integer seasonTwelveYear) {
		this.seasonTwelveYear = seasonTwelveYear;
	}

	public String getSeasonTwelveWinner() {
		return seasonTwelveWinner;
	}

	public void setSeasonTwelveWinner(String seasonTwelveWinner) {
		this.seasonTwelveWinner = seasonTwelveWinner;
	}
	

}
