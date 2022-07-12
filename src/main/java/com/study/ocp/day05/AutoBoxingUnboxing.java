package com.study.ocp.day05;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
		 int a=100;
		 int b=100;
		 System.out.println(a==b);
		 
		 Integer x= Integer.valueOf("100");
		 System.out.printf("x:%d\n,x");
		 System.out.println(x.intValue()==100);//java 5.0 以前的作法
		 System.out.println(x==a); //Java 5.0 含）以後 auto-unboxing
		 //原理:x.intValue() <--由javac 編譯器幫你做
		 
		 int c =Integer.valueOf(100);// auto-unboxing 自動拆箱
		 Integer d=100; //auto-boxing Integer.ValueOf(100)
		 
		 

	}

}
