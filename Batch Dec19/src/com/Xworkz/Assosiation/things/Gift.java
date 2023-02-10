package com.Xworkz.Assosiation.things;

public class Gift {
	public String name;
	public String type;
	public Box Box;

	public Gift() {
		System.out.println("created no-argument constructor");
	}

	public Gift(String name, String type) {
		this.name = name;
		this.type = type;
		System.out.println("created String Name,String type as arguments");
	}

	public void init(Box Box) {
		this.Box = Box;
	}

	public  void display() {
		System.out.println("inside main method");
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println("outside main method");
		if (this.Box != null) {
			this.Box.display();
		} else {
			System.out.println("this.box is not pointing any memory");
		}
	}
}
