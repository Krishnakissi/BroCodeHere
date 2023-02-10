package com.xworkz.dustbin.boot;

import com.xworkz.dustbin.thing.GpBin;
import com.xworkz.dustbin.thing.Kushal;

public class Runner {

	public static void main(String[] args) {
//primitive
		int value=45;//init
		// non primitive 
		GpBin ref=new GpBin();//instantiation
		
		GpBin ref1=new GpBin();
		//local var
		Kushal kushal=new Kushal();
		
		GpBin bin;
		
		bin=null;
		kushal=null;
		
		kushal=new Kushal();
		ref=ref1;
		
		
	}

}
