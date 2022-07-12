package com.study.ocp.day09;

public class PositionDemo {

	public static void main(String[] args) {
		 printSalary(Position.一般員工);
		 printSalary(Position.副總);

	}
	
	public static void printSalary(Position pos) {
		switch (pos) {
		case 一般員工:
			System.out.println("400000");
			break;
			
	 	case 經理 :
	 		System.out.println("700000");		
			break;
		case 副總:
			System.out.println("1000000");
			break;
			
		case 總經理:
			System.out.println("10000000");
			break;

		 
		}
		
	}

}
