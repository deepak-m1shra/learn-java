package com.x.vuinner;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class ScratchPad {
	public static void main(String[] args) {

		SortedSet<String> sortedSet = new TreeSet<String>();
		sortedSet.add("100");
		sortedSet.add("z");
		sortedSet.add("A");
		sortedSet.add("1");
		sortedSet.add("a");
		System.out.println("TreeSet contents are " + sortedSet);

		sortedSet.headSet("A");
		System.out.println("Treeset ka headset -> " + sortedSet.headSet("1"));
//		stackOverFlowError(10);
//		sortedSet.add(null);

//		sortedSet.he
	}

	public static void stackOverFlowError(int n) {
		try {
			stackOverFlowError(n - 1);
		} catch (StackOverflowError error) {
			System.out.println("Stack overflow ho gaya.. band karo sab" + error.getMessage());
		}

	}

//	@Test
	public void iterate_using_lambda() {
		List<String> strList = new ArrayList<>();

		strList.add("this2");
		strList.add("this3");
		strList.add("this4");
		strList.add("this5");
		strList.add("this6");
		strList.add("this7");

		strList.forEach(System.out::println);

		Iterator<String> str = strList.iterator();

		for (ListIterator<String> listItr = strList.listIterator(); listItr.hasNext();) {
			System.out.println("List content using list iterator " + listItr.next());

		}

	}

	@Test
	public void array_deque() {
		Deque<String> deque = new ArrayDeque<>();
		deque.push("1");
		deque.push("2");
		deque.push("3");
		deque.push("4");
		deque.push("5");

		System.out.println("Stack content" + deque);

		System.out.println("Stack content: " + deque.pop());
		System.out.println("Stack content: " + deque.pop());
		System.out.println("Stack content: " + deque.pop());
		System.out.println("Stack content: " + deque.pop());
		System.out.println("Stack content: " + deque.pop());

		deque.add("1");
		deque.add("2");
		deque.add("3");
		deque.add("4");
		deque.add("5");

		System.out.println("\n\nStack content: " + deque.pollFirst());
		System.out.println("Stack content: " + deque.pollFirst());
		System.out.println("Stack content: " + deque.pollFirst());
		System.out.println("Stack content: " + deque.pollFirst());
		System.out.println("Stack content: " + deque.pollFirst());
		System.out.println("Stack content: " + deque.pollFirst());

	}

	static <E> Set<E> addItems(String[] items) {

		return null;
	}

}
