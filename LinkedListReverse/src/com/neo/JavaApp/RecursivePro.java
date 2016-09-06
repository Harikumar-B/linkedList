package com.neo.JavaApp;

public class RecursivePro {
	public static void main(String[] args) {
		System.out.println(reverse("java"));
		System.out.println(reverse1("879"));
	}

	public static String reverse(String arg0) {
		if(arg0==null) return null;
		String s="";
		for(int i=arg0.length()-1;i>=0;i--)
		{
			s+=arg0.charAt(i);
		}
		return s;
	}
	
	public static String reverse1(String arg0) {
		if(arg0==null) return null;
		String s="";
		for(int i=arg0.length()-1;i>=0;i--)
		{
			s+=arg0.charAt(i);
		}
		return s;
	}
	
	
	
	
}
