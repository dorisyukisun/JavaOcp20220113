package com.study.ocp.Day12;

public class Fruit {
	private String name;
	private int qty;
	private int price;
     
	public Fruit() {
		
	}
	
	public Fruit(String string, int i, int j) {
		this.name=name;
		this.qty=qty;
		this.price=price;
	}
	
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "fruit [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
}
