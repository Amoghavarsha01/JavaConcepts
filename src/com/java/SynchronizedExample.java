package com.java;

public class SynchronizedExample implements Runnable{
	int x, y;
	public static void main(String[] args) {
		SynchronizedExample sync = new SynchronizedExample();
		Thread t1 = new Thread(sync);
		Thread t2 = new Thread(sync);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			synchronized (this) {
				x = 12;
				y = 12;
			}
			
		}
		System.out.println("x " + x + " y " + y );
	}

}
