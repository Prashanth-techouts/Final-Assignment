package com.corejava.assignment;

public class Anonymousinnerex {
	
	private String name="prashanth";
	private String number="100";
	
	@Override
	public String toString() {
		return "Anonymousinnerex [name=" + name + ", number=" + number + "]";
	}

	public void performoperations() {
		Anonymousinnerex an=new Anonymousinnerex();
		System.out.println(an.hashCode());
		int n=Integer.parseInt(number);
		System.out.println(n);
		System.out.println(name.equals("prashanth"));
		System.out.println(name.equals("manikanata"));
	}

	public static void main(String[] args) {
		Anonymousinnerex an=new Anonymousinnerex();
		Vehicle v=new Vehicle() {
			
			@Override
			public void run() {
				System.out.println("this is the implemenmted method of interface vehicle");
				
			}
		};
		v.run();
		an.performoperations();
		System.out.println(an.hashCode());

	}

}
