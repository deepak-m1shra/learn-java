package com.x.vuinner.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

import org.testng.annotations.Test;

public class InputOutput {

//	@Test
	public void read_from_console_using_scanner() {

		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		System.out.println("You entered the number " + n);
		System.out.println("Enter a string: ");
		String input = scan.nextLine();

		System.out.println("You entered string " + input);

		scan.close();
	}

//	@Test
	public void read_file() {

		File file = new File("Readme.txt");
//		BufferedReader br = new BufferedReader(new FileReader(file));
//
		String st = "";
//
//		while ((st = br.readLine()) != null) {
//			System.out.println(st);
//		}

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((st = br.readLine()) != null) {
				System.out.println(st);
			}
		} catch (NullPointerException | IOException ex) {
			System.out.println("blah blah" + ex.getStackTrace());
		}

	}

	@Test
	public void load_csv_file() {
		File file = new File("employees-csv.csv");
		String st = "";
		List<String> listOfEmps = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((st = br.readLine()) != null) {
				listOfEmps.add(st);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Number of records in the file = " + listOfEmps.size());
		System.out.println("Content of the file is " + listOfEmps);

		// Now storing this list in a map with id as key

		Map<String, HashMap<String, Object>> employeeDetails = new HashMap<>();

		// Need to split the values based on comma occurence of fix width

		// 0 - id, 1-name, 2-designation, 3-salary

		for (String item : listOfEmps) {
			HashMap<String, Object> entries = new HashMap<>();
			String[] arrayOfEmps = item.split(",");
			entries.put("name", arrayOfEmps[1]);
			entries.put("designation", arrayOfEmps[2]);
			entries.put("salary", arrayOfEmps[3]);
			employeeDetails.put(arrayOfEmps[0], entries);
		}
		
		System.out.println("Employee records" + employeeDetails);

	}
	
	@Test
	public void thread_safe_collections() {
		CopyOnWriteArrayList<String> arraylist = new CopyOnWriteArrayList<>();
	}

}
