package com.xworkz.datatransferobjecttask.mukhya;


import com.xworkz.datatransferobjecttask.dto.YouTubeDTO;

public class YouTubeMukhya {

	public static void main(String[] args) {

		YouTubeDTO youTube = new YouTubeDTO();
		youTube.setTypeOfBussiness("subsidiary");
		youTube.setTypeofSite("Online Video PlatForm");
		youTube.setFounded(2005);
		youTube.setHqrs("US");
		youTube.setAreaServed("worldwide");
		youTube.setOwner("Alphabet");
		YouTubeDTO youTube2 = new YouTubeDTO();
		youTube.setTypeOfBussiness("subsidiary");
		youTube.setTypeofSite("Online Video PlatForm");
		youTube.setFounded(2005);
		youTube.setHqrs("US");
		youTube.setAreaServed("worldwide");
		youTube.setOwner("Alphabet");
		if (youTube.hashCode() == youTube2.hashCode()) {
			System.out.println("same address");
			youTube.equals(youTube2);
		} else {
			System.err.println("diff address");
		}
	}

}
