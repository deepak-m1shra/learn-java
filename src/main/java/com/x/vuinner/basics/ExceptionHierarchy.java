package com.x.vuinner.basics;

public class ExceptionHierarchy {

	float sum(float a, float b) throws Throwable {
		return a + b;
	}

	int sum(int a, int b) throws ArrayIndexOutOfBoundsException{
//		sum(1f,2f);
		return a + b;
	}
	
	public static void main(String...strings) throws Throwable {
		ExceptionHierarchy eh = new ExceptionHierarchy();
		eh.sum(1.0f, 2.0f);
		eh.sum(1, 2);
	}

}
