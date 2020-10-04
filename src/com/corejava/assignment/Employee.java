package com.corejava.assignment;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.Generated;


public class Employee {
	
	public void createfile() {
		File file = new File("files\\music.txt");   
		boolean result = false;  
		  
		try {
			if(result)       
			{
			System.out.println("file created "+file.getCanonicalPath());
			}
			else  
			{  
			System.out.println("File already exist at location: "+file.getCanonicalPath());  
			} 
		} catch (IOException e) {
			
			e.printStackTrace();
		}   
		 
		 
	}
public void readfile() throws IOException {
	FileReader fr;
	try {
		fr = new FileReader("files\\abc.txt");
		int i;    
	    while((i=fr.read())!=-1)    
	    System.out.print((char)i);    
	    fr.close();    
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}    
    
		
	}
public void writefile() {
	
	FileWriter writer;
	try {
		writer = new FileWriter("files\\techout.txt");
		BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("the data in this file is written by using write file method Employee class.");  
	    buffer.close();  
	    System.out.println("Success");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
      
    }  
	
}

