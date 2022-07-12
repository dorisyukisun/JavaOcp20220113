package com.study.ocp.day02;

public class MathUtils {
	
    //計算總和
	 public static int getSum(int[] nums) {//ArrayDemo3
		 int sum=0;
		 for(int i=0;i<nums.length;i++) {
			 sum += nums[i];
			 
		 }
		return sum;
	}
	 public static double getSum(double[] nums) { //ArrayDemo4
		 double sum=0;
		 for(int i=0;i<nums.length;i++) {
			 sum += nums[i];
		
		 }
		 return sum;
	 }
	 
	 //計算平均
	 public static double getAvg(int[] nums) { //Array Demo 3
		 int sum =getSum(nums);
		 double avg = (double) sum /nums.length;
		 return avg;
		 
	 }
	 public static double getAvg(double[] nums) //Array Demo 4
	 {
		 double sum =getSum(nums);
		 double avg =(double) sum/nums.length;
		 return avg;
	 }
	 //計算標準差
	 public static double getSD(int[] nums) { //ArraysDemo 3 
		 double avg =getAvg(nums);
		 //平方和累加
		 double asum =0;
		 for(int i=0;i <nums.length;i++) {
			 asum += Math.pow(nums[i]-avg,2);
			 
		 }
		 //SD 標準差
		 double sd =Math.sqrt(asum /nums.length);
		 return sd;
		 
	 }
	 public static double getSD(double[] nums) { // Arraydemo4
		 double avg =getAvg(nums);
		 //平方和累加
		 double asum =0;
		 for(int i=0;i <nums.length;i++) {
			 asum += Math.pow(nums[i]-avg,2);
			 
		 }
		 //SD 標準差
		 double sd =Math.sqrt(asum /nums.length);
		 return sd;
		 
	 }
	 //變異係數
	 public static double getCV(double[] nums) {
		 double cv = getSD(nums)/getAvg(nums);
		 return cv;
	 }

}
