package com.Xworkz.Assosiation.things;

public class Box {
	public String colour;
	public String material;

	public Box() {
		System.out.println("created no-argument constructor");
	}

	public Box(String colour, String material) {
		this.colour = colour;
		this.material = material;
		System.out.println("String colour,String material as arguments");
	}

	

	public void display() {
		System.out.println(this.colour);
		System.out.println(this.material);
	}
}
