package com.corejava.assignment;

public class Singletonmain {

	public static void main(String[] args) {
		Singleton s=Singleton.instance();
		Singleton s1=Singleton.instance();
		
		System.out.println(s);
		System.out.println(s.name);
		System.out.println(s1);
		System.out.println(s1.name);

	}

}
