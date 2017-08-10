package com.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class MultiThreadingExample implements Runnable {
	Object obj = new Object();
	public static void main(String args[])
	        throws InterruptedException {
		
	        Thread t1 = new Thread(new MultiThreadingExample());
	        t1.start();
	        Thread t2 = new Thread(new MultiThreadingExample());
	        t2.start();
	        Thread t3 = new Thread(new MultiThreadingExample());
	        t3.start();
	    }

	@Override
	public void run() {
		Counter c1 = new Counter();
		int c2 = c1.getCounter();
		c1.increment();
		System.out.println("count" + c1.getCounter());
		
	}
	
}
