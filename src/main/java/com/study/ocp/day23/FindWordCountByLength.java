package com.study.ocp.day23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindWordCountByLength {

	public static void main(String[] args) {
		// 印出每個長度的單字數量
		Path path = Paths.get("src/main/java/com/study/ocp/day23/words.txt");
		try(Stream<String> lines = Files.lines(path)){
			
			lines//.filter(w -> w.length()>20)
			     .collect(Collectors.groupingBy(String::length,Collectors.counting()))
			     .forEach((k,v)-> System.out.println(k+ ":"+v));
			    
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("數量由大到小排序");

		try(Stream<String> lines = Files.lines(path)){
			
			lines.collect(Collectors.groupingBy(String::length,Collectors.counting()))
				.entrySet()
				.stream()
				//.sorted(a,b)->(int)(b.getValue() -a.getValue())
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println); 
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	

}
