package com.Xworkz.Assosiation.boot;
import com.Xworkz.Assosiation.things.Gift;
import com.Xworkz.Assosiation.things.Box;
public class GiftRunner {

	public static void main(String[] args) {
		Gift gift=new Gift("choclate","celebration");
		gift.display();
		Box box=new Box("red","metal");
		gift.init(box);
				

	}

}
