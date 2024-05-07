package com.kh.interfaceEx;

public class 중학생계산기 implements 계산기, 기계 {
	//기계 인터페이스
	@Override
	public void 전원켜기() {
		System.out.println("중학생용 계산기를 켭니다.");
	}
	@Override
	public void 전원끄기() {
		System.out.println("중학생용 계산기를 끕니다.");
	}
	//계산기 인터페이스
	@Override
	public int 합 (int a, int b) {
		return a + b;
	}
	@Override
	public int 차 (int a, int b) {
		return a - b;
	}
	@Override
	public int 곱 (int a, int b) {
		return a * b;
	}
	@Override
	public double 몫 (int a, int b) {
		return a / b;
	}
	@Override
	public int 나머지 (int a, int b) {
		return a % b;
	}
}
