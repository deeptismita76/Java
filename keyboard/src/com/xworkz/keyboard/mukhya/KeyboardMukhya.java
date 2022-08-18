package com.xworkz.keyboard.mukhya;

import com.xworkz.keyboard.inheritance.sub.TouchPad;
import com.xworkz.keyboard.inheritance.sup.Keyboard;

public class KeyboardMukhya {

	public static void main(String[] args) {

		TouchPad touchPad = new TouchPad(3.5, 5.5, "White","Mobile",true,true);
		touchPad.torisu();
		
		System.out.println();
		Keyboard keyboard = new TouchPad(4,5,"black");
		//type casting
		TouchPad convo = (TouchPad)keyboard;
		convo.torisu();
		
		System.out.println();
		convo = new TouchPad(10.5, 8.5, "White","TAB",true,true);
		convo.torisu();
	}

}
