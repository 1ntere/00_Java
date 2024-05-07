package com.kh.interfaceEx;

/*
interface : 클래스 간의 접점을 만드는 용도

//필드
필드에 작성하는 모든 변수가
	public static final로 작성이 됨
	굳이 앞에 public static final을 붙이지 않아도
	알아서 붙어서 만들어짐

//메서드
메서드에 작성하는 모든 메서드 앞에
	public abstract가 알아서 붙어서 만들어짐
	
Question 	: 그렇다면 인터페이스는 왜 public static final과 public abstract가 붙을까?
Answer 		: 인터페이스는 자바에서 다른 클래스에서 구현할 메서드의 명세를 정의하는 역할을 함
			  인터페이스에 작성되는 필드와 메서드는 다른 클래스에서 구현될 것을 기대하는 것
			  '내가 주는 필드 값은 강제이고 변경할 생각하지마, 메서드는 알아서 구현해줘' 의 느낌 
*/
public interface 기계 {
//지금까진 public class 기계 {}를 사용했음
//아이콘도 바뀜
//public interface 기계 {}

//필드
	//(public static final)이 자동으로 생겨져 있음
	int 볼트 = 220;
		//public static final int 볼트 = 220; 와 동일
	
//메서드
//인터페이스는 추상메서드만 작성이 가능
	//(public abstract)이 자동으로 생겨져 있음
	public abstract void 전원켜기();
		//void 전원켜기(); 와 같음
	void 전원끄기();
		//public abstract void 전원끄기(); 와 동일
}
