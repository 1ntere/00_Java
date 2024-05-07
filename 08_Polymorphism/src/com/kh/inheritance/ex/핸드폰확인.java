package com.kh.inheritance.ex;

public class 핸드폰확인 {

	public static void main(String[] args) {
		//스마트폰 중에서 아이폰을 확인하자
		
		스마트폰 p1 = new 아이폰();
		//원래는 스마트폰 p1 = new 아이폰(); 이라고 썼지만
		//부모클래스 대신에 자식클래스 호출 가능
		
		p1.set화면("레티나 디스플레이");
		System.out.println("p1의 화면 : " + p1.get화면());
		
		p1.set통신사("Kㅇ");
		System.out.println("p1의 통신사 : " + p1.get통신사());
		
		p1.set성능("최신");
		System.out.println("p1의 성능 : " + p1.get성능());
		
		//p1.setIOS("아이폰버전");
		/*
		★ 오류 발생
		스마트폰 p1 = new 아이폰();
		스마트폰 그릇에 아이폰을 가지고 오면
		부모클래스의 기능은 가지고 올 수 있지만 자식클래스의 기능은 가져올 수 없음
		=====
		★ 문제 해결 방법
		아이폰 p1 = new 아이폰();
		(부모클래스의 기능을 상속받은) 자식클래스의 그릇에 자식클래스의 기능을 호출하면 모두 사용 가능
		*/
		System.out.println("====================");
		
		아이폰 p2 = new 아이폰();
		
		p2.set화면("레티나 디스플레이");
		p2.set통신사("Kㅇ");
		p2.set성능("최신");
		p2.setIOS(17);
		System.out.println(p2.toString());
		
		System.out.println("====================");
		
		갤럭시 g1 = new 갤럭시();
		
		g1.set화면("아몰레드 디스플레이");
		g1.set통신사("SㅇT");
		g1.set성능("최신");
		
		//모조건 갤럭시에 있는 g1.안드로이드를 가져와서 쓰고 싶으면
		//다운캐스팅 : 강제로 형변환을 진행해준 후 불러와야 함
		갤럭시 g2 = (갤럭시) g1;
		g2.set안드로이드(4);//g1을 g2에다가 담아서 사용할 수 있도록 해줌
		
		System.out.println(g2.toString());
	}
}
