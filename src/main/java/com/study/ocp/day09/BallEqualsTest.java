package com.study.ocp.day09;

public class BallEqualsTest {

	public static void main(String[] args) {
		 Ball b1 = new Ball ("Red", 100);
		 Ball b2 = new Ball ("Red", 100);
		 
		/* Ball b2 = b1;*///new Ball ("Red", 100); b1 和 b2 都指向同一個位置 
		 
		 System.out.println(b1);
		 System.out.println(b2);
		 System.out.println(b1== b2);
		 System.out.println(b1.equals(b2));
		 System.out.println(b1.hashCode());
		 System.out.println(b2.hashCode());

	}

}
