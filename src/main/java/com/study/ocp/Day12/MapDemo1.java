package com.study.ocp.Day12;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {

	public static void main(String[] args) {
		 Map<String, Integer> map =new LinkedHashMap<>();
		 map.put("國文",100);
		 map.put("英文",100);
		 map.put("數學",90);
		 map.putIfAbsent("數學",80); //若Key 值不存在才加入
		 map.put("數學",80);//若key值存在會覆蓋
		 System.out.println(map);
		 
		//抓所有的key值
		 Set<String> keys =map.keySet();
		 System.out.println(keys);
		//抓所有的value值
		 Collection values = map.values();
		 System.out.println(values);
		 //抓 key-value 的組合-->entrySet
		 Set<Map.Entry<String,Integer>> entrySet= map.entrySet();
		 System.out.println(entrySet);
		 //輪詢裡面的資料 透過Key來取得value
		 for(String key:keys) {
			 System.out.println(key+"=" + map.get(key));
			 
		 }
		 //輪詢透過enterSet 來取得 key-value 的組合
		 for(Map.Entry<String, Integer> entry:entrySet) {
			 System.out.println(entry.getKey() + "=" + entry.getValue());
		 }
		 //輪詢-java8 stream
		 map.entrySet()
		 .stream()
		 .forEach(entry ->System.out.println(entry.getKey()+ "=" + entry.getKey()));
		 
		 //
		 System.out.println(map.containsKey("國文"));//key是否有國文"
		 System.out.println(map.containsValue("100"));//value是否有100"
		 
		 
		 
	}

	 

}
