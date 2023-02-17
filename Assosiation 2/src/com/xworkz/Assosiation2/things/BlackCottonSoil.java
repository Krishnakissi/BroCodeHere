package com.xworkz.Assosiation2.things;

public class BlackCottonSoil extends Soil {
	public BlackCottonSoil() {
		System.out.println("no arg of constructor BlackCottonSoil ");
	}

	@Override
	public void fertile() {
		System.out.println("running ferile method in BlackCottonSoil ");
	}
}
