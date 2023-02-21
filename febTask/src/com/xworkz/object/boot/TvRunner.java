package com.xworkz.object.boot;

import com.xworkz.object.things.Tv;

public class TvRunner {

	public static void main(String[] args) {
	Tv tv = new Tv("LG",53,30000);

	Tv tv1 = new Tv("Onida",32,25000);
	System.out.println(tv.equals(tv1));
	
	Tv tv2 = new Tv("oneplus",80,100000);
	System.out.println(tv2.equals(tv2));

}
}
