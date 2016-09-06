package com.neo.JavaApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LLReverse {
	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("java");
		l.add("mava");
		l.add("c");
		l.add("c++");
		l.add("sql");
		l.add("java");
		System.out.println(l);
		// print reverse order
		Collections.reverse(l);
		System.out.println(l);
		// based on sorting
		Collections.sort(l);
		System.out.println(l);
		//print strings without duuplicates
		Set<String> s = new LinkedHashSet<String>(l);
		System.out.println(s);
		
		System.out.println("print dpllicate elements");
	
		String[] arr={"java","spring","java","sql","c","sap","sap"};
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i].equals(arr[j]))
					
				System.out.println(arr[j]);
					
			//else System.out.println();
					
		}
		}
		/*Set<String> ele= new HashSet<String>();
		for( String e:arr)
		{
			if(ele.add(e)==false)
			{
				System.out.println("founded duplicate element is:"+e);
			}
		}*/

	}
}
