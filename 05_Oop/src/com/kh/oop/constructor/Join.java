package com.kh.oop.constructor;

public class Join {
	//필드 : 회원번호 아이디 이름 연락처
	public int memberNo;//회원가입 순서
	public String memberId;//회원이 작성한 아이디
	public String memberName;
	public String phoneNumber;
	
	//1. 기본 생성자
	public Join() {
		
	}
	
	//2. 필수 생성자
	public Join(int memberNo, String memberId,
			String memberName, String phoneNumber) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
		this.phoneNumber = phoneNumber;
	}
	
	//3. 메서드 = 클래스 안에 존재하고, 특정 기능을 할 수 있도록 묶어놓은 코드 모음
	//void 메서드 = 결과를 전달하지 않음
	public void memberInfo() {
		System.out.println("멤버 번호 : "+memberNo);
		System.out.println("멤버 ID : "+memberId);
		System.out.println("멤버 이름 : "+memberName);
		System.out.println("멤버 폰번 : "+phoneNumber);
	}
	
	
	public static void main(String[] args) {
		System.out.println("=== 쇼핑 회원 정보 확인 ===");
		
		//필수로 입력해야하는 정보가 없음
		//Join 객체 생성
		Join member1 = new Join();
		member1.memberId = "직장인";
		member1.memberName = "동그라미";
		member1.phoneNumber = "010-1111-2222";
		member1.memberInfo();
		System.out.println("---------------");
		
		//필수로 입력해야하는 정보가 없음
		Join member2 = new Join();
		member2.memberNo = 2;
		member2.memberId = "학생";
		member2.memberName = "홍길동";
		member2.memberInfo();
		System.out.println("---------------");
		
		//회원가입할 때 필수로 작성해야하는 정보가 생김
		//회원번호 아이디 이름 핸드폰 번호
		Join member3 = new Join(3, "abc",
				"홍길동", "010-1234-5678");
		member3.memberInfo();
		System.out.println("---------------");
		
		/*
		member4 와 member5를 회원가입 시키기
		member4는 기본 생성자를 가지고 회원가입 시키기		
		member5는 필수 생성자를 가지고 회원가입 시키기
		*/
		Join member4 = new Join();
		member4.memberNo = 4;
		member4.memberId = "블랙아담";
		member4.memberInfo();
		System.out.println("---------------");
		
		Join member5 = new Join(5, "슈퍼맨",
				"딘 케인", "010-1938-1932");
		member5.memberInfo();
		System.out.println("---------------");
		
		
		
	}
}
