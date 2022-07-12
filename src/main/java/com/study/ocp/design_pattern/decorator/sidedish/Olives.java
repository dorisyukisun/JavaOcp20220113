package com.study.ocp.design_pattern.decorator.sidedish;

import com.study.ocp.design_pattern.decorator.Food;

public class Olives extends SideDish {

	public Olives(Food food) {
		super(food);
		name ="ˇ橄欖";
		price =10;
	}

}
