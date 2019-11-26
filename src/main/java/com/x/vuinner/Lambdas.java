package com.x.vuinner;

public class Lambdas {

	interface StringFInterface {

		String print(String s);

	}

	interface IntFInterface {

		int calculate(int a, int b);
	}

	int operate(int a, int b, IntFInterface intIf) {

		return intIf.calculate(a, b);
	}

	public static void main(String[] args) {
		IntFInterface add = (int x, int y) -> x + y;
		IntFInterface multiply = (int x, int y) -> x * y;

		Lambdas lmbds = new Lambdas();

		System.out.println("Result of add operation: " + lmbds.operate(5, 2, add));
		System.out.println("Result of multiply operations: " + lmbds.operate(5, 2, multiply));
		
		StringFInterface sf = (s) -> "hello " + s;
//		String switchString = "do";
//		int doSum = 0 ;//= 12;
		
		System.out.println("doing lambda stuff and returning ==> " + sf.print("Amazing!"));
		
	}
}
