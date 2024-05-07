package com.kh.example.practice1.model.vo;

public class Member {
	//필드
	public String 	memberId;
	public String 	memberPwd;
	public String 	memberName;
	public int 		age;
	public char 	gender;
	public String 	phone;
	public String 	email;
	
	//초기생성자 메서드
	/*
	Member()
	*/
	public Member() {
		
	}
	
	//출력 메서드
	/*
	public String memberId;
	printName():void
	*/
	public void changeName(String name) {
		this.memberName = name;
		System.out.println("변경된 이름 : "+name);
	}
	
	/*
	예시
	//값을 받아서 전달하는 메서드
	public String changeEmail(String 수정이메일) {
		this.email = 수정이메일;
		
		return email;
	}
	*/
	
	public void printName() {
		System.out.println("이름 : "+memberName);
	}
}
