package com.study.ocp.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set set= new HashSet(); //LinkedHashSet();
		set.add("國文");
		set.add("100");
		set.add("數學");
		set.add(null);
		set.add("英文");
		set.add("80");
		//[80,100,國文,英文,90,數學]
		System.out.println(set);
		//求總分 ＝？
		
		int sum=0;
		int sum2=10;
		
		Iterator iter =set.iterator();
		//尋訪每一個元素
		while(iter.hasNext()) {
			Object object =iter.next();
			System.out.printf("%s %s\n",object,
			object == null?null:object.getClass());
			//將null移除
			if(object == null) {
				iter.remove();
			}
			//將Integer的元素過濾出並且相加
			if(object != null && object.getClass() == Integer.class) {
				 sum += (Integer)object;
				
			}
			//利用 instanceof 來判斷型別
			if(object instanceof Integer) {
				sum2 += (Integer)object;
			}
		}
		System.out.println(set);
		/*System.out.println(iter.hasNext());//hasNext是判斷下面有沒有資料
		System.out.println(iter.next());//不做next不會出現資料*/
		
	}

}
