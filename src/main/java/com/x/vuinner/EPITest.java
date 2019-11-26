package com.x.vuinner;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.testng.annotations.Test;

public class EPITest {

	@Test
	public void check_palindrome() {

		System.out.println(isPalindrome("do"));
		System.out.println(isPalindrome("nitin"));
		System.out.println(isPalindrome("awesome"));
		System.out.println(isPalindrome("racecar"));
		String a = "a";
		String aCopy = "a";
		String newA = new String("a").intern();
		System.out.println("if String a =\"a\" and String newA = new String(\"a\") are equal: " + (a == newA));
		System.out.println("a==aCopy " + (a == aCopy));
		System.out.println("equals comparison a.equals(newA): " + a.equals(newA));
		System.out.println("Address of a.identityHashCode(): " + System.identityHashCode(a));
		System.out.println("Address of aCopy.identityHashCode(): " + System.identityHashCode(aCopy));
		System.out.println("Address of newA.identityHashCode(): " + System.identityHashCode(newA));

		String replaceAwithB = "aaacccaaa";

		System.out.println("original string: " + replaceAwithB);
		System.out.println("Calling replace method: " + replaceAwithB.replace("a", "b"));

//		Runtime.getRuntime().exit(200);
//		System.exit(0);
		
		System.out.println("original string after calling replace: " + replaceAwithB);

		System.out.println("check" + a == a);

		final String abc ="abc";
		StringBuilder sbuilder1 = new StringBuilder("abc");
		StringBuilder sbuilder2 = new StringBuilder("abc");
		StringBuffer sbuffer = new StringBuffer("");

		System.out.println("sbuilder1 == sbuilder2: " + (sbuilder1.equals(sbuilder2)));
//		PreparedStatement ps = Connection.

	}

	boolean isPalindrome(String input) {

		boolean result = false;
		for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
			if (input.charAt(i) == input.charAt(j)) {
				result = true;
			} else
				break;

		}
		return result;
	}
}