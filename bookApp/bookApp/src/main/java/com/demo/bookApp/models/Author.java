package com.demo.bookApp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "author")
public class Author{

	@Id
	private String authorId;

	private String authorName;

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + "]";
	}

}
