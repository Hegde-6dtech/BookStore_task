package com.book.proj;

public class Book {
	private String bookName;
	private String authorName;
	private String genre;
	private double price;

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		if (bookName == "")
			throw new IllegalArgumentException("Book name cannot be empty");
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		if (authorName == "")
			throw new IllegalArgumentException("Author name cannot be empty");
		this.authorName = authorName;
	}

	public String getGenre() {

		return genre;
	}

	public void setGenre(String genre) {
		if (genre == "")
			throw new IllegalArgumentException("genre cannot be empty");
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price <= 1)
			throw new IllegalArgumentException("price must be greater than 0");
		this.price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, String authorName, String genre, double price) {
		super();
		if (bookName == "")
			throw new IllegalArgumentException("Book name cannot be empty");
		this.bookName = bookName;
		
		if (authorName == "")
			throw new IllegalArgumentException("Author name cannot be empty");
		this.authorName = authorName;
		
		if (genre == "")
			throw new IllegalArgumentException("genre cannot be empty");
		this.genre = genre;
		
		if (price <= 1)
			throw new IllegalArgumentException("price must be greater than 0");
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " Book Name:" + bookName + "\n Author Name:" + authorName + "\n genre" + genre + "\n Price " + price;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Book) {
			Book b = (Book) obj;
			if (this.bookName.equals(b.bookName) && this.authorName.equals(b.authorName) && this.genre.equals(b.genre)
					&& this.price == b.price) {
				return true;
			} else
				return false;

		}
		return false;
	}

}
