package com.corejava.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterationtypes {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("hello");
		al.add("i am ");
		al.add("prashanth");
		al.add("currently");
		al.add("under");
		al.add("training");
		System.out.println("****using itertaor****");
		System.out.println(" ");
		Iterator<String> i=al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());	
		}
		System.out.println(" ");
		System.out.println("***using List Iterator***");
		ListIterator<String> li=al.listIterator();
		while(li.hasNext()) {
		System.out.println(li.next());
	}
		li.set("under");
		li.add("hello"); 
		System.out.println(li.hasNext()); 
		System.out.println(li.hasPrevious()); 
		System.out.println();
		
		System.out.println("******");
			
			ListIterator<String> li1=al.listIterator(al.size());
			while(li1.hasPrevious()) {
			System.out.println(li1.previous());
			
		}
			System.out.println(li.previousIndex());
		
	}

}
