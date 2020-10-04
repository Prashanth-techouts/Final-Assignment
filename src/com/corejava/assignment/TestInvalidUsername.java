package com.corejava.assignment;

import java.util.Scanner;

public class TestInvalidUsername {
	
	public void validate(String str) {
		if(str.length()<10 || str.contains("&")) {
			System.out.println("Invalid username .username should contain 10 characters and should not contain any special characters");
		}
		else {
			System.out.println("welcome");
		}
	}

	
	public static void main(String[] args) {
		TestInvalidUsername user=new TestInvalidUsername();
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your name");
		String str=sc.next();
		user.validate(str);

	}

}
