package com.x.vuinner;

import java.io.IOException;

import org.testng.annotations.Test;

public class SortSearchReplace {

	@Test
	public void sort_integer_array() {

	}

	@Test
	public void sort_char_array() {

	}

	@Test
	public void search_test() {

	}

	@Test
	public void replace() {

	}

	@Test()
	public void built_in_demo() throws IOException {

		// indexOf
		String sentence = "This is a string literal";

		System.out.println("Index of T is: " + sentence.indexOf("T"));
		System.out.println("Index of i is: " + sentence.lastIndexOf('i'));
		System.out.println("Replace string with str: " + sentence.replace("string", "str"));

		String hey = "hey";
		String hi = new String("hi").intern();
		String hi1 = "hi";
		String hi2 = "hi";

		System.out.println("hi == hi1 => " + (hi == hi1));
		System.out.println("hi == hi2 => " + (hi == hi2));
		System.out.println("hi1 == hi2 => " + (hi1 == hi2));
		
		System.out.println(Runtime.getRuntime().exec("cmd date").toString());

	}

	public int[] sortIntArr(int[] input, SortOrder sortOrder) {

		for (int i = 0, j = i + 1; i < input.length && j < input.length; i++) {

		}

		return input;
	}

}

enum SortOrder {
	ASCENDING, DESCENDING
}
