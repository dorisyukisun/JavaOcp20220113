package com.study.ocp.day23;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo2 {

	public static void main(String[] args) {
		// -->冗餘路徑
		Path path = Paths.get("");
		System.out.println(path);
		path = path.normalize();//去除冗餘路徑
		System.out.println(path);
		//路徑切換 relativize Path 1 切到path 2 
		Path path1 = Paths.get("src/home/happy"); 
		Path path2 = Paths.get("src/home/foo/bar");
		//path1 切換到path2
		System.out.println(path1.relativize(path2));
		//path2 切換到path1
		System.out.println(path2.relativize(path1));
		//路徑結合 resolve
		Path aPath = Paths.get("/app/file");
		Path bPath = Paths.get("log/today");//相對路徑
		//apath 結合 bPath 
		System.out.println(aPath.resolve(bPath));//結合相對路徑
		
		Path cPath = Paths.get("/app/file");
		Path dPath = Paths.get("log/today");//絕對路徑
		//aPath 結合 bPath
		System.out.println(cPath.resolve(bPath));
		
		

	}

}
