package com.study.ocp.day25;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

 

public class Insert {

	public static void main(String[] args) {
		String sql = "INSERT INTO Employee(name,age,saley)VALUES('Vincent',26,55000)";
		String dbUrl= "jdbc:sqlite:src/main/java/com/study/ocp/day25/demo1.db";
		try(Connection conn = DriverManager.getConnection(dbUrl);
				Statement stmt = conn.createStatement();){
			
			//使用excuteUpdate 會傳回資料表因為執行此sql 所變動的筆數
			int rowcount =stmt.executeUpdate(sql);
			System.out.println("Inserg rowcount =" + rowcount);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
