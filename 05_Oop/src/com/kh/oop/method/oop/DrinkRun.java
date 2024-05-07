package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		//음료 제조 객체 생성
		DrinkMaker dm1 = new DrinkMaker("허브티", 300, 5);
		//음료 가게 객체 생성
		DrinkStore ds1 = new DrinkStore(dm1, "서울 마포구",
				"메x커피", false);
		ds1.orderDrink();
		
		DrinkMaker dm2 = new DrinkMaker("아메리카노", 500, 1);
		DrinkStore ds2 = new DrinkStore(dm2, "서울 서초구",
				"바x프레x", true);
		ds2.orderDrink();
	}
}
