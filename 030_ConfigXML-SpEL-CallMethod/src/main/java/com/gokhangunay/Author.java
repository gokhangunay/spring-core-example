package com.gokhangunay;

public class Author {
	
	private Book book;
	
	private String authorName;
	
	private String authorSurname;
	
	private String authorBookName;
	
	private String information;
	

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

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
	
	@Override
	public String toString() {
		return "Author " +
				" \nauthorName=" + getAuthorName() +
				" \nauthorSurname=" + getAuthorSurname() +
				" \nauthorBookName=" + getAuthorBookName() +
				" \nisbn=" + getBook().getBookISBN() + 
				" \nAuthor2 " + getInformation();
	}

}
