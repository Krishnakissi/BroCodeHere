package com.xworkz.Assosiation2.boot;

import com.xworkz.Assosiation2.things.Clock;
import com.xworkz.Assosiation2.things.WallClock;

public class ClockRunner {

	public static void main(String[] args) {
		Clock clock=new WallClock();
		clock.getBrand();
		clock.time();       //Override

	}

}
