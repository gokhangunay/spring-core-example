package com.gokhangunay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="beanAuthor")
public class Author {
	
	@Autowired
	private Book book;
	
	@Value("Gokhan") // Bu sekilde basit bir deger vermek çok saçma, şimdilik işimiz görülsün. :)
	private String authorName;
	
	@Value("Gunay")
	private String authorSurname;
	
	@Value("#{beanBook.bookName}") 
	private String authorBookName;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorSurname() {
		return authorSurname;
	}

	public void setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
	}

	public String getAuthorBookName() {
		return authorBookName;
	}

	public void setAuthorBookName(String authorBookName) {
		this.authorBookName = authorBookName;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author " +
				" \nauthorName=" + getAuthorName() +
				" \nauthorSurname=" + getAuthorSurname() +
				" \nauthorBookName=" + getAuthorBookName() +
				" \nisbn=" + getBook().getBookISBN();
	}

}
