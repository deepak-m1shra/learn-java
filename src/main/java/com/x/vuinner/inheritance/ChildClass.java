package com.x.vuinner.inheritance;

import java.util.Arrays;

public class ChildClass extends BaseClass {

	@Override
	void display() {
		System.out.println("display method from child class");
	}

	@Override
	int sum() {
		return 1 + 2;
	}
	
	@Override
	public String printMessage() {
		return null;
		
	}

	public static void main(String[] args) {

		System.out.println("Calling child method");
		ChildClass c = new ChildClass();
		c.display();

		BaseClass b = new ChildClass();
		b.display();

		System.out.println("CAlling base class");

		BaseClass b1 = new BaseClass();
		b1.display();

		BaseClass b2 = new ChildClass();

		int[] array = { 1, 2, 3, 4, 5, 6 };
//		System.out.println(Arrays.asList(array));
		printArray(array);

		int[] arrayCopy = new int[array.length];
		System.arraycopy(array, 0, arrayCopy, 0, array.length);

		System.out.println("Values of copied array");
		printArray(arrayCopy);

		System.out.println("Finding smallest and largest");
		printArray(largeSmall(arrayCopy));

	}

	static int[] largeSmall(int[] input) {

		int[] inputCopy = new int[input.length];

		int smallest = input[0], largest = input[1];

		if (input[0] > input[1]) {
			smallest = input[1];
			largest = input[0];

		}

		for (int i = 2; i < input.length - 1; i++) {
			if ((input[i] > input[i + 1]) && (input[i] > largest)) {
				largest = input[i];
			} else if ((input[i] < input[i + 1]) && (input[i] < smallest)) {
				smallest = input[i];
			}

		}

		return new int[] { largest, smallest };
	}

	public static String getMiddle(String str) {
		int length = str.length();

		if (length <= 2) {
			return str;
		}

		if (length % 2 == 0) {
			return str.substring(length / 2 - 1, length / 2 + 1);
		}

		return str.substring(length / 2, (length / 2) + 1);
	}

	static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
