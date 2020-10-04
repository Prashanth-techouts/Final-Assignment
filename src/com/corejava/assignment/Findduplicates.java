package com.corejava.assignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Findduplicates {
	
	public void duplicates(int[] arr) {
		HashMap<Integer,Integer> m=new HashMap<>();
		
		for (int element : arr) 
	    {   
	        if(m.get(element) == null)
	        {
	            m.put(element, 1);
	        }
	        else
	        {
	            m.put(element, m.get(element)+1);
	        }
	    }
	         
	    Set<Entry<Integer, Integer>> entrySet = m.entrySet();
	         
	    for (Entry<Integer, Integer> entry : entrySet) 
	    {               
	        if(entry.getValue() > 1)
	        {
	            System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
	        }
	    }
	}
	
	public static void main(String[] args) {
		Findduplicates fd=new Findduplicates();
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the  10 elememnts");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		fd.duplicates(arr);
	}

}
