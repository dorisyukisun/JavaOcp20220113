package com.study.ocp.day23;

import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	public static void main(String[] args) {
		Path path = Paths.get("src\\main\\java\\com\\study\\ocp\\day23\\PathDemo.java"); //相對路徑
		//Path path = Paths.get("");//絕對路徑
		System.out.println(path);
		System.out.printf("getFileName:%s\n",path.getFileName());
		System.out.printf("getParenet:%s\n",path.getParent());
		System.out.printf("getRoot:%s\n",path.getRoot());
		
		//subPath (from, to )範圍 from <-path<to
		System.out.printf("subpath(0,2):%s\n",path.subpath(0, 2));
		
		//判斷路徑是絕對或是相對路徑
		System.out.printf("isAbsolute():s%\n",path.isAbsolute());
		if(!path.isAbsolute()) {
			//取得絕對路徑
			System.out.println(path.toAbsolutePath());
		}
		//換成 url格式
		URI uri = path.toUri();
		System.out.println(uri);
		
		

	}

}
