package com.corejava.assignment;

public class Threadproperties implements Runnable {

	
	public static void main(String[] args) {
		Threadproperties tdp=new Threadproperties();
		Thread t1=new Thread(tdp);
		t1.setName("prashanth");
		System.out.println("state of thread1 after creating it ="+t1.getState());
		
		t1.setPriority(10);
		t1.setDaemon(true);
		Thread t2=new Thread(tdp);
		t2.setPriority(5);
		System.out.println("state of thread2 after creating it ="+t2.getState());
		
		Thread t3=new Thread(tdp);
		t3.setPriority(1);
		System.out.println("state of thread3 after creating it ="+t3.getState());
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("state of thread1 after start method  ="+t1.getState());
		System.out.println("state of thread2 after start method ="+t2.getState());
		System.out.println("state of thread3 after start method ="+t3.getState());
		try {
			t1.sleep(1000);
			System.out.println("state of thread1 after sleep method  ="+t1.getState());
			t2.sleep(200);
			System.out.println("state of thread2 after sleep method="+t2.getState());
			t3.sleep(300);
			System.out.println("state of thread3 after sleep method="+t3.getState());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void run() {
		System.out.println("the current thread name is ="+Thread.currentThread().getName());
		System.out.println("the current thread priority is ="+Thread.currentThread().getPriority()+" "+"the current thread is daemon or not =" +Thread.currentThread().isDaemon());
		
	}

}
