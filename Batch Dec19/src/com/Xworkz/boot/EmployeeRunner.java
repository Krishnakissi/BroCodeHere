package com.Xworkz.boot;
import com.Xworkz.things.Employee;
public class EmployeeRunner {
	public static void main(String[] args) 
	{
		
		float ref=Employee.salary("Assistant engineer");
		System.out.println("Assistant engineer--"+ref);

		float ref1=Employee.salary("junior engineer");
		System.out.println("junior engineer--"+ref1);
		
		float ref2=Employee.salary("executive engineer");
		System.out.println("executive engineer--"+ref2);
		
		float ref3=Employee.salary("PDO");
		System.out.println("PDO--"+ref3);
		
		float ref4=Employee.salary("circle inspector");
		System.out.println("circle inspector--"+ref4);
		
		float ref5=Employee.salary("Assistant engineer");
		System.out.println("Assistant engineer--"+ref5);
		
		float ref6=Employee.salary("Assistant engineer");
		System.out.println("Assistant engineer--"+ref6);
		
		float ref7=Employee.salary("Assistant engineer");
		System.out.println("Assistant engineer--"+ref7);
		
		float ref8=Employee.salary("Assistant engineer");
		System.out.println("Assistant engineer--"+ref8);
		
		float ref9=Employee.salary("Assistant engineer");
		System.out.println("Assistant engineer--"+ref9);
	}

}
