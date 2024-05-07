package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		//book1 책 정보 입력 후 출력
		Book book1 = new Book();
		book1.title = "그것이 알고 싶다.";
		book1.publisher = "SBㅇ";
		book1.author = "박진아";
		book1.inform();
		
		//book2 책 정보 필수 생성자에서 title, publisher, author 출력
		Book book2 = new Book("해리포터", "문학ㅇㅇ", "J.K.롤링");
		book2.inform();
		
		//book3 모두 입력되어있는 필수 생성자 이용해서 출력
		Book book3 = new Book("노인과 바다", "ㅇ머니스ㅇ",
				"헤밍웨이", 11250, 0.1);
		book3.inform();
	}
}
