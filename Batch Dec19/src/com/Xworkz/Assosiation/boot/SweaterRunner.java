package com.Xworkz.Assosiation.boot;

import com.Xworkz.Assosiation.things.Sweater;
import com.Xworkz.Assosiation.things.Brand;

public class SweaterRunner {

	public static void main(String[] args) {
		System.out.println("inside main method");
		Sweater sweater = new Sweater(true, 5);
		sweater.display();
		Brand brand = new Brand(999.0d, "Puma");
		sweater.init(brand);
		sweater.display();
		System.out.println("outside main method");
	}

}
