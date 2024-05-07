package com.kh.Inheritance.OverrideEx;

public class 고양이 extends 동물 {
	//필수 생성자
	public 고양이(String 이름) {
		super(이름);
	}
	
	//동물의 소리를 가지고 와서 고양이 소리로 변경
	//void 생성자
	@Override
	public void 소리() {
		System.out.println(이름+" 이(가) 야옹 웁니다.");
	}
}
