package com.gokhangunay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author gokhan.gunay
 *
 */
@Component(value="beanBook")
public class Book {
	
	@Value("SpringCore Book") // Bu sekilde basit bir deger vermek çok saçma, şimdilik işimiz görülsün. :)
	private String bookName;
	
	@Value("123456789")
	private Long bookISBN;
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Long getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(Long bookISBN) {
		this.bookISBN = bookISBN;
	}


	
	

}
