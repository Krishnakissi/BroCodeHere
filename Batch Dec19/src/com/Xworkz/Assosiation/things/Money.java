package com.Xworkz.Assosiation.things;

public class Money {
	public String currency;
	public double balance;

	public Money() {
		System.out.println("no-argument constructor of money");
	}

	public Money(String currency, double balance) {
		System.out.println("String currency,double balance as arguments");
	}

	public void displayDetails1() {
		System.out.println("within displayDetails");
		System.out.println(this.currency);
		System.out.println(this.balance);
		System.out.println("outside displayDetails");

	}

}
