package com.corejava.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckDate {

		Date d1=new Date();
		public void checkingdate(String date)  {
			
			
			try {
				Date  d=new SimpleDateFormat("dd/MM/yyyy").parse(date);
				
			System.out.println(d);
			
				if(d.before(d1)) {
					System.out.println("the input date is earlier to present date");
				}
				 if(d.equals(d1)) {
					System.out.println("the input date is Same as present date");
				}
				 if (d.after(d1)) {
					 System.out.println("the input date is after to present date");
				 }
				 
				 SimpleDateFormat d2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String d3= d2.format(d);
				System.out.println(" ");
				 System.out.println(d3);
				 
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			
		}
		
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your date in YYYY/MM/DD HH:mm:ss");
		String date=scan.nextLine();
		CheckDate cd=new CheckDate();
		cd.checkingdate(date);
	}

}
