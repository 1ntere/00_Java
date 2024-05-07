package com.kh.operatorPre;

import java.util.Scanner;

// 패키지 : 내가 만든 클래스가 들어있는 폴더 위치

// 클래스 : 실행하고자 하는 코드를 작성하는 공간
public class OperatorPre {
	
	// 기본 출력 메서드
	// 최종으로 출력하는 메서드가 아니지만
	// 상황에 따라 최종 메서드에서 호출해 사용할 수 있는 메서드 중 하나
	// static : 메모리에서 고정
	public static void practice1() {//모든 사람이 사탕을 골고루 나눠갖기
		// 스캐너를 이용해서 키보드로 입력받은 내용을 컴퓨터에 출력
		// System.in 키보드로 입력 받을 수 있게 해주는 출력 시스템
		// Scanner : 키보드로 입력받은 내용을 컴퓨터로 출력
		// 기본으로 갖춰져 있기는 하지만 라이브러리에서 가져와야 하기 때문에
		// import를 이용해서 가지고 옴
		// JRE System Library>java.base>java.util>Scanner.class에 위치
		
		Scanner sc = new Scanner(System.in);
		// 스캐너를 불러온 다음 바로 sc 로 스캐너 기능을 불러와도 되긴 하지만
		// System.out.print 를 이용해서 어떤 행동을 진행하고 있는지
		// 확인하는 작업을 진행할 것
		
		//인원 수 입력받기
		System.out.print("인원 수를 입력하세요 : ");
		int people = sc.nextInt();
		
		//사탕 개수 입력받기
		System.out.print("사탕 개수를 입력하세요 : ");
		int candies = sc.nextInt();
		
		//1인당 동일하게 나눠가진 사탕 개수 구하기
		int getCandies = candies/people;
		
		//나눠주고 남은 사탕 개수 계산
		int remain = candies % people;
		
		//결과 출력
		System.out.println("참여 인원 : "+people);
		System.out.println("사탕 총 개수 : "+candies);
		System.out.println("동일하게 나눠가진 사탕 개수 : "+getCandies);
		System.out.println("남은 사탕 개수 : "+remain);
	}
	
	public static void practice2() {//키보드로 정보 입력 받기 + 남,여 확인
		//Scanner 활용해서 키보드 입력받는 창 만들어주기
		Scanner sc = new Scanner(System.in);
		
		//이름 입력받기
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		//학년 입력받기
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		//반 입력받기
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		
		//번호 입력받기
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		//성별 입력받기
		System.out.print("성별(M/F) : ");
		//String gender = sc.next();
		//String -> char
		
		char gender = sc.next().charAt(0);
		// Scanner로 char 값을 입력받고자 할 경우에는
		// charAt을 사용해서 문자열 위치를 읽어오는 작업을 진행해야 함
		// System으로 예를 들면
		// System - out - print()
		// Scanner - next - charAt(숫자만 적음)
		// 					내가 보고자 하는 문자의 위치
		// 예시) T A B L E = 5글자
		// 만약에 맨 앞 글자 T만 보고 싶다면
		// charAt(0) : T //맨 앞글자
		// charAt(1) : A //두번째 글자
		// charAt(2) : B //세번째 글자
		// charAt(3) : L //네번째 글자
		// charAt(4) : E //다섯번째 글자
		// TABLE은 총 5 글자이기 때문에
		// charAt에서는 0 ~ 4까지만 작성할 수 있음
		
		
		//성적 입력받기
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble(); // 전체 자리 입력 받음
		
		//출력하기
		System.out.println("이름 : "+name);
		System.out.println("학년 : "+grade);
		System.out.println(" 반 : "+classNum);
		System.out.println("번호 : "+num);
		System.out.println("성별 : "+gender);
		
		//System.out.println("성적 : "+score);
		System.out.printf("성적 : %.2f", score);
		/*
		 * printf()
		1. System.out.print()
			=> 줄 바꿈 없이 가로로 출력
		2. System.out.println()
			=> 다 출력한 다음에 다음 줄에서 작성하기(Enter)
		3. System.out.printf()
			=> 서식이 지정된 문자열을 출력할 때 사용
		%d : 정수
		%f : 소수점 수
		%s : 문자열 출력
		%c : 문자 하나 출력
		%b : true인지 false인지 출력
		%x : 16진수 정수
		%o : 8진수 정수
		* */
		
		//소수점 2번째 자리까지 출력하길 원함 : %.2f
		//printf + ,
		//printf로 %f 를 출력할 때는 소수점 자리를 지정해줘도 되고
		// 지정해주지 않아도 된다.
		// 다만 만약에 소수점 자리 위치를 지정해서 출력하길 원한다면
		// %.출력을 원하는 소수점위치 자리 값f
		// 예를 들어 소수점 4번째 자리까지 출력하길 원함 : %.4f
		// 예를 들어 소수점 5번째 자리까지 출력하길 원함 : %.5f
		
		//성별에 따라 출력 문자열 설정
		//삼항 연산자 출력 문자열 설정
		
	}
	
	public static void practice3() {/* 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고,
									세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3)을 구하세요.
									*/
		Scanner sc = new Scanner(System.in);
		
		//국어 점수 입력
		System.out.print("국어 점수를 입력하세요 : ");
		int korean = sc.nextInt();
		
		//영어 점수 입력
		System.out.print("영어 점수를 입력하세요 : ");
		int english = sc.nextInt();
		
		//수학 점수 입력
		System.out.print("수학 점수를 입력하세요 : ");
		int math = sc.nextInt();
		
		//입력받은 점수로 합계 계산
		// 점수 총 합 = 국어 점수 + 영어 점수 + 수학 점수
		int total = korean+english+math;
		
		//평균 점수 계산
		// 평균 = 점수 총 함 / 과목 수(3)
		// 점수가 무조건 소수점 이외 정수만 나온다는 보장이 없기 때문에
		// total의 자료형을 int형(정수)에서 double형(실수)으로 변환시켜주기
		double average = (double) total/3.0;
		
		//출력하기
		System.out.println("국어점수 : "+korean);
		System.out.println("영어점수 : "+english);
		System.out.println("수학점수 : "+math);
		System.out.println("국어+영어+수학 : "+total);
		System.out.println("국어 영어 수학 평균점수 : "+average);
		
	}
	
	public static void method4() {/* 2개의 수를 키보드로 입력 받아
									입력 받은 수가 모두 같으면 true 아니면 false 출력 */
		Scanner sc = new Scanner(System.in);
		
		//첫 번째 수 입력받기
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		//두 번째 수 입력받기
		System.out.print("두 번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		// == : 양쪽에 있는 값이 같으면 true
		// ex) 5 == 5 : 
		// ex) 3 == 5 : false
		// != : 양쪽에 있는 값이 다르면 true
		// ex) 5 != 5 : false
		// ex) 3 != 5 : true
		// true와 false를 표형할 때 그 값이 true false로 표현받기 위해서는
		// boolean을 사용해서 표현함
		//참, 거짓을 담는 변수 result 설정 (자료형 : boolean)
		
		//결과를 담는 변수 설정하기
		boolean result = num1 == num2;
		
		//출력하기
		System.out.println("num1 과 num2의 결과 : "+result);
	}
		
	public static void practice4() {/* 실습문제 4번 응용 : 2개의 수를 키보드로 입력받아 입력 받은 수가 모두 다르면 true, 모두 같으면 false 출력 */
		Scanner sc = new Scanner(System.in);
		
		//첫 번째 숫자 입력받기
		System.out.print("첫 번째 수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		//두 번째 숫자 입력받기
		System.out.print("두 번째 수를 입력하세요 : ");
		int num4 = sc.nextInt();
		
		//결과를 담는 변수 설정하기
		boolean result1 = num3 != num4;
		
		//결과 출력하기
		System.out.println("첫 번째 수와 두 번째 수의 결과 : "+result1);
	}
 
	public static void practice5() {/* 3개의 수를 키보드로 입력받아 입력 받은 수가 모두 같으면 true, 아니면 false 출력하기 */
		Scanner sc = new Scanner(System.in);
		
		//입력1 입력받기
		System.out.print("입력1 : ");
		int inPut1 = sc.nextInt();
		
		//입력2 입력받기
		System.out.print("입력2 : ");
		int inPut2 = sc.nextInt();
		
		//입력3 입력받기
		System.out.print("입력3 : ");
		int inPut3 = sc.nextInt();
		
		//결과를 저장할 변수지정하기
		//                   inPut1과 inPut2이 같을 때 && inPut2와 inPut3이 같을 때
		//                               ┌        true        ┐
		boolean compareResult = (inPut1 == inPut2) && (inPut2 == inPut3);
		
		// && : ampersand, and
		//  구분1   &&  구분2
		// (true)  && (true) = true
		// (true)  && (false) = false
		// (false) && (true) = false
		// (false) && (false) = false
		
		// || : vertical bar, or
		//  구분1   or  구분2
		// (true)  or (true) = true
		// (true)  or (false) = true
		// (false) or (true) = true
		// (false) or (false) = false
		// | : Backspace와 Enter 사이에 있는 원화 표시를 shift와 같이 누름
		boolean isOR = (inPut1 == inPut2) || (inPut2 == inPut3);
		
		//출력하기
		System.out.println("입력1 : "+inPut1+", 입력2 : "+inPut2+", 입력3 : "+inPut3);
		System.out.println("result : "+compareResult);
		System.out.println("isOR : "+isOR);
		
		//입력1 : 5, 입력2 :  -8, 입력3 :  5 일때
		//result : false && false이므로 false
		//isOR : false || false 이므로 false
		
		/* 오류 발생
		boolean compareResult = inPut1 == inPut2 == inPut3;
		   ==는 1개만 쓸 수 있음*/
		
		/* 오류 발생
		boolean compareResult = (inPut1 == inPut2) == (inPut2 == inPut3);
		   => && 대신 == 을 사용하면, 입력1 : 5, 입력2 :  -8, 입력3 :  5 일때
		      false == false이므로 결과적으로 true가 나온다.*/
		
		/* 오류 발생
		compareResult1 도 false, compareResult2 도 false 이면
		compareResultTotal이 true가 나옴 */
	}
	
	// 메인 메서드 : 최종적으로 실행하는 메서드
	public static void main(String[] args) {
		// practice1();
		// practice2();
		// practice3();
		// method4();
		// practice4();
		practice5();
		
	}

}
