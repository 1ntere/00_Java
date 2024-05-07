package com.kh.abstractEx;

//도형에서 사용한 메서드를 사용하겠다. extends 도형
public class 삼각형 extends 도형 {
//필드
	private double 밑변;
	private double 높이;
//생성자 (필수)
	/*
	★ 오류 발생
	<부모클래스>에 있는 필드를 <자식클래스>의 필수 생성자에 작성하지 않으면 오류가 생김
	=====
	★ 문제 해결 방안
	도형에서 String 색깔을 넣어줬다면 삼각형에서도 String 색깔과 super(색깔)을 넣어줘야 함
	*/
	public 삼각형(String 색깔, double 밑변, double 높이) {
		super(색깔);
		this.밑변 = 밑변;
		this.높이 = 높이;
	}
	
	@Override
	public double 도형넓이() {
		return 0.5 * 밑변 * 높이;
	}
	
	/*
	Math = 수학
	sqrt = 제곱근을 계산하는 메서드
		제곱근 : 어떤 수를 곱해서 얻은 결과가 원래의 수가 되도록 하는 수
	pow = 주어진 값을 거듭제곱하는 메서드
		거듭 제곱 : 똑같은 수나 식을 곱함
	 */
	@Override
	public double 도형둘레() {
		double 빗변 = Math.sqrt(Math.pow(밑변, 2)+Math.pow(높이, 2));
		return 밑변 + 높이 + 빗변;
	}
	/*
	★ 오류 발생
	도형넓이() 까지만 작성했을 때는 class 삼각형에 오류가 떴었다.
	하지만 도형둘레() 까지 작성하니까 오류가 없어짐
	-----
	★ 문제 해결 방안
	부모클래스에서 미완성이었던 메서드(도형넓이(), 도형둘레())를 자식클래스에서 모두 완성시키니까 오류가 사라짐
	*/
}
