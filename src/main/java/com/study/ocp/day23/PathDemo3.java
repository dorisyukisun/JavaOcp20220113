package com.study.ocp.day23;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo3 {

	public static void main(String[] args) {
		// 路徑比較
		Path path1 =Paths.get("");
		Path path2 =Paths.get("");
		Path path3 =Paths.get("");
		System.out.println(path1.startsWith(path2));//起始是否相同
		System.out.println(path1.endsWith(path3));//結尾是否相同
		

	}

}
