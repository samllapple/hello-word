package com.koal;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.insert(1, "d");
		System.out.println(sb);
		System.out.println("===============");
		sb = sb.reverse();
		System.out.println(sb);
		sb = sb.delete(0, 3);
		System.out.println("=============");
		System.out.println(sb);
		StringBuilder replace = sb.replace(0, 1, "c");
		System.out.println(replace);
		StringBuilder append = sb.append("defgh");
		System.out.println(append);
		StringBuilder reverse = sb.reverse();
		System.out.println(reverse);
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer append2 = sb1.append("bcaaad");
		System.out.println(append2);
		int indexOf = sb1.indexOf("a");
		System.out.println(indexOf);
		StringBuffer replace2 = sb1.replace(0, 2 ,"f");
		System.out.println(replace2);
		StringBuffer replace3 = sb1.replace(0, 1, "efd");
		System.out.println(replace3);

	}

}
