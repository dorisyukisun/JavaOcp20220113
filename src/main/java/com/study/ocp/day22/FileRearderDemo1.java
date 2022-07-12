package com.study.ocp.day22;

import java.io.FileReader;
import java.io.IOException;

public class FileRearderDemo1 {

	public static void main(String[] args) {
		String filePath ="src/main/java/com/study/ocp/day22/file/ data.txt";
		//1.Open stream
		FileReader fr = null ;
		
		try {
			fr = new FileReader(filePath);
			//2.while information
			char[]buffer = new char [1]; 
			while(fr.read(buffer) != -1 ) { //資料讀進 buffer 並判斷是否讀到檔尾 -1
				System.out.print(buffer[0]); //將資料印出
				
			}
			
		} catch (IOException e) {
			 e.printStackTrace();
		} finally {
			//3.close stream
			if(fr !=null) {
				try {
					fr.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
