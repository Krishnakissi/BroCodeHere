package com.xworkz.Assosiation2.boot;

import com.xworkz.Assosiation2.things.Balloon;
import com.xworkz.Assosiation2.things.TubeBalloon;

public class BalloonRunner {

	public static void main(String[] args) {

	
	Balloon balloon = new TubeBalloon();
	balloon.blast();     //override
	balloon.expand();
	}

}
