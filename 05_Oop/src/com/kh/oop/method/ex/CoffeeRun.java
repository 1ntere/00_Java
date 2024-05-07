package com.kh.oop.method.ex;

public class CoffeeRun {

	public static void main(String[] args) {
		//커피샾 객체 생성
		//기본 생성자
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffeeType("아메리카노");
		coffee1.setSugar(1);
		coffee1.setMilk(false);
		coffee1.makeCoffee();
		
		//필수 생성자
		CoffeeMaker coffee2 = new CoffeeMaker("디카페인아메리카노", 2,
				true);
		coffee2.makeCoffee();
	}
}
