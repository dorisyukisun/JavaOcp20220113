package com.study.ocp.day22;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;


public class FileWriterDemo {

	public static void main(String[] args) {
		 String filePath ="src/main/java/com/study/ocp/day22/file/ data.txt";
		 try(FileWriter fr = new FileWriter(filePath,false)){ //false 不保留之前檔案內的資料，true就是保留之前檔案的資料
			 String data1 = "現在時間:"+ new Date().toString();
			 String data2 = "\n";
			 String data3= "welcome!";
			 fr.write(data1);
			 fr.write(data2);
			 
			 fr.write(data3);
			 System.out.println("File內容寫入成功");
		 } catch (IOException e) {
			 
			e.printStackTrace();
		}
	}

}
