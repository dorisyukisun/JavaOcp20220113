package com.study.ocp.day25;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
import java.util.Arrays;
import java.util.Random;

import com.github.javafaker.Faker;
//模擬輸入資料
 

public class BatchInsert {

	public static void main(String[] args) {
		String dbUrl ="jdbc:sqlite:src/main/java/com/study/ocp/day25/demo1.db";
		 String sql = "INSERT INTO Employee(name, age, salary) VALUES(?,?,?)";
		 Random random = new Random();
		 Faker faker = new Faker();
		 
		 try(Connection conn = DriverManager.getConnection(dbUrl);
				PreparedStatement pstmt = conn.prepareStatement(sql);){
			 pstmt.clearBatch();//  清除batch
			 
			 for( int i=0;i<100;i++) {
				 pstmt.setString(1, faker.name().firstName());
				 pstmt.setInt(2,20+random.nextInt(20));
				 pstmt.setDouble(3,25250+ random.nextInt(100) );
				 pstmt.addBatch(); // 加入 batch
			 }
			 
			 
			 
			 
			 int[] rowcounts = pstmt.executeBatch();//批次執行
			// System.out.println(Arrays.toString(rowcounts));
			 System.out.println("批次執行 OK");
			 
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}

}
