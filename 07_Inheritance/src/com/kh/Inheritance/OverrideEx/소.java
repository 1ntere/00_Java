package com.kh.Inheritance.OverrideEx;

public class 소 extends 동물 {
	//필수 생성자
	public 소(String 이름) {
		super(이름);
	}
	//void 생성자
	@Override
	public void 소리() {
		System.out.println(이름+" 이(가) 음메 웁니다.");
	}
}
