package com.x.vuinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class ComparatorTest {

	@Test
	public void add_employees() {
		Employee e1 = new Employee("deepak", 1, 415.55);
		Employee e2 = new Employee("jitendra", 2, 145.55);
		Employee e3 = new Employee("sashi", 3, 435.55);
		Employee e4 = new Employee("manoj", 4, 445.55);
		Employee e5 = new Employee("arjun", 5, 4511.55);
		Employee e6 = new Employee("subrat", 6, 450.55);

		List<Employee> list = new ArrayList<>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		System.out.println("List of employees before sort by salary: ");
		
		list.forEach(emp -> System.out.println(emp));
		
		Collections.sort(list, new SalaryComparator());
		

		System.out.println("List of employees before AFTER by salary:");
		
		list.forEach(emp -> System.out.println(emp));
		
//		for(Employee emp: list) {
//			System.out.println(emp);
//		}

	}

}
