package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> list = new ArrayList<>();
//메서드
	//생성자 (기본)
	public BookController() {
		
	}
	//책 추가하기 
	public void insertBook(Book bk) {
		 list.add(bk);
	}
	//책 전체보기
	public void selectList() {
		//만약에 책이 없다면 등록된 도서가 없습니다.
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
		} else {//책이 있다면 책 목록을 보여주자
			//for - each 문 : 전체보기
			for(Book b : list) {
				System.out.println(b.toString());
			}
		}
	}
	//키워드로 책 검색하기
	public void searchBook(String keyword) {
		List<Book> 검색결과 = new ArrayList<>();
		for(Book b : list) {
			if(b.getTitle().contains(keyword)) {
				검색결과.add(b);
			}
		}
		if(검색결과.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Book bb : 검색결과) {
				System.out.println(bb);
			}
		}
	}
	//도서 삭제 기능 추가
	public void deleteBook(String title, String author) {
		//true false를 통해 삭제가 됐는지 안됐는지 확인할 수 있도록 함
		boolean removed = false;//false
			//boolean은 false값이 기본이기 때문에 현재 removed = false;
		//책 제목과 저자를 검색해서 삭제할 책 찾기
		//전체목록 for-each
		for (Book bbb : list) {
			//만약에 내가 삭제하고자 하는 책 제목과 책 저자가 존재한다면
			//책제목가져오기.비교하기(내가삭제하고자하는책제목) && 책저자가져오기.비교하기(내가삭제하고자하는책저자) 
			if (bbb.getTitle().equals(title) && bbb.getAuthor().equals(author)) {
				list.remove(bbb);
				//삭제가 되었으면 true
				removed = true;
				break;//if문 나가기
			}
		}
		//만약에 삭제가 되었다면 삭제됐다를 true와 false를 이용해서 표시하기
		if (removed) {
			System.out.println("도서 삭제가 완료되었습니다.");
		} else {
			System.out.println("해당하는 도서를 찾을 수 없습니다.");
		}
	}
	//오름차순 정렬
	public void ascBook() {
		//1. for문이나 while문을 사용하여 short - 오름차순 정렬을 해주면 됨
			//└코드가 너무 길어지기 때문에 2번 방법을 사용
		//2. Collections.sort - 목록을 오름차순 정렬하다
							// 정렬하는 기준			책에서 책제목
							     // :: = Book 파일의 getTitle 참조해서 사용하겠다.
										//comparing 비교하다
		Collections.sort(list, Comparator.comparing(null));
	}
}