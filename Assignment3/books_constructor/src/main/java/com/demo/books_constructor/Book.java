package com.demo.books_constructor;

public class Book {
	int bookId;
	String bookName;
	Publisher publisher;
	Author author;

	public Book(int bookId, String bookName, Publisher publisher, Author author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.publisher = publisher;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", publisher=" + publisher + ", author=" + author
				+ "]";
	}

}
