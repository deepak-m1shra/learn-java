package com.x.vuinner;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import org.testng.annotations.Test;

public class ProgramsDemo {

//	@Test(description = "1. Reverse a string")
	public void reverse_string() {
		String input = "This string is gonna be reversed ";
		System.out.print("The resultant string is ===> ");
		System.out.println(reverse(input));
	}

//	@Test(description = "2. Reverse the words in a string")
	public void reverse_words_in_string() {
		String input = "The words in this string will be reversed";
		StringBuilder result = new StringBuilder();
		StringTokenizer token = new StringTokenizer(input, " ");
		while (token.hasMoreTokens()) {
			result.append(reverse(token.nextToken()));
			result.append(" ");
		}
		// Result after doing stuff
		System.out.println("The resultant string using StringTokenizer is ==> " + result);

		// Code using split method
		String[] strArray = input.split(" ");

		StringBuilder splitSb = new StringBuilder();

		for (String str : strArray) {
			splitSb.append(reverse(str));
			splitSb.append(" ");
		}
		System.out.println("The resultant string using split method is ==> " + splitSb);
	}

//	@Test
	public void find_missing_array_element() {
		BitSet bitSet = new BitSet();
		BitSet bitSet2 = new BitSet(100);
		bitSet2.set(0);
		bitSet2.set(1);
		bitSet2.set(2);
		bitSet2.set(3);
		bitSet2.set(4);
		bitSet2.set(5);
		bitSet2.set(100);
		bitSet.set(1);
		System.out.println("Bitset 1 = " + bitSet);
		System.out.println("Bitset 1 = " + bitSet2);
		for (int i = 0; i < bitSet2.length(); i++) {
			System.out.println(bitSet2.nextClearBit(i));
		}
	}

//	@Test
	public void find_if_string_contains_duplicates() {
		String[] input = { "This", "is", "an", "input", "string", "to", "check", "for", "duplicates", "for",
				"duplicates" };
		String[] noDups = { "no", "dups" };
		System.out.println("input String contains duplicates? " + containsDups(input));
		System.out.println("noDups String contains duplicates? " + containsDups(noDups));

	}

//	@Test
	public void largest_smallest() {
		int[] intArray = new int[] { 1, 2, 5, 70, 88888, 0, -1, Integer.MAX_VALUE };
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int number : intArray) {

			if (number > largest) {
				largest = number;
			} else {
				smallest = number;
			}

		}
		System.out.println("Largest value is : " + largest);
		System.out.println("Smallest value is : " + smallest);
	}

//	@Test
	// TODO
	public void find_second_largest() {
		int[] numbers = new int[] { 1, 2, -98, 6346, 3, 4, 5, 6, 99, 7, 8, 100 };
		int first, second;
		first = Integer.MIN_VALUE;
		second = Integer.MIN_VALUE;

		for (int num : numbers) {
			if (num > first) {
				first = num;
				if (second != first)
					second = first;

			}
		}

		System.out.println("First and second largest : " + first + ", " + second);
	}

	@Test
	public void find_missing_elements() {
		int[] numbers = new int[] { 1, 4, 5, 6, 11, 1, 1, 1, 1, 10 };

		int[] tally = new int[12];

		for (int i : numbers) {
			tally[i] = i;
		}

		for (int i = 1; i < 12; i++) {
			if (tally[i] == 0)
				System.out.println("Missing ====" + i);
		}
	}
	
	@Test
	public static boolean containsDups(String[] input) {
		List<String> list = Arrays.asList(input);
		Set<String> hashSet = new HashSet<String>();

		System.out.println("Size of input: " + list.size());
		System.out.println("Size of hashSet: " + hashSet.size());

		boolean result = hashSet.size() != list.size();

		if (result) {
			for (String item : list) {
				if (hashSet.add(item) == false) {
					System.out.println("Found duplicate: " + item);
				}
			}
		}

		return result;
	}

	public static String reverse(String input) {
		StringBuilder sb = new StringBuilder();
		char[] chArray = input.toCharArray();
		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(chArray[i]);
		}
		return sb.toString();
	}
}
