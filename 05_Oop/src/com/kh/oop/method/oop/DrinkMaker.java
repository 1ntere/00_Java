package com.kh.oop.method.oop;

public class DrinkMaker {
	//필드
	private String 	drinkType;	//음료 종류
	private int 	quantity;	//음료 양
	private int 	temp;		//온도
	//메서드(Setter)
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	//메서드(Getter)
	public String getDrinkType() {
		return drinkType;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getTemp() {
		return temp;
	}
	//메서드(기본)
	public DrinkMaker() {
		
	}
	//메서드(필수)
	public DrinkMaker(String drinkType, int quantity,
			int temp) {
		this.drinkType = drinkType;
		this.quantity = quantity;
		this.temp = temp;
	}
	//메서드(void)
	public void makeDrink() {
		System.out.println("음료 정보 : "+drinkType);
		System.out.println("음료  양 : "+quantity+"ml");
		System.out.println("---------------");
		if (temp < 5) {
			System.out.print("차가운 ");
		} else if (temp >= 5 && temp <= 10) {
			System.out.print("미지근한 ");
		} else {
			System.out.print("뜨거운 ");
		}
		System.out.println("음료 제조 완료");
		System.out.println("===============");
	}
}
