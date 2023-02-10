package com.xworkz.dustbin.boot;

import com.xworkz.dustbin.thing.XeroxMachine;

public class XeroxMachineRunner {

	public static void main(String[] args) {

		XeroxMachine machine = new XeroxMachine();
		System.out.println(machine.color);
		System.out.println(machine.type);
		System.out.println(machine.size);
		System.out.println(machine.cost);
		System.out.println(XeroxMachine.brand);

		machine.color = "white";

		System.out.println(machine.color);
		XeroxMachine.brand = "Canon";
		System.out.println("=====================");
		XeroxMachine machine2 = new XeroxMachine();
		System.out.println(machine2.color);
		System.out.println(machine2.type);
		System.out.println(machine2.size);
		System.out.println(machine2.cost);

		machine2.cost = 25.5D;
		System.out.println(machine2.cost);//
		System.out.println(machine.cost);// 0.0
		System.out.println(machine2.brand);//Canon
		System.out.println(machine.brand);//Canon

		XeroxMachine.brand="Sony";
		System.out.println(XeroxMachine.brand);//Sony
		machine2.brand="Philips";
		System.out.println(machine.brand);//??Philips
		//static it will effect all the instance
		// non static it will not effect other instances
		
		     
		
		
		
	}

}
