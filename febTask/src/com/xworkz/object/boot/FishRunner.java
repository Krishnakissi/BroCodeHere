package com.xworkz.object.boot;

import com.xworkz.object.things.Fish;

public class FishRunner {

	public static void main(String[] args) {
		Fish fish=new Fish("GoldenFish","gold",250,"male",10,15);
		
		
		Fish fish1=new Fish("FighterFish","red",300,"male",1,10);
		System.out.println(fish1.equals(fish));
		
		Fish fish2=new Fish("FighterFish","red",300,"male",1,10);
		System.out.println(fish2.equals(fish1));
	}

}
