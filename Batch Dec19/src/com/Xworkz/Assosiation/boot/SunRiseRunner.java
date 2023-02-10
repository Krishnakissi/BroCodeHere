package com.Xworkz.Assosiation.boot;
import com.Xworkz.Assosiation.things.Sun;
import com.Xworkz.Assosiation.things.SunRise;
public class SunRiseRunner {

	public static void main(String[] args) {
		
			System.out.println("main method started");
			SunRise sunrise = new SunRise("Morning", "Evening");
			sunrise.dispaly();
			Sun sun = new Sun("Round", true);
			sunrise.init(sun);
			sunrise.dispaly();
			System.out.println("main method ended");
		}

	}


