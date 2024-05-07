package com.kh.arrayList.pre;
 
public class BookArray {
	//main 출력메서드
	public static void main(String[] args) {
		//객체
		Book[] 책들 = new Book[3];
		책들[0] = new Book("아몬드", "손원평");
		책들[1] = new Book("불변의 법칙", "모건 하우철");
		책들[2] = new Book("나는 읽고 쓰고 버린다", "손웅정");
		
		System.out.println(책들);//[Lcom.kh.arrayList.pre.Book;@1c4af82c
			//컴퓨터에서 책들이라는 배열의 주소
		
		//for문의 경우 여러 책들 중에서 1권만 가지고 오기 때문에
		//맨 앞 자료형에 배열을 붙여주지 않음
		for (Book 책 : 책들) {
			System.out.println(책.getBookName());
			System.out.println(책.getBookName());
			System.out.println(책.getAuthor());
		}
		System.out.println("===============");
		for (int i = 0; i<책들.length; i++ ) {
			책들[i].showBook();
		}
	}
}
