package com.x.vuinner;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Programs {

//	@Test
	public void left_rotate() {
	}

//	@Test
	public void toUpper() {
//		Stream<String> stream = Stream.of("abc", "def", "Ghi");
//		
//		System.out.println(stream.map(s -> s.toUpperCase()).collect(Collectors.toList()));

		String input = "this is a string in lowercase AND UPPERCASE".toUpperCase();

		System.out.println("original: " + input);
		System.out.println("after toUpperCase: " + toUpperCase(input));
	}

//	@Test
	public void ip_defang() {
		String input = "1.234.444.112";
		String replacedString = input.replaceAll("\\.", "[\\.]");
		System.out.println(replacedString);
	}

//	@Test
	public String mostCommonWord(String paragraph, String[] banned) {

		StringBuilder sb = new StringBuilder(paragraph);
		for (String ban : banned) {
//		           sb.set
		}

		return "";
	}

	@Test
	public void find_str_count() {
		StringBuilder sb1 = new StringBuilder("hey");
		StringBuilder sb2 = new StringBuilder("hey");

		System.out.println("if s1==s2 " + (sb1 == sb2));
	}

//	public static int majorityElement(int[] nums) {
//	        
//	        Map<Integer, Integer> map = new HashMap<>();
//	        
//	        int length = nums.length;
//	        
//	        for(int a: nums){
//	            if(map.containsKey(a)){
//	                map.put(new Integer(a), map.get(a)+1);
//	            }
//	        }
//	        
//	        map.st
//	        
//	    }

	public static String toUpperCase(String input) {
		StringBuilder sb = new StringBuilder();

		char[] split = input.toCharArray();

		for (char ch : split) {
			if (ch >= 97 && ch <= 122) {
				sb.append((char) (ch - 32));
			} else
				sb.append(ch);
		}
		return sb.toString();
	}

}
