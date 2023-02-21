package com.xworkz.object.things;

public class Fish {
	private String name;
	private String colour;
	private int price;
	private String gender;
	private int noOfFish;
	private int length;

	public Fish(String name, String colour, int price, String gender, int noOfFish, int length) {
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.gender = gender;
		this.noOfFish = noOfFish;
		this.length = length;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Fish in Object:" + obj);
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj instanceof Fish) {
				System.out.println("Object is Fish so we can compare");
				Fish casted = (Fish) obj;
				Fish fish = this;
				Fish fish1 = casted;
				if (fish.name.equals(fish1.name) && fish.colour.equals(fish1.colour) && fish.price == fish1.price
						&& fish.gender.equals(fish1.gender) && fish.noOfFish == fish1.noOfFish
						&& fish.length == fish1.length)
					;

				System.out.println("(fish and fish1 are same");
				return true;
			} else {
				System.err.println("fish and fish1 are not same");
			}
		} else {
			System.out.println("Object is fish so we can compare");
		}
		{

		}

		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "name:" + this.name + "colour:" + this.colour + "price:" + this.price + "gender:" + this.gender
				+ "noOfFish:" + this.noOfFish + "length:" + this.length;
	}
}
