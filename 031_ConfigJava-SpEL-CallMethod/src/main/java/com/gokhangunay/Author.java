package com.gokhangunay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="beanAuthor")
public class Author {
	
	@Autowired
	private Book book;
	
	@Value("Gokhn")
	private String authorName;
	
	@Value("Gunay")
	private String authorSurname;
	
	@Value("#{beanBook.bookName}")
	private String authorBookName;
	
	@Value("#{beanBook.getShowBookInformation(beanAuthor.authorName, beanAuthor.authorSurname, beanBook.bookName, beanBook.bookISBN)}") // Bu sekilde sacma birsey olamaz, ama mantığını anlayın istedim.
	private String information;
	
	@Value("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$") // mail match edelim dedik. siz sakın ola böyle şeyler yapmayın :D
	private String regEx;
	
	@Value("asdsad")
	private String email;
		
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsEamil() {
		return isEamil;
	}

	public void setRegEx(String regEx) {
		this.regEx = regEx;
	}

	@Value("#{beanAuthor.email matches beanAuthor.regEx}")
	private Boolean isEamil;

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
	
	public String getRegEx() {
		return regEx;
	}

	public void setIsEamil(Boolean isEamil) {
		this.isEamil = isEamil;
	}
	
	@Override
	public String toString() {
		return "Author " +
				" \nauthorName=" + getAuthorName() +
				" \nauthorSurname=" + getAuthorSurname() +
				" \nauthorBookName=" + getAuthorBookName() +
				" \nisbn=" + getBook().getBookISBN() +
				" \nemail=" + getIsEamil() +
				" \nAuthor2 " + getInformation();
	}

}
