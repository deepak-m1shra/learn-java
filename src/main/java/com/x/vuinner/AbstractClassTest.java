package com.x.vuinner;

import java.lang.reflect.Field;

import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.IntSequenceGenerator;

abstract class AbstractClass {

	abstract void print();

	void print(int a) {
		System.out.println("Integer is " + a);
	}
}

public class AbstractClassTest extends AbstractClass {
	public static void main(String... strings) {

		int a = 1, b = 2, c = 3;

		AbstractClass abcTest = new AbstractClassTest();
		abcTest.print();
		abcTest.print(90);

	}

	@Override
	void print() {

		Field[] fields = this.getClass().getDeclaredFields();
		System.out.println("Overridden " + this.getClass().getDeclaredFields());

		for (Field field : fields) {
			System.out.println("Field = " + field);
		}

	}
	
	@Test
	public void instance_test() {
		String abc = "asdf";
		System.out.println(abc.getClass().getName());
		System.out.println(abc instanceof Object);
	}
	
}
