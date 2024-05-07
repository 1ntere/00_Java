package com.kh.oop.method.oop;
//커피 가게 클래스
//커피 만드는 파일을 가져와서 각각의 가게에 커피 만드는 방법을 다르게 작성
public class CoffeeStore {
	//필드
	private CoffeeMaker maker;//CoffeeMaker 클래스를 가져옴
	private String storeName;//가게 이름
	private String location;//가게 위치
	public void setMaker(CoffeeMaker maker) {
		this.maker = maker;
	}
	//메서드(Setter)
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	//메서드(Getter)
	public CoffeeMaker getMaker() {
		return maker;
	}
	public String getStoreName() {
		return storeName;
	}
	public String getLocation() {
		return location;
	}
	//메서드(기본)
	public CoffeeStore() {
		
	}
	//메서드(필수)
	public CoffeeStore(CoffeeMaker maker, String storeName,
			String location) {
		this.maker = maker;
		this.storeName = storeName;
		this.location = location;
	}
	//메서드(void) - 커피 주문 메서드
	public void orderCoffee() {
		System.out.println("지역 : "+location);
		System.out.println(storeName + "에 주문한 커피 정보");
		maker.makeCoffee();
	}
}
