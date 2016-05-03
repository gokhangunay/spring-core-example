package com.gokhangunay;

/**
 * @author gokhan.gunay
 *
 */
public class Book {
	
	private String bookName;
	
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
