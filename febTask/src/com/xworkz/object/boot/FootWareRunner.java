package com.xworkz.object.boot;

import com.xworkz.object.things.FootWare;

public class FootWareRunner {

	public static void main(String[] args) {
		FootWare fw = new FootWare("Puma", 8, "MensWare");

		FootWare fw1 = new FootWare("Crocs", 6, "UniSex");
		System.out.println(fw.equals(fw1));
		
		FootWare fw2 = new FootWare("Crocs", 6, "UniSex");
		System.out.println(fw2.equals(fw1));
	}

}
