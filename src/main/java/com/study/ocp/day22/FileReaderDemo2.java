package com.study.ocp.day22;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) {
		 String filePath ="src/main/java/com/study/ocp/day22/file/ data.txt";
		 try(FileReader fr =new FileReader(filePath)){
			 
			// 結束後會自動執行 close 方法
			 char[] buffer = new char[1];
			 while (fr.read(buffer) !=-1) {
				 System.out.println(buffer[0]);
			 }
		 }catch (IOException e) {
			 e.printStackTrace();
		 }

	}

}
