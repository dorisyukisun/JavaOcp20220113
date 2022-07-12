package com.study.ocp.day22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.print.event.PrintJobEvent;

public class EmployeeMain {

	public static void main(String[] args) {
		 Employee john = new Employee("john");
		 System.out.println(john);
		 //如何將john物件序列化並存檔為john.ser
		 String filePath ="src/main/java/com/study/ocp/day22/file/ john.ser";
		 try(FileOutputStream fos = new FileOutputStream(filePath);
			 ObjectOutputStream oos =new ObjectOutputStream(fos)){
			 
			 oos.writeObject(john);
			 
			 System.out.println("序列化寫檔完成");
			 
		 }catch(IOException e) {
			 e.printStackTrace();
		 }

	}

}
