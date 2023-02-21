package com.xworkz.object.things;

public class Cake extends Object {
private String flavour;
private int weight;
private String shape;
private double price;




public Cake(String flavour,int weight,String shape,double price) {
	this.flavour=flavour;
	this.weight=weight;
	this.shape=shape;
	this.price=price;
}



@Override
	public boolean equals(Object obj) {
	System.out.println("running object in Cake:" + obj);
	if (obj != null) {
		System.out.println("object is not null");
	if (obj instanceof Cake) {
		System.out.println("Object is Cake, so we can compare");
		Cake casted = (Cake)obj;
		Cake cake=this;
		Cake cake1=casted;
		if(cake.flavour.equals(cake1.flavour)&& cake.weight == cake1.weight && cake.shape.equals(cake1.shape) && cake.price==(cake1.price)) {
			
			System.out.println("cake and cake1 are same");
	 		return true;
		}
		else {
			System.err.println("cake and cake1 are not same");
		}
	}	
	else {
			System.err.println("Object is not Cake, so we cannot compare");
		}
	
	}
	else {
		System.err.println("object is null");
	}  
	return super.equals(obj);
		
	}


	@Override
		public String toString() {
			
			return "flavour:"+this.flavour +" weight:"+this.weight+"shape:"+this.shape;
		}

}
