package com.study.ocp.day16;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class lotteMachine {

	public static void main(String[] args)throws InterruptedException,ExecutionException {
		 System.out.println("取得 lotto數字");
		 FutureTask<Integer> task = new FutureTask<Integer>(new Lotto());
		 //建立一個執行序去執行
		 new Thread(task).start();
		 //取得lotto 數字
		 int number = task.get();
		 //印出
		 System.out.println(number);

	}

}
