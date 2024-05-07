package com.kh.practice.chap02.run;

import java.util.Scanner;

import com.kh.practice.chap02.loop.LoopPractice;
//가져오겠다(import) / 폴더 위치에서(com.kh.practice.chap02.loop) / 폴더 안에 있는 파일 명(LoopPractice);
public class Run {

	//최종으로 실행하는 메인 메서드
	public static void main(String[] args) {
		/*
		기능 제공 클래스에서 최종으로 실행할 메소드 이름만 작성
		특정 기능을 실행할 수 있도록 기능을 작성한 공간
		
		LoopPractice에 있는 Greeting()을 가져와서 출력하고 싶음
		Scanner를 불러올 때 사용했던 것 처럼
		LoopPractice를 new로 가지고 와서 LoopPractice 밑에 있는 Greeting을 불러올 것
		*/
		Scanner sc = new Scanner(System.in);
		LoopPractice LP = new LoopPractice();
		//LP.Greeting();
		//LP.Greeting2();
		//LP.practice2();
		//LP.practice3();
		//LP.practice12();
		//LP.practice1_1();
		//LP.practice12_1();
		//LP.practice4();
		//LP.practice5();
		//LP.practice6();
		//LP.practice13();
		//LP.practice14();
		//LP.practice15();
		LP.practice15_1();
		
	}

}
