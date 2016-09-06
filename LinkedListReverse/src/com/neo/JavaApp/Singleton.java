package com.neo.JavaApp;

public class Singleton 
{
	private static Singleton single;
	static{
		single=new Singleton();
	}
	private Singleton()
	{		
	}
	/*public static void  singletonTest()
	{
		System.out.println("singleton obj created");
	}*/
	
	public static Singleton getInstance()
	{
		return single;
	}
	/*public static void main(String[] args) {
		Singleton s=getInstance();
		s.singletonTest();
	}*/

}
