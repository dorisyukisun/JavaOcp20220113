package com.study.ocp.day15;

public class Walk implements Runnable{

	@Override
	public void run() {
		String tName =Thread.currentThread().getName();
		for(int i=1; i<=1000; i++) {
			System.out.printf(" %s 慢跑了 ％d 步ｎ",tName,i);
		}
	}

}
