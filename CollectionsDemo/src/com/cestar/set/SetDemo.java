package com.cestar.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String>    books = new HashSet<>();
		
		books.add("Java");
		
		books.add("C Sharp");
		
		books.add("Python");
		
		books.add("Oracle");
		
		
		books.add("Python");
		
		
		System.out.println("================Using For Each Loop (Set)==============");
		for(String    book:          books) {
			
			System.out.print(book+"   ");
		}
		
		System.out.println();
		
		System.out.println("=======================Tree Set===================");
		
       Set<String>    books2 = new TreeSet<>();
		
		books2.add("Java");
		
		books2.add("C Sharp");
		
		books2.add("Python");
		
		books2.add("Oracle");
		
		
		books2.add("Python");
		for(String    book:          books2) {
			
			System.out.print(book+"   ");
		}
		
		System.out.println();
		System.out.println("==========================Using Iterator (Set) ====================");
		
		Iterator iter = books2.iterator();
		
		while(iter.hasNext()) {
			
			
			System.out.print(iter.next()+"   ");
		}
		
		System.out.println();
		
		System.out.println("==========================Using Lambda Expression -> ====================");
		
			
        books.forEach((book)->{
        	
        	System.out.print(book+"   ");
        });
        
       
		
		
		
		

	}

}
