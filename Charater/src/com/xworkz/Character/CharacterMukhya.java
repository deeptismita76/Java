package com.xworkz.Character;

public class CharacterMukhya {

	public static void main(String[] args) {
		
		Character ch = new Character('g');
		char character = ch.charValue();
		System.out.println(character);
		
		int val = ch.compareTo('l');
		System.out.println(val);
		
		boolean bool = ch.equals(val);
		System.out.println(bool);
		
		val = ch.hashCode();
		System.out.println(val);
		
		String str = ch.toString();
		System.out.println(str);
		
	}

}
