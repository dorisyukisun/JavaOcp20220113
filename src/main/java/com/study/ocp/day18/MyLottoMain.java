package com.study.ocp.day18;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class MyLottoMain {

	public static void main(String[] args)throws Exception {
		 
		ExecutorService exec = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		
		Future t1 =exec.submit(new Lotto2());
		System.out.println(t1.get());
		exec.execute(new Lotto());
		exec.execute(new Lotto());
		exec.execute(new Lotto());
		exec.execute(new Lotto());
		exec.execute(new Lotto());
		
		
		exec.shutdown();
	}

}
