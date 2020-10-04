package com.corejava.assignment;

public class Company1 {
	
	String Companyname;
	
	Employee1 employee1;
	public Company1(String companyname, Employee1 employee1) {
		super();
		Companyname = companyname;
		this.employee1 = employee1;
		System.out.println("Company name ::"+companyname);
		System.out.println("Employee id ::"+employee1.empid);
		System.out.println("Employee name ::"+employee1.empname);
		System.out.println("Rating :: "+employee1.rating);
		System.out.println("Start year ::"+employee1.startyear);
		
		
	}



	public static void main(String[] args) {
		
		Employee1 e=new Employee1(100, 4.5, 2020, "prashnth");
		Company1 c=new Company1("Techouts", e);

	}

}
