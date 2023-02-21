package com.xworkz.object.things;

public class FootWare extends Object {
	private String brand;
	private double size;
	private String type;

	public FootWare(String brand, double size, String type) {
		this.brand = brand;
		this.size = size;
		this.type = type;
	}

	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running object in FootWare:" + obj);
		if (obj != null) {
			System.out.println("object is not null");
		if (obj instanceof FootWare) {
			System.out.println("Object is FootWare, so we can compare");
			FootWare casted = (FootWare)obj;
			FootWare fw=this;
			FootWare fw1=casted;
			if(fw.brand.equals(fw1.brand)&& fw.size == fw1.size && fw.equals(fw1.type)) {
				System.out.println("fw and fw1 are same");
				return true;
			}
			else {
				System.err.println("fw and fw1 are not same");
			}
		}	else {
				System.err.println("Object is not FootWare, so we cannot compare");
			}
		
		}else {
			System.err.println("object is null");
		}
		return super.equals(obj);
	}
 
	@Override
	public String toString() {

		return "brand:" + this.brand + "size:" + this.size + "type:" + this.type;

	}
}