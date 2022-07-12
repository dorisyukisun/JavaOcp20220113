package com.study.ocp.day18;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class  MyLottoThreadMainPool {

	public static void main(String[] args)throws Exception {
		 
		ExecutorService exec = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		
		Future t1 =exec.submit(new Lotto2());
		System.out.println(t1.get());
		exec.execute(new Lotto());
		exec.execute(new Lotto());
		exec.execute(new Lotto());
		exec.execute(new Lotto());
		exec.execute(new Lotto());
		
		Thread.sleep(5000);
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		exec.submit(new Lotto());
		
		System.out.println("Thread count:"+Thread.activeCount());
		
		exec.shutdown();
	}

}
