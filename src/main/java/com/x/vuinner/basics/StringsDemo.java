package com.x.vuinner.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class StringsDemo {

//	@Test
	public void find_word_count() {

		String input = "This is a string ";
//				with many strings within it. Another string within the actual string, string again";
		String targetWord = "string";
		int count = findCount(input, targetWord);

		System.out.println("The occurence of the word" + targetWord + " is " + count + " times.");
	}

	private int findCount(String input, String targetWord) {

		String[] result = input.split(targetWord);

		return result.length - 1;
	}

//	@Test
	public void check_string_string_buffer_equality() {
		String a = "a";
		String b = new String("a");
		String c = "a";
		System.out.println("if a == b: " + (a == b));
		System.out.println("if c == a: " + (c == a));

		StringBuffer sba = new StringBuffer("a");
		StringBuffer sbb = new StringBuffer("a");
		System.out.println("if sba == sbb: " + (sba == sbb));
	}

//	@Test
	public void queue_test() {
		Queue<String> queue = new LinkedList<>();
		queue.add("1");
		queue.add("1");
		queue.add("2");
		queue.add("3");
		System.out.println(queue);

		System.out.println("peek(): " + queue.peek());
		System.out.println("queue after peek()" + queue);
		System.out.println("poll() " + queue.poll());
		System.out.println("queue after poll() " + queue);

		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("z", "this is zebra");
		treeMap.put("A", "A for Badka Apple");
		treeMap.put("a", "a for chotka Apple");
		treeMap.put("H", "H for holland");

		System.out.println("Value of treeMap " + treeMap);

		// Set ooperations
		Set<String> string = new HashSet<>();

		String stringwithCodepoint = "This is english";
		System.out.println("length of string in english of string with Codepoint: codePoints().count() "
				+ stringwithCodepoint.codePoints().count());

		System.out.println("stringwithCodepoint.length() : " + stringwithCodepoint.length());

		List<String> unsyncList = new ArrayList<>();
		unsyncList.add("1");
		unsyncList.add("abc");
		unsyncList.add("abc");
		unsyncList.add("abc");
		unsyncList.add("abc");
		List<String> syncList = Collections.synchronizedList(unsyncList);
		System.out.println("Frequency of abc in 1, abc is ---------->>>>> " + Collections.frequency(syncList, "abc"));
		System.out.println("Min/max of abc in 1, abc is ---------->>>>> " + Collections.min(unsyncList));
		System.out.println("Max of abc in 1, abc is ---------->>>>> " + Collections.max(unsyncList));
	}

//	@Test
	public void sort_string() {
		String inputString = "need to sort it";

		char[] sorted = inputString.toCharArray();

		for (int i = 0; i < sorted.length - 1; i++) {
			for (int j = i + 1; j < sorted.length - 1; j++)
				if (sorted[i] > sorted[j]) {
					char temp = sorted[i];
					sorted[i] = sorted[j];
					sorted[j] = temp;
				}
		}
		System.out.println("sorted array");
		for (char ch : sorted) {
			System.out.print(ch);
		}
		System.out.println();

//		Collections.frequency(list, o)
	}

	@Test
	public void iterator_example() {
		List<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Cabbage");

		Iterator<String> iter = list1.iterator();
		
		iter.next();
		iter.remove();

		// iterating the list

		while (iter.hasNext()) {
			System.out.println("elements: " + iter.next());
		}

		// removing element while iterating
		while (iter.hasNext()) {
			System.out.println("elements: " + iter.next());
			if (iter.next().equals("Apple")) {
				iter.remove();
			}
		}

		System.out.println("After remove operation: ");
		
		// Iterating using spliterator
		
		Spliterator<String> spliterator = list1.spliterator();
		System.out.println("Iterating using spliterator");
		spliterator.forEachRemaining(System.out::println);
		
		// Iterating using lambda expression
		
		System.out.println("Iterating using spliterator");
		list1.forEach(System.out::print);
		
//		Comparator<String> str = ((a, b) -> (a-b));
		
		// making unmodifiable list
		List<String> unmodifiableList = Collections.unmodifiableList(list1);
		System.out.println("Adding item to the unmodifiable list");
		unmodifiableList.add("item");
		
	}

}
