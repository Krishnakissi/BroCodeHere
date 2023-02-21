package com.xworkz.object.boot;

import com.xworkz.object.things.Alchoal;

public class AlchoalRunner {

	public static void main(String[] args) {
		Alchoal alchoal = new Alchoal("Black&white", 14, 3500, "Scotch");

		Alchoal alchoal1 = new Alchoal("RedLabel", 40, 6000, "Wishkey");
		System.out.println(alchoal1.equals(alchoal));

		Alchoal alchoal2 = new Alchoal("RedLabel", 40, 6000, "Wishkey");
		System.out.println(alchoal2.equals(alchoal));

	}

}
