package com.study.ocp.day05;

public class AutoBoxingUnboxingCompare {

	public static void main(String[] args) {
		 int a=100;
		 int b=100;
		 
		 Integer x= Integer.valueOf(100);
		 Integer y= new Integer(100);
		 
		 System.out.println(a==b);
		 System.out.println(a==x);
		 System.out.println(y==b);
		 System.out.println(x==y);

	}

}
