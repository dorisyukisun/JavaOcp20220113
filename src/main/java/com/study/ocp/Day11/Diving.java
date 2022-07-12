package com.study.ocp.Day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Diving {

	public static void main(String[] args) {
		// 10,8,7,6,5,9,9,4,8,7
		//刪除最高與最低的兩個分數
		//求平均(小數點一位)
		List<Integer>list= Arrays.asList(10,8,7,6,5,9,9,4,8,7);
		System.out.println(list);
		Collections.sort(list);//排序
		System.out.println(list);
		List<Integer> list2 = new ArrayList<Integer>(list);
		list2.remove(0);
		list2.remove(0);
		list2.remove(list2.size()-1);
		list2.remove(list2.size()-1);
		System.out.println(list2);
		double avg =list2.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage();
		System.out.printf("%.1f\n",avg);
		
		
		

	}

	
}
