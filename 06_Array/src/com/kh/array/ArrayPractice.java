package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public static void practice1() {
		int numbers[] = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
			System.out.print(numbers[i]+" ");
		}
	}
	
	public static void practice2() {
		int numbers[] = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers.length-i;
			System.out.print(numbers[i]+" ");
		}
	}
	
	public static void practice3() {
		//양의 정수를 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt();
		
		//입력 받은 정수 크기의 배열 생성
		int numbers[] = new int[size];
		
		//numbers.length=size
		for (int i = 0; i < size; i++) {
			numbers[i] = i+1;
			System.out.print(numbers[i]+" ");
		}
	}
	
	public static void practice4() {
						//   0     1     2      3      4
		String fruits[] = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(fruits[1]);
	}
	
	public static void practice5() {
		
	}
	
	public static void practice6() {
		//요일 생성하기
				//length 7
				//index	  0	    1	 2	  3	    4	 5	  6
		String days[] = {"월", "화", "수", "목", "금", "토", "일"};
		
		//0부터 6까지의 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int dayNum = sc.nextInt();
		
		//입력한 숫자가 0 ~ 6 사이에 있는지 확인 후 사이에 있다면 요일 출력 
		if (dayNum>=0 && dayNum<=6) {
			System.out.println(days[dayNum]+"요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public static void practice7() {
		
	}
	
	public static void practice8() {
		
	}
	
	public static void practice9() {
		//길이가 7인 배열을 생성
			// index [0 1 2 3 4 5 6]
			// length = 7
		int num[] = new int[7];
		
		//랜덤으로 숫자 출력하기
		/*
		1. Random 객체 사용
			조금 더 넓은 범위로 랜덤을 사용
		2. Math객체에서 Random() 메서드 사용 
			위 Random 객체보다 작은 범위에서 사용
		*/
				//num의 최종 길이를 알기 위해서 num.length 사용
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random()*45 + 1);
			//0 ~ 44 까지 나오므로 뒤에 + 1을 붙여줌
			//0 ~ 44 => 1 ~ 45
			System.out.println("num["+i+"] = "+num[i]);
		}
	}
	
	public static void practice10() {
		
	}
	
	public static void method1() {
		//정수 0 1 2 10 20 30 출력하기
		int num[] = new int[6];
		num[0] = 0;
		num[1] = 1;
		num[2] = 2;
		num[3] = 10;
		num[4] = 20;
		num[5] = 30;
		System.out.println(num[2]);
		
		//처음부터 문자열의 각 자리에 월 화 수 목 금 토 일
		//각 자리에 어떤 요일이 들어가 있는지 출력하기
		String str[] = {"월", "화", "수", "목",
				"금", "토", "일"};
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]+" ");
		}
		//실수 index 2까지 만들어주고 출력, 실수 자유
		double dbl[] = new double[3];
		dbl[0] = 10.1;
		dbl[1] = 11.2;
		dbl[2] = 13.2;
		
		for (int i = 0; i <dbl.length; i++) {
			System.out.println(dbl[i]+" ");
		}
		
		//문자는 'A', 'B', 'C' 넣어준 다음 각 자리 출력해보기
		char chr[] = {'A', 'B', 'C'};
		for (int i = 0; i <chr.length; i++) {
			System.out.println(chr[i]+" ");
		}
	}
	
	public static void practice17() {
		//입력한 값이 배열에 있는지 검색
		//있으면 치킨 배달 가능, 없으면 없는 메뉴입니다. 출력
		
		String[] chickenMenu = {"양념치킨","후라이드치킨","간장치킨"};
		
		//사용자로부터 치킨 이름 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String inputChic = sc.next();
		
		//배열에 사용자가 입력한 치킨이 있는지 검색
		boolean found = false;
		
		//for-each문을 사용해서 치킨이 있는지 확인하는 작업
		//만약에 치킨이 존재한다면 found = true; break;
		for (String 치킨 : chickenMenu) {
			if(치킨.equals(inputChic)) {
				found = true;
				break;
			}
		}
		
		//만약에 치킨이 존재한다면 배달 가능 출력
		//존재하지 않는다면 ㅇㅇ 치킨은 없는 메뉴입니다. 출력
		if (found) {
			System.out.println(inputChic+" 은(는) 배달 가능 합니다.");
		} else {
			System.out.println(inputChic+" 은(는) 없는 메뉴 입니다.");
		}
	}
	
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice6();
		//practice9();
		//method1();
		//practice17();
	}
}
