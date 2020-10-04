package com.corejava.assignment;

import java.io.FileOutputStream;

public class MultipleExceptions {
	
	public void Display() {
		try(    FileOutputStream fileOutputStream= new FileOutputStream("files\\abc.txt")){  
				      String msg = "Welcome to Techouts!";      
				        byte byteArray[] = msg.getBytes();      
				        fileOutputStream.write(byteArray);  
				        System.out.println("Data written successfully!");  
				}catch(Exception exception){  
				       System.out.println(exception);  
				}  
				finally{  
				       System.out.println("Finally executes after closing of declared resources.");  
				}  
	}

	public static void main(String[] args) {
		MultipleExceptions m=new MultipleExceptions();
		m.Display();
	    
		        try{    
		            int array[] = new int[10];    
		            array[10] = 30/0;    
		        }    
		        catch(ArithmeticException e){  
		           e.printStackTrace();  
		        }    
		        catch(ArrayIndexOutOfBoundsException e){  
		        	e.printStackTrace(); 
		        }    
		        catch(Exception e){  
		        	e.printStackTrace(); 
		        }    
		     }    
		}  
	


