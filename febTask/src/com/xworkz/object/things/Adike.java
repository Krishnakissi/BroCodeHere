package com.xworkz.object.things;

public class Adike {
	private String name;
	private String type;
	private double price;
	private double quantity;

	public Adike() {
		System.out.println("no arg constructor of Adike");
	}

	public String getName() {
		return "Adike";
	}

	public String getType() {
		return "bags";
	}

	public double getPrice() {
		return 46500D;
	}

	public double getQuantity() {
		return 100D;
	}

	@overide
	public String toString() {
		return "name :" + this.name + " \ntype :" + this.type + " \n price :" + this.price + "\n quantity :"
				+ this.quantity;
	}

	@overide
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}