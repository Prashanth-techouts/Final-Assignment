package com.corejava.assignment;

import java.util.Scanner;

class A implements Company{
	@Override
	public String getcompanydetails(String company, double profit) {
		 String c=company;
		double p=profit;
		return company;
	}
	
}
public  class CompanyDetails   {
	
	public static String company;
	public static double costprice;
	public static double sellingprice;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the company name");
		company=sc.nextLine();
		System.out.println("enter the cost price");
		costprice=sc.nextDouble();
		System.out.println("enter the selling price");
		sellingprice=sc.nextDouble();
		
		Company obj=new A();
		obj.calculateprofit(costprice, sellingprice);
		Company.Companyname(price);
		
		Company c=(String companyname,double profit)->{
		System.out.println("Comapany name="+companyname+" "+"Profit="+profit);
		return companyname;
		};
		
	c.getcompanydetails(c,profit);
	}

}