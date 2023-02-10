package com.Xworkz.boot;
import com.Xworkz.things.Medicine; 
public class MedicineRunner {

	public static void main(String[] args)
	{
		double ref=Medicine.price("dolo");
          System.out.println("dolo is--"+ref);
          
          double ref1=Medicine.price("crocin");
          System.out.println("crocin is--"+ref1);
          
          double ref3=Medicine.price("cipla");
          System.out.println("cipla is--"+ref3);
          
          double ref4=Medicine.price("vicks action 500");
          System.out.println("vicks action 500 is--"+ref4);
          
          double ref5=Medicine.price("dart");
          System.out.println("dart is--"+ref5);
          
          double ref6=Medicine.price("asprin");
          System.out.println("asprin is--"+ref6);
          
          double ref7=Medicine.price("easprin");
          System.out.println("easprin is--"+ref7);
          
          double ref8=Medicine.price("aleve");
          System.out.println("aleve is--"+ref8);
          
          double ref9=Medicine.price("vazalore");
          System.out.println("vazalore is--"+ref9);
          
          double ref10=Medicine.price("genebs");
          System.out.println("genebs is--"+ref10);
          
          double ref11=Medicine.price("tycolene");
          System.out.println("vazalore is--"+ref11);
          
         
	}
}
