package com.corejava.assignment;

import java.util.TreeSet;

public class TreesetEx {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("hello");
		ts.add("HELLO");
		ts.add("ram");
		ts.add("laxman");
		ts.add("RAM");
		
		for (String string : ts) {
			System.out.println(string);
		}
		TreeSet<Integer> ts1=new TreeSet<>();
		ts1.add(10);
		ts1.add(20);
		ts1.add(30);
		ts1.add(10);
		
		for (Integer i : ts1) {
			System.out.println(i);
		}

	}

}
