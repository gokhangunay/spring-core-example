package com.gokhangunay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author gokhan.gunay
 *
 */
@Component(value="beanBook")
public class Book {
	
	@Value("SpringCore")
	private String bookName;
	
	@Value("123456")
	private String bookISBN;
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}
	
	public String getShowBookInformation(String authorName, String authorSurname, String bookName, String bookISBN){
		this.bookName = bookName;
		this.bookISBN = bookISBN;
		
		return 
		" \nauthorName=" + authorName +
		" \nauthorSurname=" + authorSurname +
		" \nauthorBookName=" + getBookName() +
		" \nisbn=" + getBookISBN().toString();
	}	

}
