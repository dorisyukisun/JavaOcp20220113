package com.study.ocp.day25;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateDataBase {

	public static void main(String[] args)  {
		//若是使用jdbc 3.0或在web上使用 需要利用Class.forName()求動態建立Driver 實體
		//jdbc 4.0 則不用
		try {
			Class.forName("org.sqlite.JDBC");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		 	//資料庫練線位置
		String dbUrl= "jdbc:sqlite:src/main/java/com/study/ocp/day25/demo1.db";
		//String username="";
		//String password="";
		try( Connection conn = DriverManager.getConnection(dbUrl)) {
			System.out.println("資料庫建立成功");
		}catch(Exception e1) {
		e1.printStackTrace();
		}
		
	}

}
