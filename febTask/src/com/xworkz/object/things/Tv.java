package com.xworkz.object.things;

public class Tv extends Object {
	private String brand;
	private int size;
	private double prize;

	public Tv(String brand, int size, double prize) {
		this.brand = brand;
		this.size = size;
		this.prize = prize;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running object in Tv:" + obj);
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Tv) {
				System.out.println("Object is Tv, so we can compare");
				Tv casted = (Tv) obj;
				Tv tv = this;
				Tv tv1 = casted;
				if (tv.brand.equals(tv1.brand) && tv.size == tv1.size && tv.prize == (tv1.prize)) {
					System.out.println("tv and tv1 are same");
					return true;
				} else {
					System.err.println("tv and tv1 are not same");
				}
			} else {
				System.out.println("Object is not Tv, so we cannot compare");
			}

		} else {
			System.err.println("object is null");
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {

		return "brand:" + this.brand + "\n size:" + this.size + "\n prize:" + "this.prize";
	}
}
