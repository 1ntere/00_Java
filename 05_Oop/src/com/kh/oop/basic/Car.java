package com.kh.oop.basic;

public class Car {
	// 필드
	//-> 차량을 구매할 때 고려해야 할 옵션
	public String color; //차의 색상
	public int speed; //차의 속도
	public String door; //문의 갯수
	public String window; //창문 갯수
	public String sunRoof; //선루프
	public String insurance; //보험
	
	// 생성자 (필수 옵션)
	//-> 차량을 구매할 때 필수 옵션
	/*
	메소드를 담거나 초기화를 위해 사용
	생성자는 클래스 이름과 똑같아야함
	생성자 이름 = 클래스 이름 = 파일 명
	*/
	
	public Car() {
		
	}
	
	/*
	public Car(글자로 받을 차 색상, 글자로 받을 차 속도) {
			
	}
	=> 색상과 속도는 필수가 됨
	=> this를 통해 color와 inputColor, speed와 inputSpeed를 이어줌
	=> 필드에서 speed를 int로 지정해줬으니 inputSpeed는 int여야 함
	*/
	
	public Car(String inputColor, int inputSpeed) {
		this.color = inputColor;
		this.speed = inputSpeed;
	}
	
	// 메서드
	public void displayInfo() {
		System.out.println("차 정보 : ");
		System.out.println("Color : "+color);
		System.out.println("Speed : "+speed);
	}
	
	//메인 메서드
	public static void main(String[] args) {
		//Car가 있는 공간을 마련해주기
		Car myCar = new Car();
		myCar.color = "빨간색";
		System.out.println("나의 차 색상 : "+myCar.color);
		
		//orderCar : 공장에서 차를 만들어야 하고 색상이랑 스피드가 지정이 된 상황
		Car orderCar = new Car("black", 60);
		orderCar.displayInfo();
		
		//storeCar : 주문 색상 white, 스피드 100
		Car storeCar = new Car("white", 100);
		storeCar.displayInfo();
	}
}
