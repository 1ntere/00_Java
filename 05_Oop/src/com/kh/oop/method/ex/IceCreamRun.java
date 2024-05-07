package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {
		System.out.println("=== 아이스크림 만들기 ===");
		
		IceCream icecream1 = new IceCream();
		icecream1.setName("월x콘");
		icecream1.setSugar(13);
		icecream1.setMilk(true);
		icecream1.makeIceCream();
		
		IceCream icecream2 = new IceCream("누x바", 11, true);
		icecream2.makeIceCream();
	}
}