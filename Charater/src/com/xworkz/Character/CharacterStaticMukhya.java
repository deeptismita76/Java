package com.xworkz.Character;

public class CharacterStaticMukhya {

	public static void main(String[] args) {

		int val = Character.charCount(45);
		System.out.println(val);
		
		Character ch = Character.valueOf('g');
		System.out.println(ch);
		
		char var = Character.toUpperCase(ch);
		System.out.println(var);
		
		val = Character.toTitleCase(56);
		System.out.println(val);
		
		var = Character.toLowerCase('J');
		System.out.println(var);
		
	}

}
