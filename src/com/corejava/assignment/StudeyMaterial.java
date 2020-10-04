package com.corejava.assignment;

public class StudeyMaterial {
	
	final Trainee trainee;
	String materialname;
	String coursename;
	
	public StudeyMaterial(String materialname, String coursename,Trainee trainee) {
		super();
		this.materialname = materialname;
		this.coursename = coursename;
		this.trainee=trainee;
	}
	public void Read() {
		trainee.work();
		System.out.println("The trainee is reading a Study material");
	}


	public static void main(String[] args) {
		Trainee t=new Trainee();
		StudeyMaterial sd=new StudeyMaterial("core java", "java", t);
		sd.Read();
		

	}

}
