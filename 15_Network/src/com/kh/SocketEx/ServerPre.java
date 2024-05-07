package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//채팅 시작 주최자
//port의 경우 2자리, 3자리, 4자리는 컴퓨터에서 약속으로 지정한 숫자가 이미 존재함
//따라서 지금 예제에서는 5자리의 포트번호를 사용
public class ServerPre {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(12370);
			
			Socket clientSocket = server.accept();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			
			String message;
			
			while((message = in.readLine()) != null) {
				System.out.println("send : " + message);
				out.println("success : " + message);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
