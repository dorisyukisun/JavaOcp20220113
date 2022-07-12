package com.study.ocp.day08_2;

//public class EDog implements Dog { //要看需求決定要寫哪一個
  public class EDog extends ADog{

	@Override
	public void eat() {
		System.err.println("吃電");
		
	}

	@Override
	public void skill() {
		System.out.println("玩");
		
	}
	
	

}
