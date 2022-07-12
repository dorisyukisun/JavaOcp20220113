package com.study.ocp.Day14;

//非受檢例外 ：RuntimeException 及其子類別.Error 及其子類別
//受檢例外:Exception 及其子類別(不含非受檢例外)

public class ThrowExceptionDemo2 {

	public static void main(String[] args) {
		 
		 try {
			sayHello();
		} catch (Exception e) {
			System.err.println(e);
		}finally {
			System.out.println("finish");
			 
		}
		 sayHi();
		
	}
	public static void sayHello() throws Exception{
		System.out.println("hello");
		//block code...
	}
	public static void sayHi() throws RuntimeException{
		System.out.println("Hi");
		
		//block code ....
	}
}
