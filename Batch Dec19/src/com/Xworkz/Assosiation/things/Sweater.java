package com.Xworkz.Assosiation.things;

public class Sweater {
	public boolean cap;
	public int noOfPockets;
	public Brand brand;

	public Sweater() {
		System.out.println("creating a no-argument constructor");
	}

	public Sweater(boolean cap, int NoOfPockets) {
		this.cap = cap;
		this.noOfPockets = NoOfPockets;
		System.out.println(" boolean cap,int NoOfPockets as arguments");
	}

	

	public void init(Brand brand) {
		this.brand=brand;
	}
	
	 
	public void display() {
		System.out.println("inside the display method");
		System.out.println(this.cap);
		System.out.println(this.noOfPockets);
		System.out.println("outside the display method");
		if (this.brand != null) {
			this.brand.show();
		} else {
			System.out.println("this.zip not pointing to any memory");
		}
	}
}
