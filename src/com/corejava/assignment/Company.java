package com.corejava.assignment;

public interface Company {

	public default double calculateprofit(double d1,double d2) {
		Double C_price=8000.00;
		Double S_price=10000.00;
		Double Profit=S_price-C_price;
		return Profit;
	}
	public static String Companyname(double calculateprofit1()) {
		String C_name="TEchouts";
		return C_name;
		
	}
	public abstract String getcompanydetails (String Companyname(); double calculateprofit());

}
