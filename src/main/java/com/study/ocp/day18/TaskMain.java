package com.study.ocp.day18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TaskMain {

	public static void main(String[] args) throws Exception {
			ExecutorService service =Executors.newFixedThreadPool(1);
		 //ExecutorService service =Executors.newCachedThreadPool();
		 service.submit(new Task());
		 service.submit(new LongTask());
		 service.submit(new Task());
		 service.submit(new Task());
		 service.submit(new LongTask());
		 
		 //service.shutdownNow();// 立即關閉,若仍有執行緒在執行則會拋出 interrupted 例外
		 service.shutdown();
		 System.out.println("執行 shoutdwon");//平滑的關閉
		 
		 //監控 thread pool 的狀態
		while(!service.awaitTermination(1,TimeUnit.SECONDS)) {
			System.out.println("監控中....Thread pool 尚未關閉");
		}
		System.out.println("Thread pool 已關閉");
		 

	}

}
