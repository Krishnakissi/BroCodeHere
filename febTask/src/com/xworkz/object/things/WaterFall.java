package com.xworkz.object.things;

public class WaterFall {
	private String name;
	private int height;
	private String location;

	public WaterFall(String name, int height, String location) {
		this.location = location;
		this.height = height;
		this.location = location;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running object in WaterFal:" + obj);
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof WaterFall) {
				System.out.println("Object is WaterFall,we can compare");
				WaterFall casted = (WaterFall) obj;
				WaterFall waterFall = this;
				WaterFall waterFall1 = casted;
				if (waterFall.name.equals(waterFall1.name) && waterFall.height == waterFall1.height
						&& waterFall.location.equals(waterFall1.location))
				
				System.out.println("(waterFall and waterFall1 are same");
				return true;
				}
			else {
				System.err.println("waterFall and waterFall1 are not same");
			}
		}
			else {
				System.out.println("Object is waterFall so we can compare");}
		{
			
		}
	
	
		return super.equals(obj);
}

	@Override
	public String toString() {

		return "name:" + this.name + "height:" + this.height + "location:" + this.location;
	}
}

