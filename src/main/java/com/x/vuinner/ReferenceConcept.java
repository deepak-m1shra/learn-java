package com.x.vuinner;

public class ReferenceConcept {

}

class Book {
	String name;
	long id;

	public Book(String name) {
		this.name = name;
	}

	public Book(String name, long id) {
		this(name);
		this.id = id;
	}

	public Book updateTitle(int index, String title) {
		Book oldBook = new Book("this is it!");
		return oldBook;
	}
}