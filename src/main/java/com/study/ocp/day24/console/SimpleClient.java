package com.study.ocp.day24.console;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.ietf.jgss.Oid;

public class SimpleClient {

	public static void main(String[] args) throws Exception {
		 Scanner sc =new Scanner(System.in);
		 System.out.print("請輸入ServerSocket IP:");
		 String ip = sc.next();
		 System.out.print("請輸入ServerSocket Port:");
		 int port =sc.nextInt();
		 //1.建立Socket連線
		 Socket socket = new Socket(ip,port);
		 System.out.println("與server 端建立連線成功");
		//2.建立Input/Output串流 Stream
		 ObjectOutputStream oos= new ObjectOutputStream(socket.getOutputStream());
		 ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		 while(true) {
			 //3.將資料傳給server
			 System.out.print("請輸入傳送訊息");
			 String message =sc.next();
			 oos.writeObject(message);
			 if(message.equalsIgnoreCase("exit")) {
				 break;
			 }
			 //4.讀取Server傳來的資料
			 System.out.printf("Server 説: %s\n",(String)ois.readObject());
					
		 }
		 
		 //3.關閉 Socket 連線
		 socket.close();
		 
		 
	}

}
