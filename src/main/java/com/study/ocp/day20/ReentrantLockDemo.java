package com.study.ocp.day20;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class Lotto implements Runnable {
	
	private String username;
	private static final ReentrantLock Lock = new ReentrantLock(); //兩個物件各自執行緒 要加上static
	public Lotto (String username)
	{
		this.username =username;
	}
	@Override
	public void run() {
		
		try {
			Lock.lock(); //嘗試鎖定
			for(int i=1; i<=5;i++) {
				System.out.printf("%d 得到第%d 組號碼：%d\n",username, i ,new Random().nextInt(100));
				
			}
			
		} catch (Exception e) {
			 e.printStackTrace();
		} finally {
			Lock.unlock();//解鎖
		}
	}
}
public class ReentrantLockDemo {

	public static void main(String[] args) {
		ExecutorService service =Executors.newFixedThreadPool(2);
		service.execute(new Lotto("vincent"));
		service.execute(new Lotto("anita"));
		service.shutdown();
		 
	}

}
