package com.kh.example.practice2.model.vo;

public class Product {
	//필드
	private String pName;
	private int price;
	private String brand;
	//setter
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//getter
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	//기본 생성자
	public Product() {
		
	}
	//void 메서드
	public void information() {
		System.out.println("제품 이름 : "+pName);
		System.out.println("제품 가격 : "+price);
		System.out.println("제품 상표 : "+brand);
	}
}
