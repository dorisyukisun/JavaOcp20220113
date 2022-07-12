package com.study.ocp.Day13;

import java.rmi.AccessException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InPutData {

	public static void main(String[] args) {
		 int[] data = { 10,5,2,0};
		 int x =10;//分子
		 System.out.println("分子"+ x +"/分母"+ Arrays.toString(data)+ "中選一個,請輸入index= ");
	     Scanner sc=new Scanner(System.in);
		try {
			int index =sc.nextInt();
		    int result = x /data[index];
		    System.out.println(result);
			 
			
		} catch (Exception e) { //統一錯誤處理
			 System.out.println(e);
		
		{
			System.out.println("end");
		}
		 
	}

	}
}
