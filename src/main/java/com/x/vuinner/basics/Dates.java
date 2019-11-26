package com.x.vuinner.basics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;

public class Dates {

	public static String getDate() {
		return LocalDate.now().toString();
	}

	public static void main(String... strings) {
		System.out.println("Date today is " + Dates.getDate());

		for (Integer k = 3, j = 0; k != 3; k++) {

		}

		int month = 0x030;

		switch (month) {
		case 1:
			System.out.println("this is 1");
			break;
		case 2:
			System.out.println("This is case 2");
			break;

		default:
			System.out.println("This is default");
//			break;

		case 3:
			System.out.println("This is case 3");
			break;
		}

		int[] array = new int[] { 1, 2, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < array.length; System.out.println(array[i++]))
			;

		System.out.println("Reversing the array");
		System.out.println("Original input" + Arrays.toString(array));
		System.out.println("reversed array is (method 1):  " + Arrays.toString(reverse1(array)));
		System.out.println("reversed array is (method 2): " + Arrays.toString(reverse2(array)));
		System.out.println("reversed array is (method 3): " + Arrays.toString(reverse3(array)));

//		String input = "asdfsffds";
//		input.substring

	}

	static int[] reverse1(int[] input) {

		long milliSec = System.currentTimeMillis();
		int[] reversedInt = new int[input.length];
		System.out.println(milliSec);
		for (int i = 0; i < input.length; i++) {
			reversedInt[i] = input[input.length - i - 1];
		}
		System.out.println("Total Execution time : " + (System.currentTimeMillis() - milliSec));

		return reversedInt;
	}

	static int[] reverse2(int[] input) {
		long milliSec = System.currentTimeMillis();
		int[] reversedInt = new int[input.length];
		System.out.println(milliSec);
		for (int i = 0, j = input.length; i < input.length; i++, j--) {
//			reversedInt[i] = input[input.length - i - 1];
			reversedInt[i] = input[j - 1];
		}
		System.out.println("Total Execution time : " + (System.currentTimeMillis() - milliSec));

		return reversedInt;
	}

	static int[] reverse3(int[] input) {
//		int[] reversedInt = new int[input.length];
		long milliSec = System.currentTimeMillis();
		System.out.println(milliSec);
		int temp;
		for (int i = 0, j = input.length - 1; i < j; i++, j--) {
			temp = input[i];
			input[i] = input[j];
			input[j] = temp;
		}
		System.out.println("Total Execution time : " + (System.currentTimeMillis() - milliSec));

		return input;
	}
}
