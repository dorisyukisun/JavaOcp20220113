package com.study.ocp.Day12;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.function.Function;


//分組 groupingBy
public class MapDemo3 {
	
	public static void main(String[] args) {
		 List<String> fruits = Arrays.asList("apple","apple","banana","orange","apple","papaya","watermelon","apple");
	//輸出:apple =3 orange=2 banana=1 papaya=1 watermelon=1
		 Map<String, Long> result = fruits.stream()
				 .collect(groupingBy(Function.identity(),counting()));//name-> name .counting()
		 System.out.println(result);
		 
		 Map<String, Long> result2 = fruits.stream()
				 .collect(groupingBy(x->x,counting()));//name-> name .counting()->sor
		 System.out.println(result2);
		 //輸出：apple-3, orange -2 watermelon=1 papaya=1 banana=1 (加入排序功能)
		 //排完之後要放到Map<String,Long> result3 =new LinkedHashMap<>();
		 
		 //正向排列
		 /*result2.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		 result2.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		 //反向排列
		 result2.entrySet().stream().sorted(Map.Entry.<String,Long> comparingByValue().reversed()).forEach(System.out::println);
		*/
		 
		 Map<String, Long> sortedMap =new LinkedHashMap<>();
		 result2.entrySet().stream()
		 //.sorted(Map.Entry.<String, Long> comparingByKey().reversed()) //反排序要加上(String,Long)
		 .sorted(Map.Entry.<String,Long>comparingByValue().reversed())//
		 .forEach(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
		 System.out.println(sortedMap);
		 
		// Vincent's code
			// homework: think about (oldValue, newValue) -> oldValue ?
			/*Map<String,Long> newMap = result2.entrySet().stream()
					.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		            .collect(toMap(Entry::getKey, Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
			System.out.println(newMap);
			*/
			
		 
		}
	
	}



