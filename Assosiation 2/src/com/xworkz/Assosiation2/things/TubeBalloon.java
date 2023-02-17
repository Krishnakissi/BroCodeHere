package com.xworkz.Assosiation2.things;

public class TubeBalloon extends Balloon {
	public TubeBalloon() {
		System.out.println("no arg constructor of TubeBalloon ");
	}

	@Override
	public void blast() {
		System.out.println("calling blast method in TubeBalloon");
	}
}
