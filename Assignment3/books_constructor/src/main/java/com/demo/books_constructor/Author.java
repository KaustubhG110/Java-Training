package com.demo.books_constructor;

public class Author {

	int authorId;
	String authorName;

	public Author(int authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + "]";
	}

}
