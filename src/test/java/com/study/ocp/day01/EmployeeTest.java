package com.study.ocp.day01;

import java.util.Date;


public class EmployeeTest {

	public static void main(String[] args) {
	   Employee e1 = new Employee();
	   e1.name = "john" ;
	   e1.birth = new Date();
	   e1.salary =50000;
	   
	   System.out.printf("name:%s birth:%s salary:%s,d 工作：",e1.name,e1.birth,e1.salary);
	   
	   e1.job();
	}

}
