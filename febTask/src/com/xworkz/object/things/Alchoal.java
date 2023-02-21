package com.xworkz.object.things;

public class Alchoal {
private String brand;
private int percentage;
private double price;
private String type;

public Alchoal (String brand,int percentage,double price,String type) {
	this.brand=brand;
	this.percentage=percentage;
	this.price=price;
	this.type=type;
}

@Override
	public boolean equals(Object obj) {
		System.out.println(" running in Alchoal:"+obj);
		if(obj!=null) {
			System.out.println("Object is not null");
			if (obj instanceof Alchoal)
			{
				System.out.println("Object is Alchoal,we can compare");
				Alchoal casted = (Alchoal) obj;
				Alchoal alchoal = this;
				Alchoal alchoal1 = casted;
				if (alchoal.brand.equals(alchoal1.brand) && alchoal.percentage == alchoal1.percentage && alchoal.price==(alchoal1.price)) 
						
					
					System.out.println("(alchoal and alchoal1 are same");
				return true;
				}
			else {
				System.err.println("alchoal and alchoal1 are not same");
			}
		}
			else {
				System.out.println("Object is alchoal so we can compare");}
		{
			
		}
		
		return super.equals(obj);
	}




@Override
	public String toString() {
		
		return "brand:"+this.brand+"percentage:"+this.percentage+"price:"+this.price+"type:"+this.type;
	}
}
