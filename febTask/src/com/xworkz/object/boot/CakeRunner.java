package com.xworkz.object.boot;

import com.xworkz.object.things.Cake;

public class CakeRunner {

	public static void main(String[] args) {
	Cake cake = new Cake("[ButterScotch]",2,"[round]",500);
	
	Cake cake1 = new Cake("BlackForest",4,"Square",450);
	System.out.println(cake.equals(cake1));
	
	Cake cake2 = new Cake("BlackForest",4,"Square",450);
	System.out.println(cake1.equals(cake2));
	
	}

}
