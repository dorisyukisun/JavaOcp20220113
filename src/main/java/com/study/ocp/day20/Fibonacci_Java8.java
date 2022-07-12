package com.study.ocp.day20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci_Java8 {

	public static void main(String[] args) {
		 
		//Stream.iterate(0, n-> n+1).limit(10).forEach(System.out::println);
		//設定公用pool大小
	    int proc=Runtime.getRuntime().availableProcessors();
		System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism",String.valueOf(proc));
		int a =50; //第五十項
		
		List<Long> fib=Stream.iterate(new long[] {0,1},n-> new long [] {n[1],n[0]+n[1]})
		 .parallel()
		 .limit(7+1)
		 .peek(n ->System.out.println(Arrays.toString(n)))
		 .map(n -> n[0])
		 .collect(Collectors.toList());
		
		System.out.println(fib);
		System.out.println(fib.get(a));

	}

}
