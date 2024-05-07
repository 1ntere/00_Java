package com.kh.oop.method.ex;

public class HamburgerStore {
	//필드 (이름, 가격)
	private String name;
	private int price;
	//메서드 (Setter)
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//메서드 (Getter)
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	//메서드 (기본)
	public HamburgerStore() {
		
	}
	//메서드 (필수)
	public HamburgerStore(String name, int price) {
		this.name = name;
		this.price = price;
	}
	//메서드 (void)
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("---------------");
	}
	//메서드 (메인)
	public static void main(String[] args) {
		//1. 기본생성자 불고기버거 2000
		HamburgerStore hs1 = new HamburgerStore();
		hs1.setName("불고기버거");
		hs1.setPrice(2000);
		hs1.info();
		//2. 필수생성자 치즈버거 3000
		HamburgerStore hs2 = new HamburgerStore("치즈버거", 3000);
		hs2.info();
	}
}

