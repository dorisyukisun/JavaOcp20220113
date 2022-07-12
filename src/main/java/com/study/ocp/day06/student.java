package com.study.ocp.day06;

public class student extends Person {
	private Integer score;
	
	public student() {
		
	}
	public student(String name, Integer age,Integer score) {
			super.setName(name);
			super.setAge(age);
			this.setScore(score);
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
			
	 
	
	
}
