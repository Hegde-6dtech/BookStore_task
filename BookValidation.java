package com.book.proj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookValidation {
	public static List<Book> bs = new ArrayList<Book>();

	// add book
	public static void addBook(String bName, String bAuthor, String bGen, double bPrice) {
		Book b1 = new Book(bName, bAuthor, bGen, bPrice);
		bs.add(b1);
		System.out.println("Book "+bName+" added sucessfully..!");
	}

	// view all book
	public static void viewBook() {
		if (!bs.isEmpty()) {
			for (Book s : bs) {
				System.out.println(s);
			}

		} else
			System.out.println("Book store is empty..! add books first");
	}

	// view book by author
	public static void viewAuthor(String bookAuthorName) {
		for (Book s : bs) {
			if (s.getAuthorName().contains(bookAuthorName)) {
				System.out.println(s);
			}
			else
				System.out.println("Sorry this "+bookAuthorName+" book you are looking is not available.!!");
		}
	}

	// view book by genre
	public static void viewGenre(String bookGenreName) {
		for (Book s : bs) {
			if (s.getGenre().contains(bookGenreName)) {
				System.out.println(s);
			}
			else
				System.out.println("The "+bookGenreName+" book is not available.!!");
		}
	}

	// To sell books
	public static void sellBook(String sellBookName) {
		Iterator<Book> it = bs.iterator();
		while (it.hasNext()) {
			if (it.next().getBookName().equals(sellBookName)) {
				it.remove();
			}
			else
				System.out.println("The book is not in the store");
		}
		System.out.println("The book " + sellBookName + " successfully sold");
		viewBook();
	}
}
