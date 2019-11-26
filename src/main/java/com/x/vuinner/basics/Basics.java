package com.x.vuinner.basics;

public class Basics {

	// instance variable can be declared here
	int a;

	// variable can't be initialized here
	// a =1000;

	public void instanceMethod(int a) {
//		can delcare and initialize in single statement

		int init = 100;

		int x, y, z;

		x = y = z = init;
		
		float f=100;
		long l = 23121132;
		long veryLong = 31231312322312331L;

		// nested method

		abstract class nested {
			class nexted {
				final class wowwww {

				}
			}
		}
	}
	
	public static void main(String[] args) {
		char tearsOfJoy = '\uD83D';
		System.out.println(tearsOfJoy);
	}
}
