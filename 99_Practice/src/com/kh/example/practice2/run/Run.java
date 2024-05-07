package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {
	//메인 메서드
	public static void main(String[] args) {
		//product 객체 생성
		Product product = new Product();
		
		//정보 저장 : 사과, 사과 가격, 사과 브랜드
		//product.pName = "사과";
		product.setpName("사과");
		product.setPrice(2000);
		product.setBrand("유기농마을");
		product.information();
	}
}
