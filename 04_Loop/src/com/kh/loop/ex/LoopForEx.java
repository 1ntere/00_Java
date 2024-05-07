package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {

	/*
	LoopForEx에서 출력하길 원한다면
	public static gugudan 에서
	public static void gugudan으로 static을 추가해준 다음에	
	//최종메서드
	public static void main(String[] args) {
		gugudan();
	}	
	
	static을 붙이지 않고 출력하길 원한다면
	출력용 클래스를 만들어서 출력하기 LoopForRun
	*/
	
	//사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단을 출력하기
	public void gugudan() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 세계로 오신 것을 환영합니다.");
		System.out.print("원하는 수를 입력해주세요. : ");
		int dan = sc.nextInt();
		
		//입력받은 수를 for 문 이용해서 출력
		for (int i = 1; i<=9; i++) {
			System.out.println(dan+" * "+i+" = "+(dan * i));
		}

	}
	
	//0을 입력하여 종료를 하기 전까지 반복해서 출력
	public void muhangugudan() {
		//사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단을 출력하기
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("구구단 세계로 오신 것을 환영합니다.");
			System.out.println("종료를 원하면 0 입력하기");
			System.out.print("원하는 수를 입력해주세요. : ");
			
			int dan = sc.nextInt();
			
			//만약에 숫자 0이 들어오면 프로그램 종료하기
			if (dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			//입력받은 수를 for 문 이용해서 출력
			for (int i = 1; i<=9; i++) {
				System.out.println(dan+" * "+i+" = "+(dan * i));
			}
		}
	}
	
	//구구단 입력받아 거꾸로 출력하기
	public void gugudan2() {
		//1. 스캐너로 구구단 값 입력 받기
		Scanner sc = new Scanner(System.in);
		
		//2. int dan = sc.nextInt();
		System.out.print("원하는 수를 입력하세요 : ");
		int dan = sc.nextInt();
		
		//3. for문을 활용해서 9번부터 1번까지 출력하기
		// for (int a = 1; 조건 ; a--)
		for (int a = 9; a>=1; a--) {
			System.out.println(dan+" * "+a+" = "+(dan * a));
		}
	}
	
	public void muhangugudan2() {
		Scanner sc = new Scanner(System.in);
		
		//while문을 추가하여 구구단을 무한으로 즐기기
		while (true) {
			System.out.print("원하는 수를 입력하세요 : ");
			int dan = sc.nextInt();
			
			//종료를 원할 경우 0을 입력해주면 종료하기
			if (dan == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;//for while switch 사용가능, if에서는 단독으로 사용 불가능
			}
						
			//continue 자주 사용되지 않음
			// if dan을 1~9까지만 입력 가능하도록 조건
			if (dan<1 || dan>9 ) {
				System.out.println("1부터 9까지의 숫자를 입력해주세요.");
				continue;
				//1~9까지의 숫자를 입력하지 않으면
				//if문만 탈출하고 while은 계속 진행됨
			}
			
			for (int a = 9; a>=1; a--) {
				System.out.println(dan+" * "+a+" = "+(dan * a));
			}
		}
	}
	
	//구구단을 1단부터 9단까지 모두 출력하기
	public void gugudanall() {		
		
		//1단부터 9단까지 출력
		for (int dan = 1; dan<=9; dan++) {
			
			System.out.println("====="+dan+"단"+"=====");
			//1단에서부터 1 ~ 9를 곱해준 값을 출력
			for (int i = 1; i<=9; i++) {
				System.out.println(dan+" * "+i+" = "+(dan * i));
			}
		}
	}
	
	//구구단을 2단부터 9단까지 출력
	public void gugudanall2() {
		for (int dan = 2;dan<=9; dan++) {
		//2단부터 시작하므로 시작식에서 dan = 2;
			System.out.println("====="+dan+"단=====");
			for (int i =1; i<=9; i++) {
				System.out.println(dan+" * "+i+" = "+(dan*i));
			}
		}
	}

	//랜덤으로 숫자 출력하기
	public void randomNumber() {
		
		//랜덤으로 불러와 내가 지정한 범위에서 숫자를 랜덤으로 출력하기
		Random 랜덤 = new Random(); //로또 번호 생성
		
		//nextInt() 안에 숫자를 넣어서
		//어디서부터 어디사이에서 랜덤으로 숫자가 나와야하는지 범위 지정가능
		int 랜덤숫자 = 랜덤.nextInt(5); //0 ~ 4 사이의 숫자가 나옴
		//숫자(정수)를 셀 때 코드 안에서는 양수 0부터 시작하므로
		//랜덤에서 괄호로 지정한 숫자 -1이 최대값
		System.out.println("랜덤숫자 : "+랜덤숫자);
	}
	
	//랜덤숫자 3개 출력
	public void randomFor() {
		//랜덤 호출하기
		Random ran = new Random();
		
		//랜덤숫자 3개 출력 (1 ~ 10사이의 숫자)
		for (int num=1; num <= 3;num++) {
			//랜덤으로 숫자를 만들어주기
			// 1 ~ 10을 만드려면
			// 0 ~ 9까지 랜덤 + 1;
			// ran.nextInt(10) + 1
			int randomNumber = ran.nextInt(10) + 1;
			System.out.println("랜덤숫자 "+num+" : "+ randomNumber);
		}
	}
	
	//랜덤으로 1 ~ 45 번호 6자리를 for문으로 출력
	public void lotto() {
		Random ran = new Random();
		
		for (int lottoNumIdx = 1; lottoNumIdx <= 6 ; lottoNumIdx++) {
			int lottoNum = ran.nextInt(45) + 1;
			
			//if 랜덤 숫자가 같다면 번호를 제외하고 출력하기
			System.out.print(lottoNum+" ");
		}
	}

	//1부터 10까지의 숫자 중에서 홀수만 출력하기
	//홀수 = odd
	public void oddNum() {
		for (int num =1; num<=10; num++) {
			//일단 1~10까지의 숫자를 가지고 있어야 하니까 num+=2가 아니라 num++
			
			if (num % 2 != 0) {
				System.out.print(num+" ");//홀수만 출력됨
			}
		}
	}
	
	//1부터 10까지의 숫자 중에서 짝수만 출력하기
	//짝수 = even
	public void evenNum() {
		for (int num =1; num<=10; num++) {			
			if (num % 2 == 0) {
				System.out.print(num+" ");//짝수만 출력됨
			}
		}
	}
	
	//정사각형 모양의 별 출력, 가로 세로 3개씩
	public void squareStar() {
		int star = 3;
		
		for (int i = 0; i < star; i++) { 
			//한 줄 출력
			
			for (int j = 0; j < star; j++) {
				System.out.print("★ ");//"* "도 가능
			}
			
			System.out.println();//가로로 별을 출력한 다음 줄바꿈
		}
	}
	
	//정사각형 모양의 별 출력, 가로 세로 5개씩
	public void fivestar() {
		int star = 5;
		
		for (int i = 0;i<star;i++) {
			for (int j=0;j<star;j++) {
				System.out.print("★ ");
			}
			System.out.println();
		}
	}
	
	//LoopForEx.java
	//랜덤으로 만들어진 숫자가 무엇인지 키보드로 맞추는 게임
	public void numberGame() {
		//숫자를 맞출 때 까지 계속 문제를 풀도록 하기 while (true) 사용
		//for 기회를 2번 주기
		//if 문을 수정해서 숫자값이 정답보다 작으면 숫자가 작습니다.
		//hint 숫자값이 정답보다 높으면 숫자가 큽니다.
		
		Scanner sc = new Scanner(System.in);
		
		//랜덤으로 숫자 만들기
		Random random = new Random();
		
		while (true) {
			int randomNumber = random.nextInt(3) + 1; // 1 ~ 3			
			System.out.println("숫자를 맞춰보세요!!!!");
			
			//for 문 안에 공격을 몇 번 까지 허용할 것인가? 공격을 2번만 허용하겠다.
			
			for (int attack = 1; attack <= 2; attack++) {
				System.out.print("공격을 "+attack+" 회 시도합니다 (숫자적기) : ");
				int guest = sc.nextInt();//게스트가 입력한 숫자 가져오기
				
				if (guest == randomNumber) {
					System.out.println("축하합니다!! 숫자를 맞췄습니다!");
					//숫자를 맞췄다면 숫자를 맞췄습니다.
					break;//맞췄다면 탈출을 작성하기
				} else if (guest > randomNumber) {
					System.out.println("숫자를 틀렸습니다.");
					System.out.println("숫자가 큽니다.");
					continue;
				} else {
					System.out.println("숫자를 틀렸습니다.");
					System.out.println("숫자가 작습니다.");
					continue;
				}
			}
			System.out.println("정답은 "+randomNumber+" 입니다.");
			System.out.println("게임을 다시 시작하겠습니까? (1번 yes / 2번 no)");
			int playAgain = sc.nextInt();
			
			if (playAgain == 2) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				continue;
			}
		}
		
		/*
		☆ 오류 발생
		while (true) {
			int randomNumber = random.nextInt(3) + 1; // 1 ~ 3
			
			System.out.print("숫자를 맞춰보세요 : ");
			int guest = sc.nextInt();//게스트가 입력한 숫자 가져오기
			
			for (int attack = 1; attack <= 2; attack++) {
				if (guest == randomNumber) {
					System.out.println("축하합니다!! 숫자를 맞췄습니다!");
					//숫자를 맞췄다면 숫자를 맞췄습니다.
					break;
				} else if (guest > randomNumber) {
					System.out.println("숫자를 틀렸습니다.");
					System.out.println("숫자가 큽니다.");
					continue;
				} else {
					System.out.println("숫자를 틀렸습니다.");
					System.out.println("숫자가 작습니다.");
					continue;
				}
			}
			break;
		}
		-----
		int guest = sc.nextInt();
		가 for 문 바깥에 있어서 게스트가 입력한 숫자를 1번만 받아왔기 때문에
		받아온 숫자가 똑같고, 그 결과 똑같은 결과가 바로 2번 출력했음
		=====
		문제 해결 방법
		int guest = sc.nextInt();
		를 for 문 안으로 집어 넣으면 1번째 시도가 틀렸을 때 한번 더 입력을 받는다.
		*/
		
	}
	
}
