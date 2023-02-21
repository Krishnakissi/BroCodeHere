package com.xworkz.object.boot;

import com.xworkz.object.things.Adike;

public class AdikeRunner {
	Adike adike = new Adike();

	String str = adike.getName();
	system.out.primtln(str);
	String str1 = adike.getType();
	System.out.println(str1);
	double d = adike.getPrice();
	System.out.println(d);
	double d1 = adike.getQuantity();
	System.out.println(d1);

	System.out.println(adike);
	System.out.println(adike.hashCode() + " Original hashCode :" + System.identityHashCode(adike));

	Adike adike1 = new Adike();
	adike1.getName();
	adike1.getType();
	adike1.getPrice();
	adike1.getQuantity();

	System.out.println(adike1);
	System.out.println(adike1.hashCode() + " Original hashCode :" + System.identityHashCode(adike1));

	System.out.println(adike.equals(adike1));
}}
