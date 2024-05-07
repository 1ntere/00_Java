package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//파티참가자
public class ClientEx {
	public static void main(String[] args) {
		//참가자 = c, 메시지출력 = m
		try {
			//						localhost = 127.0.01은 내 컴퓨터 주소라는 의미
			//						접속하고자 하는 컴퓨터 주소, 서버의 포트 번호
			Socket c = new Socket("localhost", 12341);
			
			//주최자와 대화를 하기 위한 입출력 스트림 생성
			//1. 참가자(= c).getInputStream() : 참가자가 작성한 데이터를 읽어오기 위한 입력 스트림을 가져옴(숫자값으로 가져옴)
			//2. InputStreamReader() : 하나씩의 단어들을 숫자에서 문자로 변환하는데 사용(1에서 받은 숫자값을 문자로)
			//3. BufferedReader() : 하나씩의 데이터를 한 번에 가져오고 읽을 수 있도록 도와줌
			BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));
			
			//작성한 내용을 눈으로 볼 수 있게 내보내는 역할을 하고, 눈으로 읽을 수 있게 도와줌
			//1. 참가자.getOutputStream(), true : 참가자가 작성한 내용을 내보내기 위해 가져옴
			//							 true를 사용함으로써 내보내도 좋다는 의미
			//								flush() : 강제로 출력하는 역할 <-이 true에 포함되어 있음
			//2. PrintWriter() : 텍스트를 출력하는데 불편함 없이 매끄럽게 출력할 수 있도록 도와줌
			PrintWriter out = new PrintWriter(c.getOutputStream(), true);
			
			//주최자로 메세지 전송
			out.println(" hi server !");
			
			//주최자로부터 받은 메시지 수신 및 출력
			/* 1. 이것도 맞는 코드지만 m이 null이 나오기 때문에 바꿔줌
			String m = in.readLine();
			System.out.println("send success : " + m);
			*/
			// 2. 이것도 맞는 코드
			String m;
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
			}
			/* 3. 이것도 맞는 코드
			//for문 while을 사용해서 출력을 확인
			//클라이언트는 서버가 읽을 때 까지 여러번 메시지를 다시 보내서 출력해 볼 수 있음
			for (int i = 0; i < 3; i++) {
				out.print(i);;
				String t = in.readLine();
				System.out.println("send success : " + t);
			}
			*/
			
			//내 할말을 닫고, 내보내는 것도 닫고, 참가자 닫기
			in.close();
			out.close();
			c.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
