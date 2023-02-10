package com.Xworkz.Assosiation.things;

public class Wallet {

	public String brand;
	public int price;
	public Money money;

	public Wallet() {
		System.out.println("no-argument constructor of wallet");
	}

	public Wallet(String brand, int price) {
		this.brand = brand;
		this.price = price;
		System.out.println("String brand,int price as arguments");
	}

	


	public void init(Money money) {
		this.money = money;
	}

	public void displayDetails() {
		System.out.println("within displayDetails");
		System.out.println(this.brand);
		System.out.println(this.price);
		System.out.println("outside displayDetails");
		if (this.money != null) {
			this.money.displayDetails1();
		} else {
			System.out.println("this.money is not pointing to any memory");
		}
	}
}
