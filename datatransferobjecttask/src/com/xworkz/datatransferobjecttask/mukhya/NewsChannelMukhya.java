package com.xworkz.datatransferobjecttask.mukhya;

import com.xworkz.datatransferobjecttask.dto.NewsChannelDTO;

public class NewsChannelMukhya {

	public static void main(String[] args) {

		NewsChannelDTO channel = new NewsChannelDTO();
		channel.setChannelName("Aaj tak");
		channel.setOwner("Living media");
		NewsChannelDTO channel2 = new NewsChannelDTO();
		channel2.setChannelName("Aaj tal");
		channel2.setOwner("Dice media");
		if (channel.hashCode() == channel2.hashCode()) {
			System.out.println("same address");
			channel.equals(channel2);
		} else {
			System.err.println("diff address");
		}
	}

}
