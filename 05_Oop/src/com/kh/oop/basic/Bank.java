package com.kh.oop.basic;

public class Bank {
	//이름 계좌번호 잔액 비밀번호 마케팅수신동의
	public String 	name;
	public String 	accountNumber;
	public int 		balance ;
	public String 	password;
	public boolean 	agree;
	
	//생성자 메서드
	//1. 필수가 아닌 생성자 = 클래스 명과 같아야 함
	public Bank() {
		
	}
	
	//2. 필수인 생성자(이름, 계좌번호, 잔액, 비밀번호)
	public Bank(String inputName, String inputAccountnumber, 
			int inputBalance, String inputPassword) {
		this.name = inputName;
		this.accountNumber = inputAccountnumber;
		this.balance = inputBalance;
		this.password = inputPassword;
	}
	
	//출력 생성자
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("계좌번호 : "+accountNumber);
		System.out.println("잔액 : "+balance);
		System.out.println("비밀번호 : "+password);
		System.out.println("마케팅수신동의 : "+agree);
	}
	
	public static void main(String[] args) {
		//1.조씨 은행 통장, 수신동의 ok
		Bank customer1 = new Bank();
		customer1.name = "Jor";
		customer1.accountNumber = "111-222-123123";
		customer1.balance = 123;
		customer1.password = "0000";
		customer1.agree = true;
		
		customer1.info();
		System.out.println();

		//2. 던씨 은행 통장, 수신동의를 실수로 안함
		Bank customer2 = new Bank();
		customer2.name = "Dun";
		customer2.accountNumber = "111-333-123123";
		customer2.balance = 456;
		customer2.password = "1234";
		customer2.agree = false;//원래 boolean의 기본값은 false
		
		customer2.info();
		System.out.println();
		
		//3. 필수 생성자를 활용해서 마이클 씨의 은행통장
		//이름, 계좌번호, 잔액, 비밀번호를 입력하고
		//마케팅 수신동의를 true로 변경해서 출력하기
		Bank customer3 = new Bank("Michael", "111-123-123123", 789, "2580");
		customer3.agree = true;
		//위 코드가 없으면 마케팅 수신 동의가 false로 나옴
		
		customer3.info();
		System.out.println();
	}
}
