package com.example.javaprothreadingnotes.test2;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
			Set<String> set = new HashSet<>();
		System.out.println("Empty!");
		System.out.println("================");
		set.add("dog");
			set.add("cat");
			set.add("mouse");
			set.add("snake");
			set.add("bear");
			if(set.contains("cat")) {
				System.out.println("Contains cat");
				System.out.println("================");
			}
			set.remove("cat");
			for (String element : set) {
			    System.out.println(element);
			}
	}

}
