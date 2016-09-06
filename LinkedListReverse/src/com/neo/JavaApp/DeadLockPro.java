package com.neo.JavaApp;

public class DeadLockPro {
	String str1 = "toshibalaptop";
	String str2 = "purchased";
	Thread t1 = new Thread("my thread 1") {
		public void run() {
			while (true) {
				synchronized (str1) {
					try {
						t1.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (str2) {
						System.out.println(str1 + str2);
					}
				}
			}
		}
	};

	Thread t2 = new Thread() {
		public void run() {
			while (true) {
				synchronized (str2) {
					
					synchronized (str1) {
						System.out.println(str2 + str1);
					}
				}
			}
		}
	};

	public static void main(String[] args) {
		DeadLockPro dl = new DeadLockPro();
		dl.t1.start();
		
		dl.t2.start();
	}

}
