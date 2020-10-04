package com.corejava.assignment;

import java.util.Scanner;
public class Multithreadingoperations implements Runnable{
	
	public static int a;
	static int b;
	@Override
	public void run() {		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		Multioperations m=new Multioperations();
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				m.add(a,b);
				
			}
		}
				
		);
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				m.avg(0);
				
			}
		});
		Thread t3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				m.display(0, 0);
				
			}
		});
		t.setPriority(10);
		t2.setPriority(5);
		t3.setPriority(1);
		
		t.start();
		//t2.start();
		//t3.start();
		
		
	}

	

}
