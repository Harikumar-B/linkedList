package com.neo.JavaApp;

public class Swapping {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("before swapping");
		System.out.println("x value is:" + x);
		System.out.println("y value is:" + y);
		System.out.println("after swapping......");
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x value is:" + x);
		System.out.println("y value is:" + y);
	}

}
