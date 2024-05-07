package com.kh.oop.method.ex;

public class IceCream {
	//필드
	private String name;
	private int sugar;
	private boolean milk;
	//메서드(Setter)
	public void setName(String name) {
		this.name = name;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//메서드(Getter)
	public String getName() {
		return name;
	}
	public int getSugar() {
		return sugar;
	}
	public boolean isMilk() {
		return milk;
	}
	//메서드(기본)
	public IceCream() {
		
	}
	//메서드(필수)
	public IceCream(String name, int sugar, boolean milk) {
		this.name = name;
		this.sugar = sugar;
		this.milk = milk;
	}
	//메서드(void)
	public void makeIceCream() {
		System.out.println("이름 : "+name);
		System.out.println("설탕 : "+sugar+" g");
		if (milk) {
			System.out.println("우유 추가");
		} else {
			System.out.println("우유 미추가");
		}
		System.out.println("---------------");
	}
	/*
	//메서드(main)
	public static void main(String[] args) {
		System.out.println("=== 아이스크림 만들기 ===");
		
		IceCream icecream1 = new IceCream();
		icecream1.setName("바닐라");
		icecream1.setSugar(10);
		icecream1.setMilk(true);
		icecream1.makeIceCream();
		
		IceCream icecream2 = new IceCream("초코", 5, true);
		icecream2.makeIceCream();
	}
	*/
}
