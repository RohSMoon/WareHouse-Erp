package com.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	Socket cs = null;
	ObjectOutputStream oos = null;
	ObjectInputStream ois = null;
	public static void main(String[] args) {
		Client ct = new Client();

		try {
			//ct.cs = new Socket("127.0.0.1", 8888);
			ct.cs = new Socket("172.30.1.21", 8888);
			System.out.println(" 연결 물림");
			ct.ois = new ObjectInputStream(ct.cs.getInputStream());
					//ct.cs.getInputStream();
			byte[] recivebuf = new byte[100];
			ct.ois.read(recivebuf);
			System.out.println(new String(recivebuf));
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
