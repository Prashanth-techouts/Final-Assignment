package com.corejava.assignment;

public class Multioperations {
	public void add(int a, int b) {
		int sum=a+b;
		System.out.println("sum method");
		System.out.println("the sum is"+sum);
		avg(sum);
		
		
	}
	public void avg(int sum) {
		int avg=sum/2;
		System.out.println("avg method");
		System.out.println("the average is"+avg);
		display(avg,sum);
		
	}
	public void display(int avg,int sum) {
		System.out.println("display method values");
		System.out.println("the sum is "+sum);
		System.out.println("the avg is"+avg);
	}

}
