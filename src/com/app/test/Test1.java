package com.app.test;

import java.lang.reflect.Array;
import java.util.*;

import app.com.core.Books;

public class Test1 {

	public static void main(String[] args) {
	
		ArrayList<Integer> listInt=new ArrayList<Integer>(Arrays.asList(10,20,40,50,60));
		Iterator<Integer> listIterator=listInt.iterator();
		
		//listInt.add(90);
		//listInt.sort(new );
		System.out.println(listInt.set(0, 90));
		/*
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		*/
		
		HashSet<Books> books=new HashSet<Books>();
		
		
	}

}
