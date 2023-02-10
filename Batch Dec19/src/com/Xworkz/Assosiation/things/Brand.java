package com.Xworkz.Assosiation.things;

public class Brand {
	public double price;
	public String brandName;

	public Brand() {
		System.out.println("creating no-argument constructor");
	}

	public Brand(double price, String brandName) {
		this.price = price;
		this.brandName = brandName;
		System.out.println("double price ,String brandName as arguments");
	}

	
	
	
	
	public void show() {
		System.out.println(this.price);
		System.out.println(this.brandName);
	}
}
