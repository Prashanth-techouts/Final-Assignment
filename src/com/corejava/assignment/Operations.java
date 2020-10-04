package com.corejava.assignment;

import java.util.Scanner;

public class Operations {
	
	public static final char PLUS='+';
	public static final char MINUS='-';
	public static final char MULTIPLY='*';
	public static final char DIVIDE='/';
	
	Scanner sc=new Scanner(System.in);
	public double calculate(double a, double b) {
		double first=a;
		double second=b;
		double result=0;
		System.out.println("please choose the operation Symbol from the list");
		System.out.println("1.Plus(+) 2.Subtraction(-) 3.Multiply(*) 4.Divide(/)");
		char c=sc.next().charAt(0);
		switch (c) {
		case PLUS:
			result=a+b;
			System.out.println("the sum is ="+result);
			break;
		case MINUS:
			result=a-b;
			System.out.println("the result is ="+result);
			break;
		case MULTIPLY:
			result=a*b;
			System.out.println("the result  is ="+result);
			break;
		case DIVIDE:
			result=a/b;
			System.out.println("the result is ="+result);
			break;

		default:
			System.out.println("AssertionError :please perform desired operation");
			break;
		}
		
		
		return result;
		
	}

	public static void main(String[] args) {
		
		Operations op=new Operations();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		double a=sc.nextDouble();
		System.out.println("Enter the second number");
		double b=sc.nextDouble();
		
		
		
		op.calculate(a,b);
		
		System.out.println("The result after Addition is="+a+b);
		System.out.println("The result after subtraction is="+(a-b));
		System.out.println("The Result after multiplication is="+(a*b));
		System.out.println("The Result after Division is="+(a/b));
	}

}
