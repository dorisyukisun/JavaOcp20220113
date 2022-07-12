package com.study.ocp.day07;

public class CalcDemo {
	public int add (int x, int y ) {
		return x+y;
	}
	public int  add (int x, int y, int z)
	{
		return x+y+z;
	}
	public int add (int...nums) {//....找不到兩個參數的話才會處理
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			
			sum += nums[i];
		}
		return sum;
	}
	public static void main (String[] agrs)
	{
		CalcDemo calc =new CalcDemo();
		System.out.println(calc.add(10,20));
		System.out.println(calc.add(10,20,30));
		System.out.println(calc.add(10,20));
		int [] nums= {10,20,30,40,50};
		System.out.println(calc.add(nums));
		
		
	
	}
	
	
}
