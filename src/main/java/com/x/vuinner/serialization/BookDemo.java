package com.x.vuinner.serialization;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class BookDemo {

	static {
		System.out.println("This is executing before main() method");
	}

	public static void main(String[] args) {
		Book book1 = new Book("Head First Java", "1998", "3838383838");
		Book book2 = new Book("Ahead First Java", "1999", "3838383838");
		Book book3 = new Book("Dead First Java", "2000", "3838383838");
		Book book4 = new Book("Meluha", "2018", "4323424234242");

		Set<Book> set = new TreeSet<>(new TitleComparator());
		set.add(book1);
		set.add(book2);
		set.add(book3);
		set.add(book4);
		int array[] = { 1, 2, 3, 4 };

		short b1, b2;
		b1 = b2 = 100;
		

		System.out.println("Sum of short items:  " + (byte) ((short)b1 + (short)b2));

		System.out.println("Contents of set: " + set);

		System.out.println("Iterating using for loop");
		
		

		for (Book book : set) {
			System.out.println("Book = " + book);
		}
		
		

//		Collections.sort(Collections.synchronizedSet(set));	

		Collection<Book> col = Collections.unmodifiableCollection(set);
	}

}

class TitleComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
