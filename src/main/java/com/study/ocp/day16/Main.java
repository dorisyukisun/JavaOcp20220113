package com.study.ocp.day16;

class MyTread implements Runnable{
	public void run() {
		System.out.println("Running");
	}
}

public class Main {

	public static void main(String[] args) {
		Thread t1= new Thread(new MyTread());
		Thread t2= new Thread(new MyTread());
		Thread t3= new Thread(new MyTread());
		
		//印出 t1.isAlive();
		t1.start();
		t2.run();
		t3.start();
		
		//印出 t1.isAlive();
		t1.start();
		 
	}

}
/* which one is correct ?
 *  A An Illegal ThreadStateException is thrown at run time/
 *  B.four threads are created.
 *  C.three Thread is created.
 *  D.the compilation fails.
 * 
 * 
 */
