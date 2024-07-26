package com.graymatter;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnGenerics<T> {
	
//	public int add(int i1, int i2)
//	{
//		return i1+i2;
//	}
//	
//	public double add(double d1, double d2)
//	{
//		return d1+d2;
//	}
//	
//	public String add(String s1, String s2)
//	{
//		return s1+s2;
//	}

//	public T add(T a,T b)
//	{
//		if(a instanceof Integer)
//			return (T)(Integer)((Integer)a + (Integer)b);
//		else if( a instanceof String)
//			return (T)(String)((String)a + (String)b);
//		else
//			return null;
//			
//		}
	
	public static <T> void printDetails(Collection<T> collection)
	{
		for(T t:collection)
			System.out.println(t);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		DemoOnGenerics<Integer> dgInt = new DemoOnGenerics();
//		System.out.println(dgInt.add(1, 2));
//		DemoOnGenerics<String> dgStr = new DemoOnGenerics();
//		System.out.println(dgStr.add("hello", "world"));
		
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("hello");
		alist.add("world");
		alist.add("arrays");
		alist.add("list");
		System.out.println(alist);
		printDetails(alist);
		
		System.out.println("------------------------");
		ArrayList<Integer> ilist = new ArrayList<Integer>();
		ilist.add(10);
		ilist.add(20);
		ilist.add(30);
		printDetails(ilist);
		
		

	}

}
