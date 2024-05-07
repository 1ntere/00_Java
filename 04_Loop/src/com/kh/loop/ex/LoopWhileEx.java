package com.kh.loop.ex;

import java.util.Scanner;

/*
여태껏 public static void를 통해 함수처럼 사용을 해왔음

★public : 어디서든 접근 가능한
protected : 같은 폴더 안에서만 접근 가능
default : 같은 폴더 안에서 접근 가능
		  protected보다 제한되게 접근 가능
☆private : 한 class 안에서만 접근 가능
		   작성한 공간 안에서만 접근 가능
---
void : 반환하는 것 없이 바로 출력이 될 때 사용
*/


public class LoopWhileEx {
	/*
	while 문을 사용해서 4번을 누르면 프로그램을 종료하는 코드를 작성하기
	*/	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
	
		while (true) {	
			System.out.println("1. 게임하기 2. 수영하기 3. 잠자기 4. 프로그램 종료");
			System.out.print("원하는 프로그램 번호를 입력하세요 : ");
				
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("게임하기");
				break;
			case 2:
				System.out.println("수영하기");
				break;
			case 3:
				System.out.println("잠자기");
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("번호를 잘못 입력했습니다.");
			}
		}		
	}
	
	/*
	★ 오류 발생 1
	default:
		System.out.println("번호를 잘못 입력했습니다.");
		System.out.print("원하는 프로그램 번호를 입력하세요 : ");
		
	위의 코드 대로 하다보면 잘못된 번호를 입력했을 때
	"잘못된 번호입니다.
	원하는 프로그램 번호를 입력하세요 : 
	1. 게임하기 2. 수영하기 3. 잠자기 4. 프로그램 종료
	원하는 프로그램 번호를 입력하세요 : "
	가 계속 반복됨.
	
	=> 맨 밑에 2줄만 반복되었으면 해서
	System.out.println("프로그램 작성");
	System.out.print("원하는 프로그램 번호를 입력하세요 : ");
	코드 2줄을 while 문 위에다가 배치했는데도 계속 반복됨
	=====
	★ 해결 방안 1
	default:
		System.out.println("번호를 잘못 입력했습니다.");
	
	=> 중복되는 코드 한 줄을 없앰
	=====
	★ 해결 방안 1-1
	중복되는 코드를 없애지 말고
	int menu = sc.nextInt();
	바로 위에
	while (true) { 를 입력하면 됨
	*/
	
	/*
	★ 오류 발생 2
	while (true) { 를 스위치 바로 위에 놓고 잘못된 입력(5)를 입력하면
	
	번호를 잘못 입력했습니다.
	번호를 잘못 입력했습니다.
	...
	번호를 잘못 입력했습니다.
	
	무한으로 반복됨
	
	★ 오류 발생 2-1
	제대로 된 입력(1,2,3)을 눌러도 무한으로 반복됨 
	
	★ 오류 발생 2-2
	프로그램 종료(4)를 누르면 바로 종료됨
	=====
	★ 해결 방안 2
	while (true) { 를 int menu = sc.nextInt(); 위에 놓으면 됨	
	 */
	
	public static void kh카페() {
		Scanner sc = new Scanner(System.in);
		System.out.println("kh카페에 오신 걸 환영합니다. ^^* \n"
				+ "원하는 메뉴를 입력해주세요. \n"
				+ "1 아메리카노 2 카페라떼 3 녹차 4 흑당버블티 5 주문취소");
		
		while (true) {
			String menu = sc.next();
		
			switch (menu) {
			case "1": case "아메리카노":
				System.out.println("아메리카노 주문 추가되었습니다.");
				break;
			case "2": case "카페라떼":
				System.out.println("카페라떼 주문 추가되었습니다.");
				break;
			case "3": case "녹차":
				System.out.println("녹차 주문 추가되었습니다.");
				break;
			case "4": case "흑당버블티":
				System.out.println("흑당버블티 주문 추가되었습니다.");
				break;
			case "5": case "주문취소":
				System.out.println("주문이 취소되었습니다. 다음에 방문해주세요.");
				return;
			default:
				System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요.");
			}				
		}
	}
	
	
	public static void getMoney() {
		//커피는 총 10잔 있음, 가진 돈은 300원
		int coffee = 10;
		int money =300;
		
		//만약에 돈이 0보다 많다면 커피를 구매하고
		//커피가 다 소진되면 판매를 중지한다.
		
		while (money>0) {
			System.out.println("돈을 받았으니 커피를 제공");
			
			//커피가 10잔인데 1잔을 제공 했다면 -1
			coffee--;
			System.out.println("남은 커피의 양은 "+coffee+" 잔 입니다.");
			
			//커피가 모두 소진되었다면 판매를 중지하자
			if (coffee == 0) {
				System.out.println("커피가 다 소진되었습니다. 판매를 중지합니다.");
				return;
			}
		}
	}
	
	//1부터 5까지의 숫자를 출력
	public static void allNumber() {
		int num = 1;
		while (num <= 5) {
			System.out.println(num);
			num++; // num = num+1;
		}
	}
	
	
	//10번 찍어서 안 넘어가는 나무 없습니다.
	//나무를 10번찍으면 나무 넘기기
	public static void tree() {
		int hit = 0;
		while (hit < 10) {
			hit++;
			//나무를 몇 번 찍었는지 확인
			System.out.println("나무를 "+hit+"번 찍었습니다.");
			
			if (hit == 10) {
				//만약에 나무를 찍은 횟수가 10번이 되면 나무가 넘어갑니다 표현
				System.out.println("나무가 넘어갑니다~~!!!!! 성공");
			}
		}
	}
	
	/*
	사용자로부터 1개의 값을 입력받아 1부터 그 숫자까지의 모든 숫자를 출력
	단 입력한 수가 1보다 크거나 같아야 함
	만약에 1 미만의 숫자가 입력되었다면 1 이상의 숫자를 입력해주세요 출력하기
	*/
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if (num < 1) { 
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			System.out.println("1부터 "+num+" 까지의 숫자들");
			int abc = 1;
						
			while (abc <= num) {
				System.out.println(abc);
				abc++; //abc = abc+1;
			}
		}
	}
	
	//커피가 100원이고, 돈이 없으면 커피를 구매하지 못하는 경우
	public static void getCoffee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카페에 오신걸 환영합니다.");
		System.out.print("현재 가진 돈을 입력해주세요 : ");
		
		//커피가격 coffeePrice
		int coffeePrice = 100;
		
		//현재 가지고 있는 금액 입력
		int money = sc.nextInt();
		
		//만약에 돈이 부족하다면 메시지를 띄우고 다시 현재 가지고 있는 금액 입력 받기
		while (money < coffeePrice) {
			System.out.print("돈이 부족합니다. 커피를 구매하기 위해 더 많은 돈을 넣어주세요 \n"
					+ "현재 가진 돈을 입력해주세요 : ");
			money = sc.nextInt();		
		} 
		int change = money-coffeePrice;
		System.out.println("커피를 구매했습니다. \n"
				+ "거스름돈은 "+change+" 입니다.");		
	}
	
	/*
	★ 오류 발생 1
	while (money < coffeePrice) {
			System.out.println("돈이 부족합니다. 커피를 구매하기 위해 더 많은 돈을 넣어주세요 \n"
					+ "현재 가진 돈을 입력해주세요 : ");
			int money = sc.nextInt();
	를 하니 오류가 뜸
	=====
	★ 해결 방안 1
	int money = sc.nextInt(); 를
	money = sc.nextInt(); 로 바꿔줌
	*/
	
	//수중에 10000원 이상의 돈이 없는 경우 탕수육을 시키지 못하는 예제
	public static void ilovePork() {
		Scanner sc = new Scanner(System.in);
		
		int tangsuyuk = 10000;
		System.out.print("현재 보유 금액을 입력해주세요 : ");
		int myMoney = sc.nextInt();
		
		while (myMoney<tangsuyuk) {
			System.out.print("잔액이 부족합니다. 다시 입금해주세요.\n"
					+ "다시 보유하고 있는 금액을 입력 : ");
			myMoney = sc.nextInt();						
		}
		int change = myMoney-tangsuyuk;
		System.out.println("탕수육 주문이 완료되었습니다.\n현재 잔액은 "+change+" 원 입니다.");		
	}
	
	public static void main(String[] args) {
		//method1();
		//kh카페();
		//getMoney();
		//allNumber();
		//tree();
		//method2();
		//getCoffee();
		ilovePork();

	}

}
