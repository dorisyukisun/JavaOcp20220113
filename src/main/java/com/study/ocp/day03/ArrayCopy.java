package com.study.ocp.day03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		 int[] nums1 = {100,90,80};
		 System.out.println(Arrays.toString(nums1));
		 //指派
		 int [] nums2 = nums1;
		 System.out.println(Arrays.toString(nums2));
		 //Arrays.copyof()
		 int[] nums3 = Arrays.copyOf(nums1,nums1.length);
		 System.out.println(Arrays.toString(nums3));
		 //System.arraycopy(src,srcPos,dest,destPos,length)考！！
		 int [] nums4 =new int[10];
		 System.arraycopy(nums1,0,nums4,3,2);
		 //原始碼 native 直接呼叫java沒有直接實作arrayCopy "2"複製長度
		 System.out.println(Arrays.toString(nums4));
		 //clone()
		 int[] nums5 =nums1.clone();
		 System.out.println(Arrays.toString( nums5));
		 
		 

	}

}
