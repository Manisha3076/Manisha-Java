package org.anudip.thread;

public class MyRunnable implements Runnable {
	
	public void run()
	{
		for(int i=4;i>=0;i--)
		{
			System.out.println(Thread.currentThread().getName()+"   Running.....");
			System.out.println(i);
			try {
			      Thread.sleep(500);
			    
			    
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
		
	}

	public static void main(String[] args) {
		
		Runnable r=new MyRunnable();
		
		
		Thread th1 =new Thread(r,"MyThread1");
		Thread th2 =new Thread(r,"MyThread2");
		Thread th3 =new Thread(r,"MyThread3");
		
		
		th1.start();
		try
		{
		  th1.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		
		
		th2.start();
		try
		{
		  th2.join();
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
		
		th3.start();
		
		
		

	}

}
