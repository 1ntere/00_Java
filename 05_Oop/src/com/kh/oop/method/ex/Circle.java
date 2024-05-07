package com.kh.oop.method.ex;

public class Circle {
	//필드
	
	private double pi = 3.14;
	private int radius = 1;//radius = 반지름
	
	//Setter Getter
	public void setPi(double pi) {
		this.pi = pi;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getPi() {
		return pi;
	}
	public int getRadius() {
		return radius;
	}
	
	//기본 생성자
	public Circle() {
		
	}
	
	//메서드
	//1. incrementRadius()	//반지름을 1씩 증가하기
	//2. getAreaOfCircle()	//원의 넓이 구하기
	//3. getSizeOfCircle()	//원의 둘레 구하기
	
	public void incrementRadius() {
		radius++;
	}
	public void getAreaOfCircle() {
		//제곱은 소수자리가 나오기 때문에 double
		double area = pi*radius*radius;
		System.out.println("원의 넓이 : "+area);
		/*sysout을 쓰지 않으면 밑에서 원.getAreaOfCircle();를 입력해도
		원의 넓이가 출력이 안됨*/
	}
	public void getSizeOfCircle() {
		//pi가 3.14이므로 소수자리가 나오기 때문에 double
		double size = 2*pi*radius;
		System.out.println("원의 둘레 : "+size);
		/*sysout을 쓰지 않으면 밑에서 원.getSizeOfCircle();를 입력해도
		원의 둘레가 출력이 안됨*/
	}
	
	//메인 메서드 ctrl + space
	public static void main(String[] args) {
		//원 객체 생성
		Circle 원 = new Circle();
		
		//1씩 증가하기 전에 원의 둘레와 넓이 출력하기
		System.out.println("원의 초기 둘레와 넓이");
		원.getSizeOfCircle();
		원.getAreaOfCircle();
		System.out.println("---------------");
		
		//원의 반지름이 1씩 증가한다면 ?!
		원.incrementRadius(); //1씩 원의 크기를 증가시킨다
		
		//증가된 반지름의 원의 둘레와 넓이 출력
		System.out.println("반지름 1 증가 후 원의 둘레와 넓이");
		원.getSizeOfCircle();
		원.getAreaOfCircle();
		System.out.println("---------------");
	}
}
