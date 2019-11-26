package com.x.vuinner.basics;

import org.testng.annotations.Test;

public class ScratchPad {

	@Test
	public void first_two() {
//		System.out.println("Output ----> " + front22("Britannia"));
		System.out.println(startOz("ozwoerowjfowef"));
	}
	
	@Test
	public void capital_test() {
		System.out.println("Input:");
		String input = "lower case string";
		System.out.println(input);
		System.out.println("Output:");
		System.out.println(capitalize(input));
	}
	
	@Test
	public void thread_test() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		};
		Thread t = new Thread();
		
	}
	
	public String capitalize(String input) {
		
		int indexPos = 0;
		String[] result = input.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i< result.length; i++) {
			sb.append(result[i]);
			sb.setCharAt(indexPos, (char) (sb.charAt(indexPos)-32));
			sb.append(" ");
			indexPos = sb.length();
		}
		
		return sb.toString();
	}

	public String front22(String str) {
		if (str.length() < 2) {
			return str + str + str;
		}
		return str.substring(0, 2) + str + str.substring(0, 2);
	}

	public String startOz(String str) {
		  int length = str.length();
		  String result = "";
		  
		  if(length<2 && str.charAt(0) != 'o'){
		     return "";
		  }
		 
		  
		  if (str.charAt(0) == 'o') {
					result = "o";
				}

				if (str.charAt(1) == 'z') {
					result = result + "z";
				}
				return result;
		}

}
