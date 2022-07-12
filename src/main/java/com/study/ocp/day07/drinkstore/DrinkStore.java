package com.study.ocp.day07.drinkstore;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Stream;

public class DrinkStore {

	public static void main(String[] args) {
		 // Redtea d1 = new RedTea(); 如果要實作開水煮紅茶的菜單
		 Drink d1 = new RedTea(); 
		 Drink d2 =new Coffee();// Drink 的規格裏面實際拿到咖啡
		 Drink d3 =new Milk();
		 
		 System.out.println(d1.getName());
		 System.out.println(d1.getPrice());
		 
		 Drink [] drinks = {d1,d2,d2,d2,d3,d3,};
		 //用java 8  stream 求總價與均價 =?
		 
		 IntSummaryStatistics stat = Stream.of(drinks).mapToInt(Drink::getPrice).summaryStatistics();
		 System.out.printf("總價:%,d 均價:%.1f\n",stat.getSum(),stat.getAverage());
		 
		 DrinkService service =new DrinkService();
		 service.print(d3);
		 Stream.of(drinks).forEach(d -> service.print(d));
		
		 //換獎
		 Optional<Drink> optDrink =service.getRandomDrink();
		 //請問我抽到的飲料名稱是？
		 if(optDrink.isPresent()) {
			 Drink drink = optDrink.get();
			 System.out.println(drink.getName()); 
		 }else {
			System.out.println("銘謝惠顧");
		}
		
		 
	}

}
