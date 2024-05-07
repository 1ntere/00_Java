package com.kh.oop.method;

public class MethodEx {
	/*
	메서드
	
	클래스 내부에 존재
	특정 기능을 수행하는 코드를 묶어서 나타낸 것
	
	1. 메인메서드
	자바 프로그램을 시작할 때 사용하는 메서드
	작성한 메서드나 변수를 호출해서 최종으로 실행하는 메서드
	
	사용 예시
		public static void main(String[] args) {
			
		}
	main 이므로 public(보여져야 함), static(고정됨), void(실행되지만 반환 x)
	
	2. 생성자메서드
	생성자는 보통 메서드라는 이름을 붙여서 사용하지는 않지만 메서드의 한 종류
	클래스 명과 파일 명과 생성자 명은 동일해야 함
	
	3. void 메서드
	반환하는 값이 없는 메서드
	메서드가 실행은 되지만 실행 후 어떤 값도 반환하지 않음
	
	사용예시
		1) 매개변수가 없는 void 메서드
		public void method1() {
			System.out.println("hi~");
		}
	
		2) 매개변수가 있는 void 메서드
		public void method(자료형 매개변수) {
			System.out.println("매개변수 : "+매개변수);
		}
		
	4. return 메서드
	값을 반환하는 메서드
	메서드가 실행되면 결과를 반환하고, 메서드를 호출한 곳에 반환된 값을 제공
	
	사용예시
		public 자료형	method(int a, int b) {
			return 자료형에 해당하는 변수 명;
		}
		
		1) return 값이 String 일 때
		public String method(String str) {
			return str;
		}
		
		2) return 값이 int 일 때
		public String method(int num) {
			int abc = num;
			return abc;
		}
		
		3) return 값이 필드에 적혀 있거나 위에 먼저 적혀 있을 때
		String str;
		
		public String method() {
			return str;
		}
	*/
	
	//기본 생성자
	public MethodEx() {
		
	}
	
	//메서드
	public void 숫자합1(int a, int b) {
		int 합의결과 = a + b;
		System.out.println("숫자 합은 "+합의결과+" 입니다.");
	}
		
	
	public int 숫자합2(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		MethodEx met = new MethodEx();
		
		met.숫자합1(5, 3);
		
		
		//숫자합2는 계산을 하고 계산한 값을 결과라는 변수명에 넣어서
		//따로 출력까지 진행해야 함
		int 결과 = met.숫자합2(6, 4);
		System.out.println("결과는 : "+결과);
	}
}
