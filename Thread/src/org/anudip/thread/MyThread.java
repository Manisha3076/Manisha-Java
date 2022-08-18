package org.anudip.thread;

public class MyThread extends Thread {
	
	
	
	public void run()
	{
		
		
		for(int i=4;i>=0;i--)
		{
			
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
		   
		}
	}
	

	public static void main(String[] args) {
		
		Thread t1=new MyThread();
		Thread t2=new MyThread();
		Thread t3=new MyThread();
			
		
		
		//t1.setDaemon(true);
		t1.start();
		
		
		t2.start();
		t3.start();
		
		
		
		System.out.println("t1  "+t1.getPriority());
		System.out.println("t2  "+t2.getPriority());
		System.out.println("t3  "+t3.getPriority());
		
		System.out.println("t1    "+t1.getState());
		System.out.println("t2    "+t2.getState());
		System.out.println("t3    "+t3.getState());
		
      
	}
	
	
}
