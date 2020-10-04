package com.corejava.assignment;

import java.io.File;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		File myfile = new File("files\\Emplyeedetails.txt");
		
    	//making the file read only
    	boolean flag = myfile.setReadOnly();	
    	if (flag==true)
    	{
    	   System.out.println("File successfully converted to Read only mode!!");
    	}
    	else
    	{
    	   System.out.println("Unsuccessful Operation!!");
    	}
    }

	}


