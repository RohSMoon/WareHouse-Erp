package com.util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	ServerSocket ss = null;
	Socket cs = null;
	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;

	public static void main(String[] args) {
		Server Sv = new Server();
		try {
			Sv.ss = new ServerSocket(8888);
			Sv.cs = Sv.ss.accept();
			Sv.oos = new ObjectOutputStream(Sv.cs.getOutputStream());
			System.out.println("서버가동");
			//클라이언트에게 줄 아웃풋 스트림 서버 > 클라이언트
			Sv.oos.write("Sever conn : 200!".getBytes());
			Sv.ss.close();
			Sv.cs.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		//8800 이전은 쓰면안댐 cmd- netstat  20, 21 번 포트는 FTP 포트 , 25번 포트 SMTP 메일포튼 /443 HTTPS 프로토콜 포트 / 1531 오라클포트 //3317 MSSQL 통신포트 //3389 RDP 리모트 데스크탑  원격 통신 포트
		//4 윈도우 업데이트 포트 // 1번포트 시스템 오픈 포트
		
	}

}
