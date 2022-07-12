package com.study.ocp.day06;

import java.util.ArrayList;
import java.util.function.Predicate;

 

public class PersonTest3 {

	public static void main(String[] args) {
		 Person p1  = new Person();
		 student s1 = new student("Vincent", 18,100);
		 student s2 = new student("Helen", 19,75 );
		 student s3 = new student("Bobo", 18,80);
		 Teacher t1 = new Teacher("Anita",28,70000);
		 Teacher t2 = new Teacher("Jane",28,650000);
		 
		 ArrayList<Person> persons = new ArrayList<>();
		 persons.add(p1);
		 persons.add(s1);
		 persons.add(s2);
		 persons.add(s3);
		 persons.add(t1);
		 persons.add(t2);
		 
		 //System.out.println (persons);
		 
		//排除異常資料 filter
		 
		 Predicate <Person> notNullFilter = p ->( p.getName() != null && p.getAge() !=null);
		 //先把空的排除再取出有內容的東西
		 
		 //請問 persons 的平均年齡 ＝？
		 
		 double avgOfAge=persons.stream()//先做forEach 然後在filter
			 //.filter(p -> p.getName() !=null)
			 //.filter(p ->p.getAge() !=null)
				.filter(notNullFilter)
			 //.peek(System.out::println)
			 .mapToInt(p -> p.getAge())
			 //.peek(System.out::println)
			 .average()
			 .getAsDouble();
		 //.forEach(System.out:: println);
		 System.out.printf("請問 persons 的平均年齡 ＝%.1f\n",avgOfAge);
		 
		 //請問平均分數 ＝？
		 double avgOfScore= persons.stream()
				 //.filter(p -> p.getName() !=null)
				 //.filter(p ->p.getAge() !=null)
					.filter(notNullFilter)
		 		.filter(p -> p.getClass().getSimpleName().equals("student"))
		 		//.mapToInt(p -> ((Student)p).getScore())
		 		.map(p -> (student)p)//將Person 物件轉換成 Student 物件
		 		.mapToInt(s-> s.getScore())//相當於 mapToInt(student::getScore)
		 		.peek(System.out::println)
		 		.average()
		 		.getAsDouble();
		 System.out.printf("請問平均分數＝％.1f\n",avgOfScore);
		 		
		 		//.forEach(System.out::println);
		 
		 //請問平均新資=?
		 double aveOfSalary = persons.stream()
				 .filter(p -> p.getName() !=null)
				 //.filter(p ->p.getAge() !=null)
					.filter(notNullFilter)
					.filter(p -> p.getClass().getSimpleName().equals("Teacher"))
					.map(p ->(Teacher)p)
					.mapToInt(Teacher::getSalary)
					.peek(System.out::println)
					.average()
					.getAsDouble();
		 System.out.printf("請問平均薪資＝％,.1f\n",aveOfSalary);
		 
		 //請問姓名總字數 =?
		 int sum = persons.stream().filter(notNullFilter)
				 .map(Person::getName)
				 //peek(System.out::println)
				 .mapToInt(String::length)
				//peek(System.out::println)
				 .sum();
		 System.out.printf("請問姓名總字數＝");
		 
		 
		 
	}

}
