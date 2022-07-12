package com.study.ocp.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Delete {

	public static void main(String[] args) {
		String dbUrl ="jdbc:sqlite:src/main/java/com/study/ocp/day25/demo1.db";
		 String sql = "DELETE FROM Employee WHERE id = ?";
		 
		 try(Connection conn =DriverManager.getConnection(dbUrl);
				 PreparedStatement pstmt = conn.prepareStatement(sql);){
			 
			 pstmt.setInt(1,2);
			 int rowcount =pstmt.executeUpdate();
			 System.out.println("Delete rowcount =" + rowcount);
;
			 
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
