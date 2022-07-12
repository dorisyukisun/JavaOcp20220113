package com.study.ocp.day15;

public class USDMain {

	public static void main(String[] args) { //	指定裝箱法
		
		final int twd =1_0000;//	台幣
		//可以換多少美金
		
		Box box =(price) -> System.out.println(twd /price);
		
		 
		USD usd = new USD(box);
		Thread t1 = new Thread(usd);
		t1.start();
		 
		
	}

}
