package com.corejava.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}  
public class Collectorclassex {

	public static void main(String[] args) {
	
		List<Product>productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        Long noOfElements = productsList.stream()  
                               .collect(Collectors.counting());  
        System.out.println("Total elements : "+noOfElements);
        
        Double sumPrices =   
                productsList.stream()  
                            .collect(Collectors.summingDouble(x->x.price));   
        System.out.println("Sum of prices: "+sumPrices);  
        Integer sumId =   
                productsList.stream().collect(Collectors.summingInt(x->x.id));  
        System.out.println("Sum of id's: "+sumId); 
        
        Double average = productsList.stream()  
                .collect(Collectors.averagingDouble(p->p.price));  
        System.out.println("Average price is: "+average); 
        
        List<Integer>pricelist=new ArrayList<>();
        pricelist.add(12000);
        pricelist.add(14000);
        pricelist.add(5000);
        pricelist.add(200);

        Optional<Integer> maximumprice =   
        		pricelist.stream().collect(Collectors.maxBy(Integer::compareTo));   
        	System.out.println("The maximum price of list is = "+maximumprice);  
        	
        	
        	Optional<Integer> minprice =   
            		pricelist.stream().collect(Collectors.minBy(Integer::compareTo));   
            	System.out.println("The minimum price of list is = "+minprice); 
	}

}
