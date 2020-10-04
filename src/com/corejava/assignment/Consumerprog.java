package com.corejava.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumerprog {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); 
        for (int i = 1; i <=10; i++) {
			list.add(i);
		} 
  
		Consumer<List<Integer> > modify = list1 -> 
        { 
            for (int i = 0; i < list.size(); i++) 
               System.out.println( list.set(i, 2 * list.get(i))); 
        }; 

        Consumer<List<Integer> > 
        dispList = list2 -> list.stream().forEach(a -> System.out.print(a + " ")); 
       
        modify.andThen(dispList).accept(list);
        
        //Neglecting between 3 and 7
        
        List<Integer> list1 = new ArrayList<>(); 
        for (int i = 1; i <=10; i++) {
        
        	if (i<3 || i> 7) {
			list1.add(i);
        	}
		} 
        Consumer<List<Integer> >  neglectList = list3 ->
        {
        	for (int i = 0; i <list1.size(); i++) {
        		 {
        			System.out.println(list1.get(i));
        		}	
			}
    	
        };
     
        System.out.println(" ");
       neglectList.accept(list1);
  
	}

}
