package com.study.ocp.day08_3;

public class Army {

	public static void main(String[] args) {
		 Tank tank = new Tank();
		 Truck truck = new Truck();
		 Fighter fighter = new Fighter();
		 
		 Car[] cars = {tank, truck};
		 Airplane[] airplanes = {fighter};
		 Weapon[] weapons = {tank, fighter};
		 
		 Object[] army = {cars,airplanes,weapons};
		 
		
		 
		 //試問加總元素有5個 要如何實作 ？homework
		 
		 

	}

}
