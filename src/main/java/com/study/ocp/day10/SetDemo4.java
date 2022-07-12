package com.study.ocp.day10;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo4 {

	public static void main(String[] args) {
		SortedSet <Integer>treeSet =new TreeSet<>(); 
		
		//輸入資料
		treeSet.add(5);
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(9);
		treeSet.add(6);
		treeSet.add(8);
		
		System.out.println("原始的sorted元素資料");
		System.out.println(treeSet);
		  
		//讀取元素
		for(Integer number :treeSet) {
			System.out.println(number);
		}

	}

}
