package com.kh.arrayList.pre;

public class Book {
//필드 (책이름, 저자)
	private String bookName;
	private String author;
//메서드
	//Setter
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//Getter
	public String getBookName() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	//생성자 기본
	public Book() {
		
	}
	//생성자 필수
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	//void
	public void showBook() {
		System.out.println(bookName+", "+author);
	}
}
