package com.xworkz.Assosiation2.things;

public class WallClock extends Clock {
	public WallClock() {
		System.out.println("No arg const of WallClock");
	}
	@Override
	public void time() {
		System.out.println("running time in WallClock");
	}
}
