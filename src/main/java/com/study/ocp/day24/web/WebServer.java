package com.study.ocp.day24.web;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class WebServer {

	public static void main(String[] args) throws Exception {
		 WebServer webServer =new WebServer();
		 webServer.start();
		 
	}

	public void start() throws Exception {
		 ServerSocket server;
		 System.out.println("WebServer啟動");
		 server = new ServerSocket(8080);
		 while(true) {
			 System.out.println("等待瀏覽器的連線");
			 Socket socket = server.accept();
			 BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF8")),true);
			 System.out.println("瀏覽器成功進入");
			 /*String data =null;
			 System.out.println("瀏覽器傳來的資料");
			 while((data = br.readLine()) !=null) {
				 System.out.println(data);
			 }*/
			 
			 //System.out.println("瀏覽器傳來的資料:"+br.readLine());//得到 HTTP 文件的第一行
			 //----------
			 //回應 HTTP 文件結構(4parts)
			 //Part1 : init line
			 out.println("HTTP/1.1 200ok");
			 //Part2: header in
			 out.println("Content-Type: tsxt/html");
			 out.println("Server:GjunWebServer" + new Date().getTime());
			 //Part3:Blank Line
			 out.println();
			 //Part 4 :Body (回憶給瀏覽器的HTML 內容)
			 //out.println("<H1>現在時刻:" + new Date() +"<H1>");
			 Path path =Paths.get("");
			 out.println(String.format(Files.readAllLines(path).toString(),new Date()));
			 out.close();
		 }		 
		
	}

	 

}
