package com.study.ocp.exam;

interface Foo{
	void eat();
}

public class Test {

	public static void main(String[] args) {
		 Foo foo =new Foo() {

			@Override
			public void eat() {
				System.out.println("Eat");
				
			}
			
			public  void play() {
				System.out.println("play");
			}
			 
		 };
		 foo.eat();
		 //((test$1)foo).play();

	}

}
