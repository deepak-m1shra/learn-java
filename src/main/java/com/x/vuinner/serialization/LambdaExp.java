package com.x.vuinner.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class LambdaExp {

//	@Test
	public void lambda_demo() {
		List<String> strList = new ArrayList<>();
		strList.add("e");
		strList.add("nd");
		strList.add("This is the end");

		// Iterating the list using forEach
		strList.forEach(n -> System.out.println(n));
		Consumer<Integer> c = (n) -> System.out.println(n * n * n);

		c.accept(10);
	}

//	@Test
	public void convert_lower_to_upper() {
		String[] input = { "this ", "is ", "a ", "string ", "which ", "needs ", "to ", "be", " converted", " into",
				" uppercase" };
		List<String> stringList = new ArrayList<>(Arrays.asList(input));

		System.out.println("original input");
		stringList.forEach(System.out::print);

		List<String> lowercaseList = stringList.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());

		System.out.println("\nAfter uppercase");
		lowercaseList.forEach(System.out::print);

	}

	@Test
	public void find_factorial_using_lambda_non_generic() {
		Function f;
		f = (n) -> {

			int result = 1;
			for (int i = 2; i <= n; i++) {
				result = result * i;

			}
			return result;
		};

		System.out.println("Factorial of 3 is " + f.func(3));
		System.out.println("Factorial of 5 is " + f.func(5));
	}

	@Test
	public void find_factorial_generic() throws CustomException {
		GenericFunc<Integer> factorial = (n) -> {
			int result = 1;

			for (int i = 2; i <= n; i++) {
				result = result * i;
			}

			return result;
		};
		System.out.println("Factorial using lambda expression is " + factorial.func(5));
	}

	@Test
	public void reverse_string_generic() throws CustomException {
		String input = "Ana Gram Test In Progress";

		GenericFunc<String> reverse = str -> {
			String reversed = "";

			for (int i = str.length() - 1; i >= 0; i--) {
				reversed = reversed + str.charAt(i);
			}

			return reversed;
		};

		System.out.println("Reversed string is: --> " + reverse.func(input));
	}

	@Test
	public void reverse_words_generic() throws CustomException {
		String input = "Ana Gram Test In Progress";

		GenericFunc<String> reverse = str -> {
			String reversed = "";

			for (int i = str.length() - 1; i >= 0; i--) {
				reversed = reversed + str.charAt(i);
			}

			return reversed;
		};

		String reversed = reverse.func(input);

		System.out.println("Reversed string is: --> " + reversed);

		System.out.println("Reversed string reversed is");

		for (int i = reversed.length() - 1; i >= 0; i--) {

		}
	}

	@Test
	public void lambda_impl() {
//		String str = 
	}
	
	@Test
	public void throw_custom_exception() {
		
		GenericFunc<String> genfunc;
		
		genfunc = str -> str+"hello";
		
	}

	public static String stringOp(GenericFunc<String> genFunc, String str) throws CustomException  {
		return genFunc.func(str);
	}

	public void throw_exception() {

	}
}

class CustomException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5056331828437942789L;

	CustomException() {
		super("Custom exception encountered");
	}
}

interface Function {
	int func(int n);
}

interface GenericFunc<T> {
	T func(T t) throws CustomException;
}
