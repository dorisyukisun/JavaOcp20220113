package com.study.ocp.Day13;

import java.rmi.AccessException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InPutData4 {

	public static void main(String[] args) {
		 int[] data = { 10,5,2,0};
		 int x =10;//分子
		 System.out.println("分子"+ x +"/分母"+ Arrays.toString(data)+ "中選一個,請輸入index= ");
	     Scanner sc=new Scanner(System.in);
	     String str = sc.next();
	     //3.請輸入數字
		      //判斷 Str 是否為數字
		    
	     		boolean isNumber =str.chars().allMatch(Character::isDigit);
	     		if(!isNumber) {
	     			System.out.println("請輸入數字,請重新執行");
	     			return;
	     		}
		    	int index =Integer.parseInt(str);
		    	 
		      
		     //1.判斷資料是否合法 index 是不是介於0-3之間
		     if(index <0 || index >= data.length) {
		    	 System.out.println("index 範圍錯誤,請重新執行");
		    	 return;
		     }
		     //2.分母不可為 =0
		     if(data[index] ==0) {
		    	 System.out.println("分母不可 =0,請重新執行");
		    	 return;
		     }
		      
		    int result = x /data[index];
		    System.out.println(result);
		    System.out.println("end"); 
			
		 
		 
	}

	}

