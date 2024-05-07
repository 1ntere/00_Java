package com.kh.oop.constructor;

public class ConstructorEx {
	/*
	생성자
	
	변수를 원하는 값으로 초기화를 진행할 수 있음
	
	초기값 = 0; 으로 되어 있을 때 초기값에 1을 넣어주면
	초기값이 1로 초기화됨
	
	1. 반환값이 없음(return 사용 x, void로 선언하지도 않음)
	2. 객체(클래스)를 초기화하는 방법이 많을 경우 모두 사용 가능
		선언 예제
			1. 기본 생성자(초기 생성자) - 아무런 값도 필수가 아님
				public 클래스이름() {
			
				}
			2. 필수 생성자 - 필수로 받아야하는 값이 존재
						- 필수로 받아야하는 값은 필드에 적힌 값만 가능
				public 클래스이름(String ㅇㅇ, int ㅁㅁ, char ㅎㅎ) {
					//여기서 변수명과 필드값은 같음
					this.필드값1 = ㅇㅇ;
					this.필드값2 = ㅁㅁ;
					this.필드값3 = ㅎㅎ;
				}
			3. 값을 지정한 생성자
				필드나 생성자에서 값을 지정해준 생성자
	*/
	
	//필드 변수명 정의
	public String name;//비어있음 (null)
	public String phone;//비어있음 (null)
	public int idNo;//비어있음 (0)
	public int money;//비어있음 (0)
	
	/*1. 기본 생성자, 2. 필수 생성자, 3. 값을 지정한 생성자*/
	
	//1. 기본 생성자 : 필수로 아무것도 넣지 않은 생성자
	public ConstructorEx() {
		
	}
	
	//2. 필수 생성자 : 괄호 안에 매개변수가 필수로 들어가야 하는 생성자
	//매개변수 : 媒 매 (중매) 介 개 (끼일) 變 변 (변할) 數 수 (숫자)
	//매개변수의 이름은 중요하지가 않음
	//매개변수의 자료형만 중요함
	//                  ( 매   개   변   수 )
	//					필수 : 이름
	public ConstructorEx(String inputName) {
		this.name = inputName;
	}
	/* 오류 발생
	//					필수 : 핸드폰 번호	
	public ConstructorEx(String inputPhone) {
		this.phone = inputPhone;
	}
	*/
	//					필수 : 이름, 핸드폰 번호	
	public ConstructorEx(String inputName, String inputPhone) {
		this.name = inputName;
		this.phone = inputPhone;
	}
	//					필수 : 이름, 핸드폰 번호, 아이디 번호
	public ConstructorEx(String inputName, String inputPhone, 
			int inputIdNo) {
		this.name = inputName;
		this.phone = inputPhone;
		this.idNo = inputIdNo;
	}
	//					필수 : 이름, 핸드폰 번호, 아이디 번호
	public ConstructorEx(String inputName, int inputIdNo, 
			String inputPhone) {
		this.name = inputName;
		this.phone = inputPhone;
		this.idNo = inputIdNo;
	}
	//					필수 : 이름, 핸드폰 번호, 아이디 번호
	public ConstructorEx(int inputIdNo, String inputName,
			String inputPhone) {
		this.name = inputName;
		this.phone = inputPhone;
		this.idNo = inputIdNo;
	}
	/* 오류 발생
	//					필수 : 이름, 핸드폰 번호, 아이디 번호
	public ConstructorEx(String inputPhone, String inputName, 
			int inputIdNo) {
		this.phone = inputPhone;
		this.name = inputName;
		this.idNo = inputIdNo;
	}
	*/
	//					필수 : 이름, 핸드폰 번호, 아이디 번호, 돈
	public ConstructorEx(String inputName, String inputPhone,
			int inputIdNo, int inputMoney) {
		this.name = inputName;
		this.phone = inputPhone;
		this.idNo = inputIdNo;
		this.money = inputMoney;
	}
	
	//3. 값을 지정한 생성자
	/*
	값을 지정한 생성자는 초기의 값만 지정해주기 때문에
	매개변수를 필수로 넣어주지 않아도 되지만
	초기 생성자와 생김새가 똑같아서 빨간 줄이 나기 때문에(오류가 나기 때문에)
	현재는 임의로 매개변수를 넣어줌
	보통은 초기 생성자처럼 public ConstructorEx() {} 사용할 수 있음
	=> 하지만 많이 사용하지는 않음
	*/
	
	public ConstructorEx(int a) {
		//기본으로 값을 지정해서 전달하는 생성자
		//생성할 때부터 값을 지정해주고 추후 값을 변경할 수 있도록 해줌
		name = "이름을 입력해주세요.";
		//name은 String이기 때문에 문자열을 넣어야 함
		phone = "번호를 입력해주세요.";
		//phone은 String이기 때문에 문자열을 넣어야 함
		idNo = 1;
		//idNO는 int이기 때문에 숫자값을 넣어야 함
		money = 0;
		//money는 int이기 때문에 숫자값을 넣어야 함
	}
	
	public static void main(String[] args) {

	}
}
