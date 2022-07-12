package com.study.ocp.day23;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.stream.Stream;


public class FindTop10 {

	public static void main(String[] args) {
		 //搜出 words.txt 字典內最長的10個單字
		Path path = Paths.get("src/main/java/com/study/ocp/day23/words.txt");
		try(Stream<String> lines = Files.lines(path)){
			
			   lines.filter(w -> w.length()>20)//先將資料先過濾 先分析
					//.sorted((o1,o2)-> o1.length()-o2.length())
			        .sorted(Comparator.comparingInt(String::length).reversed())
			        //String::length :: 的意思是將string 裡面的length方法帶出不用在寫第二次
					.limit(10)
					.forEach(w -> System.out.printf("%s(%d)%n",w,w.length()));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
