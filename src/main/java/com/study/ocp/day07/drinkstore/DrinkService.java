package com.study.ocp.day07.drinkstore;

import java.util.Optional;
import java.util.Random;

public class DrinkService  {
		//	印出飲料的資料
		public void print(Drink drink) {
			System.out.printf("飲料名：%/s 價格:%\n",drink.getName(),drink.getPrice());
			
		}
		//隨機悅換飲料一杯
		public Optional<Drink> getRandomDrink() {
			Random r = new Random();
			Optional<Drink> drink = Optional.ofNullable(null);
			//Optional 是一個盒子裡面放了Drink 飲料
			switch (r.nextInt(4)) {// 0-10
			case 0:
			case 1:	
			case 2:	
				drink = Optional.of(new RedTea());
				break;
			case 3:
				drink = Optional.of(new Coffee());
				break;
			case 4:
			case 5:
				drink = Optional.of(new Milk());
				break;
			 
			 
			}
			return drink;
		}
}
