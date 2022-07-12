package com.study.ocp.day09;

public class Ball {
	private String color;
	private int price;
	
	public Ball() {
		
	}
	public Ball(String color, int price) {
		this.color =color;
		this.price =price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) { //轉型
		
		Ball b2 =(Ball)obj;
		if(b2.price == this.price && b2.color.equals(this.color))
		{ //b1和b2的價格跟顏色一定都要香鼎才可以通過檢核
			return true;
		}else {
		
		return false;
		}
	}
	/*@Override  -->使用eciplse 精靈產生 source> hashCode and equals 
	public int hashCode() {
		return 7 * 11 +  (price +color.hashCode());
		//兩個質 ＊沒有比較的數
	}*/
	 
	
	@Override
	public String toString() {
		return "Ball [color=" + color + ", price=" + price + "]";
	}

}
