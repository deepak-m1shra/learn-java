package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CompareTorAble {
	
	public static void main(String[] args) {
		Student stud1 = new Student(55, "Deepak", 94.97);
		Student stud2 = new Student(7, "Jitendra", 98.0);
		Student stud3 = new Student(1, "Vaibhav", 70.0);
		Student stud4 = new Student(30, "Nikhil", 87.0);
		Student stud5 = new Student(99, "Arjun", 40.0);
		Object obj = new Object();
		Class classObj = CompareTorAble.class.getClassLoader().getClass();
		
		
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(stud1);
		arrayList.add(stud2);
		arrayList.add(stud3);
		arrayList.add(stud4);
		arrayList.add(stud5);
		
		System.out.println("ArrayList content before sorting: ");
		
		//method 1
		System.out.println("Printing all the elements using method 1: ");
		arrayList.forEach(System.out::println);
		
		//method 2
		System.out.println("Printing all the elements using method 2: ");
		arrayList.forEach(item -> System.out.println(item));
		
		
		//Sorting
		
		Collections.sort(arrayList, new NameComparator());
		
		System.out.println("List contents after sorting (as per Name)");
		arrayList.forEach(System.out::println);
		
		Collections.sort(arrayList, new IdComparator());
		System.out.println("List contents after sorting (as per ID)");
		arrayList.forEach(System.out::println);
		
		Collections.sort(arrayList, new PercentageComparator());
		System.out.println("List contents after sorting (as per Percentage)");
		arrayList.forEach(System.out::println);
		
		List<String> list = new ArrayList<>();
		
		Collections.sort(list);
		
		// Iterating over map
		
		HashMap<String, String> map = new HashMap<>();
		map.put("girish","nandagiri");
		map.put("vinod","reddy");
		
//		Iterator<String, String> iter = map.
		
		System.out.println("printing map contents");
		
		map.forEach((a,b) -> System.out.println(a+ " "+b));
		
		
		
	}

}
