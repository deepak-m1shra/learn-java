package com.x.vuinner.basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class LambdaTest {

	static int count = 0;

//	@Test
	public void sampleTest() {
		List<String> list = new ArrayList<>();
		list.add("item1");
		list.add("1");
		list.add("3");
		list.add("UPPERCASE");
		list.add("lowercase");

		list.stream().filter(a -> a.contains("a")).collect(Collectors.counting());

		A1 a1 = () -> System.out.println("interface a1");
		A2 a2 = () -> System.out.println("interface a2");

		System.out.println("A1 = ");
		System.out.println("A1 = " + a1.getClass().getName());
		a1.methodA1();

		System.out.println("A2 = " + a2.getClass().getName());
		System.out.println("A2 = ");
		a2.methodA2();

	}

//	@Test
	public void checks() {
		Checks isNull = null;
		Checks isEven = a -> (a % 2 == 0);
		try {
			isNull = a -> (new Integer(a) == null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Checks isNumber = a ->

		System.out.println("Even check -> is 4 even? " + isEven.check(4));
		System.out.println("Even check -> is 5 even? " + isEven.check(5));
		System.out.println("Null check -> if null is null? " + isNull.check(new Integer(null)));

//		int a = null;
//	primitives can't be null (need to have an instance of wrapper class)

	}

//	@Test
	public void ncopies() {
		List<Object> listObj = Collections.nCopies(10, new String("my name is "));
		for (Object obj : listObj) {
			System.out.println((String) obj + (count++));
		}
	}

	@Test
	public void collection_test() {
		Collection<String> str = new ArrayList<String>();
		str.add("1. asdf");
		str.add("2. pqrst");
		str.add("3. pqrst");
		str.add("4. pqrst");
		str.add("5. pqrst");

		System.out.println("Before iteration " + str);

		Iterator<String> itr = str.iterator();

		while (itr.hasNext()) {
			if (itr.next().contains("4")) {
				itr.remove();
			}
			System.out.println(itr.next());
		}

		System.out.println("Content after iteration" + str);

	}
}

interface Checks {
	boolean check(int a);
}

interface A1 {

	void methodA1();

}

interface A2 {
	void methodA2();
}