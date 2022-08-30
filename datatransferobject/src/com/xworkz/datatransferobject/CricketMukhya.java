package com.xworkz.datatransferobject;

import com.xworkz.datatransferobject.dto.CricketDTO;

public class CricketMukhya {

	public static void main(String[] args) {
		
		CricketDTO dto = new CricketDTO();
		System.out.println(dto);
		dto.setTeamName("Indian Cricket Team");
		dto.setCoachName("Rahul Dravid");
		dto.setCoachAge(49);
		dto.setCoachExp(20);
		dto.setCoachFrom("Indore");
		dto.setCaptainName("Rohit Sharma");
		dto.setCaptainAge(35);
		dto.setCaptainExp(15);
		dto.setCaptainFrom("Nagpur");
		String[] arr = {"Virat","Rohit","Hardik","Sikhar","Rishav","KL Rahul","Jasprit","Jadeja","Dinesh Karthik","Bhubneswar Kumar","Muhammad Shami"};
		dto.setPlayers(arr);
		System.out.println(dto);
		
		System.out.println();
		CricketDTO dto2 = new CricketDTO();
		System.out.println(dto2);
		dto2.setTeamName("Indian women's Cricket Team");
		dto2.setCoachName("Ramesh Pawor");
		dto2.setCoachAge(44);
		dto2.setCoachExp(18);
		dto2.setCoachFrom("Mumbai");
		dto2.setCaptainName("Harmanpreet Kaur");
		dto2.setCaptainAge(33);
		dto2.setCaptainExp(10);
		dto2.setCaptainFrom("Moga");
		String[] arr2 = {"Smriti","Sefali","Deepthi","Mithali","Jhulan","Jemimah","Harleen","Yashtik","Sneh","Richa","Taniya"};
		dto2.setPlayers(arr2);
		System.out.println(dto2);
		
		System.out.println();
		CricketDTO dto3 = new CricketDTO();
		System.out.println(dto3);
		dto3.setTeamName("Afghanistan Cricket Team");
		dto3.setCoachName("Lance Klusener");
		dto3.setCoachAge(50);
		dto3.setCoachExp(25);
		dto3.setCoachFrom("Durba,South Africa");
		dto3.setCaptainName("Hashmatullah Shaidi");
		dto3.setCaptainAge(27);
		dto3.setCaptainExp(10);
		dto3.setCaptainFrom("Logar");
		String[] arr3 = {"Hashmatullah","Rahmat","Ibrahim","Najibullah","Shahidullah","Nasir","Abdul","Usman","Hazratullah","Raiz","Darwish"};
		dto3.setPlayers(arr3);
		System.out.println(dto3);
		
		System.out.println();
		CricketDTO dto4 = new CricketDTO();
		System.out.println(dto4);
		dto4.setTeamName("Australian Cricket Team");
		dto4.setCoachName("Andrew McDonald");
		dto4.setCoachAge(41);
		dto4.setCoachExp(25);
		dto4.setCoachFrom("Vicrtoriya");
		dto4.setCaptainName("Aaron Finch");
		dto4.setCaptainAge(35);
		dto4.setCaptainExp(10);
		dto4.setCaptainFrom("Australia");
		String[] arr4 = {"Steve","Glenn","David","Pat","Aaron","Michell","Nathan","Alex","Adam","Marcus","Kane"};
		dto4.setPlayers(arr4);
		System.out.println(dto4);
		
		System.out.println();
		CricketDTO dto5 = new CricketDTO();
		System.out.println(dto5);
		dto5.setTeamName("Pakistan Cricket Team");
		dto5.setCoachName("Shaun Tait");
		dto5.setCoachAge(39);
		dto5.setCoachExp(18);
		dto5.setCoachFrom("Australia");
		dto5.setCaptainName("Babar Azam");
		dto5.setCaptainAge(27);
		dto5.setCaptainExp(10);
		dto5.setCaptainFrom("Logar");
		String[] arr5 = {"Babar","Shaheen","Agha","Shadab","Imam","Hasan","Mohammad","Fakhar","Shoaib","Asif","Sarfaraz"};
		dto5.setPlayers(arr5);
		System.out.println(dto5);
		
		System.out.println();
		String[] arr6 = {"Ben","Joe","Jonny","Jos","Matthew","Moeen","Jamie","Jofra","Jason","Liam","Mark"};
		CricketDTO dto6 = new CricketDTO("England Cricket Team", "Brendon", 40, 19, "New Zealand", "Ben Stokes", 31, 10, "New Zealand", arr6);
		System.out.println(dto6);
		
		System.out.println();
		String[] arr7 = {"Chris","Nicholas","Devon","Shimron","Shai","Kyle","Jason","Kraigg","Akeal","Kemar","Carlos"};
		CricketDTO dto7 = new CricketDTO("West Indies Cricket Team", "Phil Simmons", 59, 26, "Tobago", "Nicholas", 26, 12, "Trinidad", arr7);
		System.out.println(dto7);
		
		System.out.println();
		String[] arr8 = {"Rassie","David","Quinton","Faf du","Aiden","Kagio","Dwaine","Andile","JP","Lungi","Imran"};
		CricketDTO dto8 = new CricketDTO("South Africa national Cricket Team", "Mark Boucher", 48, 20, "East London", "Temba Bavuma", 31, 10, "New Zealand", arr8);
		System.out.println(dto8);
		
		System.out.println();
		String[] arr9 = {"Dimuth","Kusal","Angelo","Lasith","Dhananjaya","Kasun","Jeffrey","Avishka","Kusal pepera","Jeevan","Thisara"};
		CricketDTO dto9 = new CricketDTO("Sri Lanka national Cricket Team", "Chis Silverwood", 47, 23, "England", "Dasun Shanaka", 30, 10, "Sri Lanka", arr9);
		System.out.println(dto9);
		
		System.out.println();
		String[] arr10 = {"Shakib","Mosaddek","Musfiqur","Tamim","Litton","Mehidy","Mahmudullah","Mustafizur","Mohammad","Sabbir","Soumya"};
		CricketDTO dto10 = new CricketDTO("Bangladesh national Cricket Team", "Russell Domingo", 47, 20, "South Africa", "Shaik Al Hasan", 35, 15, "Bangladesh", arr10);
		System.out.println(dto10);
		
		
	}

}
