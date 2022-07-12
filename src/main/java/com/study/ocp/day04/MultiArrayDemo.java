package com.study.ocp.day04;

public class MultiArrayDemo {

	public static void main(String[] args) {
		 char[][] ttt = {
				 {'o','x','o'},
				 {' ','x','x'},
				 {'o',' ','o'}
				 
		 };
		 
		 System.out.println(ttt);
		 System.out.println(ttt[0]);
		 System.out.println(ttt[1]);
		 System.out.println(ttt[2]);
		 //如何讓Ｘ獲勝？
		 ttt[1][0] = 'x';
		 System.out.println(ttt[0]);
		 System.out.println(ttt[1]);
		 System.out.println(ttt[2]);
		 

	}

}
