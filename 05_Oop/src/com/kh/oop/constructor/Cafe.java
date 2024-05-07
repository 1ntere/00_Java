package com.kh.oop.constructor;

public class Cafe {
	//필드 선언
	public String 	name;
	public String 	location;
	public int 		tableNum;
	
	//기본 생성자
	public Cafe() {
		
	}
	
	//필수 생성자
	public Cafe(String name, String location, int tableNum) {
		this.name = name;
		this.location = location;
		this.tableNum = tableNum;
	}
	
	//void 메서드 만들기
	public void cafeInfo() {
		//카페 이름 지역 테이블 수 출력하기
		System.out.println("카페 이름 : "+name);
		System.out.println("카페 지역 : "+location);
		System.out.println("테이블 수 : "+tableNum);
		System.out.println("---------------");
	}
	
	public static void main(String[] args) {
		System.out.println("안녕하세요. ㅇㅇ의 민ㅇ입니다.");
		System.out.println("=== 카페 조회하기 ===");
		
		/*Cafe 객체를 사용해서
		//1. 기본생성자로 cafe1 : 이름, 테이블 작성하고 출력하기
		//2. 기본생성자로 cafe2 : 지역, 테이블 작성하고 출력하기
		//3. 필수생성자로 cafe3 : 필수로 생성한 내용 출력하기*/
		Cafe cafe1 = new Cafe();
		cafe1.name = "스타ㅇ스";
		cafe1.tableNum = 10;
		cafe1.cafeInfo();

		Cafe cafe2 = new Cafe();
		cafe2.location = "서울시 강남구";
		cafe2.tableNum = 15;
		cafe2.cafeInfo();
		
		Cafe cafe3 = new Cafe("투ㅇ플레이ㅇ", "서울시 마포구", 20);
		cafe3.cafeInfo();
	}
}
