package com.study.ocp.day24.console;

 
 
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SimpleServer {

	public static void main(String[] args) throws Exception {
		 //1.建立 ServerSocket
		int port =5001;
		 ServerSocket server = new ServerSocket(5001);
		 String serverIP = InetAddress.getLocalHost().getHostAddress();
		 System.out.printf("以建立Server=%s:%d\n",serverIP,port);
		 //2.等待Client 端進來並建立Socket 連線
		 System.out.println("等待 Client 端進來並建立Socket 連線");
		 Socket socket = server.accept();
		 //3.建立Input/Output串流 Stream
		 ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		 ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		 System.out.printf("已進入,client端%s:%d\n",socket.getInetAddress(),socket.getPort());
		 Scanner sc = new Scanner(System.in);
		 while(true) {
			 //4.讀取client端資訊
			 String message = (String) ois.readObject();
			 if(message.equalsIgnoreCase("exit")) {
				 break;
			 }
			 System.out.printf("Client端說:%s\n",message);
			 //5.回應(將資料傳給Client端)
			 System.out.println("請輸入回應訊息");
			 oos.writeObject(sc.next());
		 }
		 
		 System.out.println("socket已經關閉");
		 socket.close();		 
			 
	}

}
