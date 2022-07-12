package com.study.ocp.day09;

public class OuterMethod {
	
	public void bar(int y) {
		// 區域變數 x 和 y 都在方法內  	都是區域變數
		
		int x = 10; //預設一定 final 
		class Inner {
		  void callMe() {
			  
			  System.out.println("Call me !");
				
			}
		}
		Inner in = new Inner();
		in.callMe();
	}

}
