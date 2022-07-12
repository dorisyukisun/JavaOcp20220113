package com.study.ocp.day06;



public class PersonTest {

	public static void main(String[] args) {
		student s1 = new student();
		s1.setName("Vincent");
		s1.setAge(18);
		s1.setScore(100);
		
		Teacher t1 = new Teacher();
		t1.setName("Anita");
		t1.setAge(30);
		t1.setSalary(70000);
		
		System.out.println(s1);
		System.out.println(t1);
	}

}
