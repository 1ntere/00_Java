package com.kh.oop.method.oop;

public class DrinkStore {
	//필드
	private DrinkMaker maker;
	private String location;
	private String name;
	private boolean takeout;
	//메서드(Setter)
	public void setMaker(DrinkMaker maker) {
		this.maker = maker;
	}
	public void setLoaction(String location) {
		this.location = location;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	//메서드(Getter)
	public DrinkMaker getMaker() {
		return maker;
	}
	public String getLocation() {
		return location;
	}
	public String getName() {
		return name;
	}
	public boolean isTakeout() {
		return takeout;
	}
	//메서드(기본)
	public DrinkStore() {
		
	}
	//메서드(필수)
	public DrinkStore(DrinkMaker maker, String location,
			String name, boolean takeout) {
		this.maker = maker;
		this.location = location;
		this.name = name;
		this.takeout = takeout;
	}
	//메서드(void)
	public void orderDrink() {
		System.out.println("=== 음료 주문서 ===");
		System.out.println(location+"의 "+name+"에서 주문한 정보");
		if (takeout) {
			System.out.println("테이크 아웃 주문");
		} else {
			System.out.println("매장 내 섭취");
		}
		maker.makeDrink();
	}
}
