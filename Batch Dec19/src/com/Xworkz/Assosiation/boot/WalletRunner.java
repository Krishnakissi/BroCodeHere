package com.Xworkz.Assosiation.boot;

import com.Xworkz.Assosiation.things.Wallet;
import com.Xworkz.Assosiation.things.Money;

public class WalletRunner {

	public static void main(String[] args) {
		System.out.println("inside main method");
		Wallet wallet = new Wallet("one8",500);
		wallet.displayDetails();
		Money money=new Money("Indian",2000.0d);
		wallet.init(money);
		wallet.displayDetails();
		System.out.println("outside ");
	}

}
