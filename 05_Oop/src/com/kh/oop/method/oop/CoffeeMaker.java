package com.kh.oop.method.oop;

//커피 만들기
public class CoffeeMaker {
	//필드
	private String coffeeType; //커피 종류
	private int sugar; //설탕 양
	private boolean milk; //우유 유무
	
	//메서드(Setter)
	public void setCoffeeType(String coffeeType) {
		this.coffeeType = coffeeType;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//메서드(Getter)
	public String getCoffeeType() {
		return coffeeType;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		//getter : getMilk가 아니라 isMilk로 바뀜
		return milk;
	}
	//메서드(기본)
	public CoffeeMaker() {
		
	}
	//메서드(필수)
	public CoffeeMaker(String coffeeType, int sugar,
			boolean milk) {
		this.coffeeType = coffeeType;
		this.sugar = sugar;
		this.milk = milk;
	}
	//메서드(void)
	public void makeCoffee() {
		System.out.println("커피를 제조합니다.");
		System.out.println("종류 : "+coffeeType);
		System.out.println("설탕 : "+sugar+" g");
		//만약에 우유가 추가 됐다면
		if (milk) {
			System.out.println("우유 추가");
		} else {
			System.out.println("우유 미추가");
		}
		System.out.println("커피가 준비되었습니다.");
		System.out.println("---------------");
	}
	/*
	//메서드(main) - 최종으로 실행하거나 출력할 코드 작성
	public static void main(String[] args) {
		//기본 생성자
		CoffeeShop coffee1 = new CoffeeShop();
		coffee1.setCoffeeType("아메리카노");
		coffee1.setSugar(1);
		coffee1.setMilk(false);
		coffee1.makeCoffee();
		
		//필수 생성자
		CoffeeShop coffee2 = new CoffeeShop("디카페인아메리카노", 2,
			true);
		coffee2.makeCoffee();
	}
	*/
}
