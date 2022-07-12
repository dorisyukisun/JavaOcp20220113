package com.study.ocp.day22;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyData {

	public static void main(String[] args) throws IOException {
		 String sourPath ="src/main/java/com/study/ocp/day22/file/ data.txt";  //來源端
		 String destPath ="src/main/java/com/study/ocp/day22/file/ data_backup.txt"; //目的端
		  
		 try (FileReader fr = new FileReader(sourPath);
			  FileWriter fw = new FileWriter(destPath);){
				  char[] buffer =new char[1];
				  while (fr.read(buffer) !=-1) {
					 //fw.write(buffer); // 將 char [] 寫入
					  fw.append(buffer[0]);
			
				  }
			   
			  
			  
		 } catch (Exception e) {
			 e.printStackTrace();
		}
		 System.out.println("Copy OK !");
	}

}
