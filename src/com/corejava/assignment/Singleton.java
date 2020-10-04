package com.corejava.assignment;

public class Singleton {
	
	String name="this is a singleton class constructor";
	private static Singleton single_instance=null;
	
	private Singleton() { 
		System.out.println(name);
	}
	public static Singleton instance() {
		
		if (single_instance==null) {
			single_instance=new Singleton();
		}
		return single_instance;
		
	}
	

}
