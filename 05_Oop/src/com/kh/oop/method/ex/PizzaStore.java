package com.kh.oop.method.ex;

public class PizzaStore {
	//필드
	private String pizzaName; //피자명
	private int pizzaPrice; //피자가격
	
	//setter 메서드
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	
	//getter 메서드
	public String getPizzaName() {
		return pizzaName;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	
	//기본 생성자 메서드
	public PizzaStore() {
		
	}
	
	//필수 생성자 메서드
	public PizzaStore(String pizzaName, int pizzaPrice) {
			this.pizzaName = pizzaName;
			this.pizzaPrice = pizzaPrice;
	}
	
	//void 메서드
	public void inforPizza() {
		System.out.println("피자이름 : "+pizzaName);
		System.out.println("피자가격 : "+pizzaPrice);
		System.out.println("---------------");
	}
	
	//main 메서드
	public static void main(String[] args) {
		//pizza1
		PizzaStore pizza1 = new PizzaStore();
		pizza1.setPizzaName("페페로니 피자");
		pizza1.setPizzaPrice(11000);
		pizza1.inforPizza();
		
		//pizza2 : 가격 적는 것을 잊음
		PizzaStore pizza2 = new PizzaStore();
		pizza2.setPizzaName("포테이토 피자");
		pizza2.inforPizza();
		
		//pizza3 : 필수 생성자로 피자 생성
		PizzaStore pizza3 = new PizzaStore("치즈 피자", 10000);
		pizza3.inforPizza();
	}
}
