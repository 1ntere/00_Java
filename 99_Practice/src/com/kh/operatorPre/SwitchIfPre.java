package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {
	
	/*
	표기법
	코드를 작성할 때 개발자 사이에 코드를 보기 편하게 하기 위해서 작성하는 표기법

	1. 스네이크 케이스
	변수명에 언더바(_)가 들어있는 표현방식
	snake_case
	one_two_three
	id_number

	2. 파스칼 케이스
	첫 글자와 중간 글자의 시작을 대문자로 사용하는 표현방식
	PascalCase
	OneTwoThree
	IdNumber

	3. 카멜 케이스
	중간 글자의 시작만 대문자로 사용하는 표현방식
	camelCase
	oneTwoThree
	idNumber

	4. 케밥 케이스
	중간에 대시(-)로 구분해서 사용하는 표현방식
	kebab-case
	one-two-three
	id-number
	*/
	
	public static void practice8() {
		//주민번호를 이용해서 남자인지 여자인지 구분해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String idNumber = sc.next();
		
		//YYMMDD-M/F+______
		//주민번호 뒷자리의 첫 번째 숫자를 가지고 옴
		//charAt 7번째 자리에 있는 값을 가지고 와서 여자인지 남자인지 구분해서 출력
		char genderCode = idNumber.charAt(7);
		// 중간에 -가 있어서 7임
		// 숫자만 받았으면 6임
		
		//주민번호 뒷자리 첫 번째 숫자로 성별을 판별
		String gender = null;// 나중에 남자인지 여자인지 확인해주는 결과 보여주기
		
		if (genderCode == '1' || genderCode == '3') {
			// String 일 경우에는 "", char 일 경우에는 ''
			// char를 이용해서 숫자 값을 가져오기 때문에 '' 사용
			System.out.println("남자");
		} else if (genderCode == '2' || genderCode == '4') {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 입력입니다.");
			return;
			//1. gender = "올바른 주민번호가 아닙니다.";
			//2. return;
		}
		
		//결과 출력하기
		System.out.println("입력한 주민번호의 성별은 "+gender+"입니다.");
	}
	
	public static void castingPractice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);
		
		//유니코드 출력하기
		// 유니코드 : 전 세계의 모든 글자나 문자를 컴퓨터에서 일관되게 표현하기 위한 방식
		// 글자에 숫자를 붙여서 컴퓨터가 읽을 수 있도록 해주는 방식
		int unicode = (int) inputChar;
		//char는 2byte, int는 8byte 이므로 자동으로 형 변환 되기 때문에
		//(int)를 생략해도 된다
		
		System.out.println("입력한 문자 "+inputChar+" 의 유니코드는 "+unicode+" 입니다.");
	}

	public static void castingpractice3() {
		//주어진 코드의 빈칸을 채워 출력 결과가 나오도록 만들 것
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;//기본값이 double이기 때문에 float으로 변경해주는 f 붙여줌
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1/iNum2); //2 //int이기 때문에 몫(2)만 나옴
		System.out.println((int) dNum); //2 //double실수로 되어 있는 것을 int정수로 변경
		//double 8byte => int 4byte 강제 형변환을 하겠다는 표시를 작성 후 시켜줄 것
		
		System.out.println((double) iNum2*dNum); //10.0
		//작은 값과 큰 값이 만나면 자동으로 큰 값으로 변경되기 때문에 (double)이 필수가 아님
		System.out.println((double) iNum1); //10.0
		
		System.out.println((double) iNum1/iNum2); //2.5 //정수형에서 실수형으로 바꿔줬으므로 2.5가 나옴
		System.out.println(dNum); //2.5
		
		System.out.println((int) fNum); //3 //실수형을 정수형으로 나타내기
		System.out.println((int) (iNum1/fNum)); //3 //나누기를 해서 몫이 3이 나오도록
		//int와 float은 같은 크기 (4byte), 따라서 정수인지 실수인지 표기하기
		
		System.out.println(iNum1/fNum); //3.3333333
		//float은 기본적으로 소수점 이하 6자리 까지만 보여줌
		System.out.println((double) iNum1/fNum); //3.3333333333333335
		
		System.out.println(ch); //'A'
		System.out.println((int) ch); //65
		
		System.out.println(ch+iNum1); //75
		//자동 형변환 : 큰 byte의 자료형과 작은 byte의 자료형이 만나면 작은 byte의 자료형이 자동으로 큰 byte의 자료형으로 변환됨
		//(int)를 굳이 안붙여도 ch의 int형은 65값을 가지고 있기 때문에
		//(int) ch (= 65) + iNum1 (= 10) = 75
		System.out.println((char) (ch + iNum1)); //'K'
	}
	
	public static void controlPractice1() {
		//키보드로 입력받고 입력 수정 조회 삭제 종료 버튼 눌러서 실행하기
		Scanner sc = new Scanner(System.in);
		
		//메뉴 출력하기
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		//메뉴 번호 입력 받기
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNumber = sc.nextInt();
		
		//선택된 메뉴에 따라 동작 수행
		switch (menuNumber) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료 메뉴입니다.");
			break;
		default:
			System.out.println("잘못된 입력 입니다.");
			break;
		}
		
		
	}
	
	public static void controlPractice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 한 개 입력하세요 : ");
		int number = sc.nextInt();
		
		if (number > 0) {
			if (number % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		}  else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public static void controlPractice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		double korean = sc.nextDouble();
		System.out.print("수학점수 : ");
		double math = sc.nextDouble();
		System.out.print("영어점수 : ");
		double english = sc.nextDouble();
		
		double totalScore = korean+math+english;
		double averageScore = totalScore/3.0;
		
		if (korean>=40 && math>=40 && english>=40 &&averageScore>=40) {
			System.out.println("국어 : "+korean);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+english);
			System.out.println("합계 : "+totalScore);
			System.out.println("평균 : "+averageScore);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public static void controlPractice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int monthNum = sc.nextInt();
		
		switch (monthNum) {
		case 1: case 2: case 12:
			System.out.println(monthNum+"월은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println(monthNum+"월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(monthNum+"월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(monthNum+"월은 가을입니다.");
			break;
		default :
			System.out.println(monthNum+"월은 잘못 입력된 달입니다.");
			break;
		}
	}
	
	public static void controlPractice5() {
		Scanner sc = new Scanner(System.in);
		
		String userId = "myId";
		String userPw = "myPassword12";
		
		System.out.print("아이디 : ");
		String inputId = sc.next();
		System.out.print("비밀번호 : ");
		String inputPw = sc.next();
		
		if (inputId.equals(userId)) {
			if (inputPw.equals(userPw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		/*
		★ 이것도 가능		
		// inputId.equals(userId) : inputId와 userId 값이 같아야 함
		// !inputId.equals(userId) : inputId와 userId 값이 달라야 함
									! 가 붙으면 아이디가 틀렸을 때 참이 된다.
		
		if (inputId.equals(userId) && inputPw.equals(userPw)) {
			System.out.println("로그인 성공");
		} else if (!inputId.equals(userId)) {
			System.out.println("아이디가 틀렸습니다.");
		} else if (!inputPw.equals(userPw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else {
			System.out.println("잘못 입력된 값 입니다.");
		}
		*/
	}
	
	public static void controlPractice6() {
		//사용자로부터 회원 등급 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급");
		
		//권한이나 규칙을 설정할 때 자주 사용하는 변수 명 : Role
		
		System.out.print("해당 회원 등급의 권한 : ");
		String userRole = sc.next();
		
		switch (userRole) {
		case "관리자" :
			System.out.println("-회원관리 \n -게시글 관리 \n -게시글 작성 \n 게시글 조회 \n -댓글 작성");
			break;
		case "회원" :
			System.out.println("-게시글 작성 \n 게시글 조회 \n -댓글 작성");
			break;
		case "비회원" :
			System.out.println("게시글 조회");
			break;
		default : 
			System.out.println("해당하는 회원 등급이 존재하지 않습니다.");
			break;
		}
	}
	
	public static void controlPractice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height*height);
		
		System.out.println("BMI 지수 : "+bmi);
		
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}
		
	}
	
	public static void controlPractice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String operator = sc.next();
		
		double result;
		switch (operator) {
		case "+":
			result = num1 + num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			break;
			
			/*
			★★★★★ / 와 % 는 0으로 나눌 수 없기 때문에 if문으로 값이 0이 될 경우 처리를 해줘야 함 ★★★★★
			 */
		case "/":
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				return;
			}
			result = (double) num1 / num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			break;
		case "%":
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				return;
			}
			result = num1 % num2;
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
	
		
		/* 맞는 코드
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char operator = sc.next().charAt(0);
				
		float result;
		
		if (num1>0 && num2>0) {
			if (operator == '+') {
				result = num1+num2;
			} else if (operator == '-') {
				result = num1-num2;
			} else if (operator == '*') {
				result = num1*num2;
			} else if (operator == '/') {
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
					return;
			}
				result = (double) num1/num2;
			} else if (operator == '%') {
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
					return;
			}
				result = num1%num2;
			} else {
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
			System.out.println(num1+" "+operator+" "+num2+" = "+ result);
			}
		}
		
		/*
		★ 오류 발생 1
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String operator = sc.next();
		
		double result;
		
		if (num1>0 && num2>0) {
			if (operator == "+") {
				result = num1 + num2;
			} else if (operator == "-") {
				result = num1 - num2;
			} else if (operator == "*") {
				result = num1 * num2;
			} else if (operator == "/") {
				result = num1 / num2;
			} else if (operator == "%") {
				result = num1 % num2;
			} else {
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
			}
		}
		=====
		★ 해결 방안 1
		operator의 자료형을 char로 받아서 charAt(0) 사용
		 */
	
		/* 오류 발생 2
		else if (operator == '/') {
			result = (double) (num1/num2);
		=> result가 3.0이 나옴
		=====
		★ 해결 방안 2
		else if (operator == '/') {
				result = (double) num1/num2;
		=> result가 3.75가 나옴
		 */
	
		/* 오류 발생 3
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String operator = sc.next();
	
		double result;
	
		if (num1>0 && num2>0) {
			switch (operator) {
			case "+":
				result = num1 + num2;
				System.out.println(num1+" "+operator+" "+num2+" = "+result);
				break;
			case "-":
				result = num1 - num2;
				System.out.println(num1+" "+operator+" "+num2+" = "+result);
				break;
			case "*":
				result = num1 * num2;
				System.out.println(num1+" "+operator+" "+num2+" = "+result);
				break;
			case "/":
				result = num1 / num2;
				System.out.println(num1+" "+operator+" "+num2+" = "+result);
				break;
			case "%":
				result = num1 % num2;
				System.out.println(num1+" "+operator+" "+num2+" = "+result);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
			}
		}
	 	*/
		}
		
	public static void controlPractice8_1() {
		int num1 = 15;
		int num2 = 4;
		float fnum1 = (float) num1;
		float fnum2 = (float) num2;
		System.out.println(fnum1);
		System.out.println(fnum2);
		
		float result1 = (float) (num1 / num2);
		System.out.println(result1);
		float result2 = (float) num1 / num2;
		System.out.println(result2);
		float result3 = fnum1 / fnum2;
		System.out.println(result3);
		float result4 = fnum1 / fnum2;
		System.out.println(result4);
	}
	
	public static void controlPractice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print("과제   점수 : ");
		int homework = sc.nextInt();
		System.out.print("출석   횟수 : ");
		int attend = sc.nextInt();
		
		double attendPer = (double) attend/20*100;
		/*
		★ 오류 발생 1
		double attendPer = attend/20*100; 하면 attendPer가 0이 나옴
		=====
		attend의 자료형은 int형
		int형에서 / 하면 attend가 20이 아닌 이상 몫이 0으로 나온다.
		따라서 0*100 = 0이됨.
		=====
		★ 해결 방안 1-1
		double attendPer = (double) attend/20*100;
		★ 해결 방안 1-2
		double attendPer = attend*5;
		*/
		
		double midScore = mid*0.2;
		double finScore = fin*0.3;
		double homeworkScore = homework*0.3;
		double attendScore = attendPer*0.2;
		
		double totalScore = midScore+finScore+homeworkScore+attendScore;
		
		if (attendPer>=70) {
			System.out.println("중간 고사 점수(20) : "+midScore);
			System.out.println("기말 고사 점수(30) : "+finScore);
			System.out.println("과제 점수     (30) : "+homeworkScore);
			System.out.println("출석 점수     (20) : "+attendScore);
			System.out.println("총점 : "+totalScore);
			
			if (totalScore>=70) {
				System.out.println("PASS");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		} else {
			System.out.println("Fail [출석 횟수 부족 ("+attend+"/20)");
		}		
	}
	
	public static void controlPractice10() {
		//앞에서 구현한 실습문제(1~9)를 선택하여 실행할 수 있는 메뉴화면을 구현하세요
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print에서 출력할 내용이 길어져서
		줄바꿈으로 글을 작성하고 싶다면 \n 을 이용해서 줄바꿈해서 출력하기
		\n : 세로로 줄바꿈해서 출력
		\r : 키보드 입력하는 위치를 현재 줄의 처음으로 이동
		System.out.print();
		 + ); : 붙이지 않는 한 줄을 바꿔서 계속 이어서 작성할 수 있음
		*/
		
		System.out.println("실행할 기능을 선택하세요.");
		
		//System.out.print("1. 메뉴 출력\r\n2. 짝수/홀수\r\n3. 합격/불합격\r\n4. 계절\r\n5. 로그인\r\n6. 권한 확인\r\n7. BMI\r\n8. 계산기\r\n9. P/F");
		//아래 코드와 같아서 주석처리 함(아래 코드가 더 가독성이 좋음)
		System.out.print("1. 메뉴 출력\r\n"
				+ "2. 짝수/홀수\r\n"
				+ "3. 합격/불합격\r\n"
				+ "4. 계절\r\n"
				+ "5. 로그인\r\n"
				+ "6. 권한 확인\r\n"
				+ "7. BMI\r\n"
				+ "8. 계산기\r\n"
				+ "9. P/F");
		// 위 코드에서 \r을 생략해도 됨
		
		/* System.out.print("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		*/	
		
		//메뉴 번호 입력 받기
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNumber = sc.nextInt();
		
		//선택된 메뉴에 따라 동작 수행
		switch (menuNumber) {
		case 1:
			System.out.println("메뉴 출력");
			controlPractice1();
			break;
		case 2:
			System.out.println("짝수/홀수");
			controlPractice2();
			break;
		case 3:
			System.out.println("합격/불합격");
			controlPractice3();
			break;
		case 4:
			System.out.println("계절");
			controlPractice4();
			break;
		case 5:
			System.out.println("로그인");
			controlPractice5();
			break;
		case 6:
			System.out.println("권한 확인");
			controlPractice6();
			break;
		case 7:
			System.out.println("BMI");
			controlPractice7();
			break;
		case 8:
			System.out.println("계산기");
			controlPractice8();
			break;
		case 9:
			System.out.println("P/F");
			controlPractice9();
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	
	public static void main(String[] args) {
		//practice8();
		//castingPractice1();
		//castingpractice3();
		//controlPractice1();
		//controlPractice1();
		//controlPractice2();
		//controlPractice3();
		//controlPractice4();
		//controlPractice5();
		//controlPractice6();
		//controlPractice7();
		//controlPractice8();
		//controlPractice8_1();
		controlPractice9();
		//controlPractice10();

	}

}