package com.xworkz.object.boot;

import com.xworkz.object.things.WaterFall;

public class WaterFallRunner {

	public static void main(String[] args) {
		WaterFall waterFall = new WaterFall("JogFalls",830,"Shivamoga");

		
		WaterFall waterFall1 = new WaterFall("Jhari",560,"Chickamagaluru");
		System.out.println(waterFall1.equals(waterFall));
		
		WaterFall waterFall2= new WaterFall("Jhari",560,"Chickamagaluru");
		System.out.println(waterFall2.equals(waterFall1));

	}

}
